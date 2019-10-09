package com.example.MembershipGraphql.resolver;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.MembershipGraphql.dao.MemberDao;
import com.example.MembershipGraphql.dao.VisibilityScopeDao;
import com.example.MembershipGraphql.domain.Member;
import com.example.MembershipGraphql.filter.MemberCriteriaFilter;
import com.example.MembershipGraphql.filter.MemberFilter;

@Component
public class Query  implements GraphQLQueryResolver {
    
	@Autowired
	private MemberDao memberDao;
	@Autowired
	private MemberCriteriaFilter memberCriteriaFilter;	
	@Autowired
	private VisibilityScopeDao visibilityScopeDao;

	public Member getMember(Long id) {
		return memberDao.findById(id).get();
	}
	
	public String getVisibilityScopeHashByMemberId(Long memberId) {
		return visibilityScopeDao.getVisibilityScopeHashByMemberId(memberId);
	}
	
	//PageRequest of(int page, int size)
	public List<Member> getAllMembers( int skip, int first){
		 return memberDao.findAll(PageRequest.of(skip, first)).getContent();
	}
	
	public List<Member> getFilteredMembers(MemberFilter filter, int skip, int first){
	    first = first==0 ? 20 : first;
		return memberCriteriaFilter.findByCriteria(filter, PageRequest.of(skip, first));
	}
	
	

	
}

