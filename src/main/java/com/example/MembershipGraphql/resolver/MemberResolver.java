package com.example.MembershipGraphql.resolver;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.MembershipGraphql.dao.AddressDao;
import com.example.MembershipGraphql.dao.ServiceChannelAccountDao;
import com.example.MembershipGraphql.dao.VisibilityScopeDao;
import com.example.MembershipGraphql.domain.Member;
import com.example.MembershipGraphql.domain.MemberAddress;
import com.example.MembershipGraphql.domain.ServiceChannelAccount;
import com.example.MembershipGraphql.domain.VisibilityScope;

@Component
public class MemberResolver implements GraphQLResolver<Member> {
    
	@Autowired
	private AddressDao addressDao;
	@Autowired
	private VisibilityScopeDao visibilityScopeDao;
	@Autowired
	private ServiceChannelAccountDao serviceChannelAccountDao; 

	public MemberAddress getMemberAddress(Member member) {
		return addressDao.findByMemberId(member.getMemberId());
	}

    public VisibilityScope getVisibilityScope(Member member) {
    	return visibilityScopeDao.findById(member.getVisibilityScopeId()).get();
    }
    
    public List<ServiceChannelAccount> getServiceChannelAccount(Member member){
    	return serviceChannelAccountDao.findByMemberId(member.getMemberId());
    }
}
