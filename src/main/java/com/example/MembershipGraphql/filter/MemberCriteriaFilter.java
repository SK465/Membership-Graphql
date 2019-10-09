package com.example.MembershipGraphql.filter;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import com.example.MembershipGraphql.dao.MemberDao;
import com.example.MembershipGraphql.domain.Member;



@Component
public class MemberCriteriaFilter {

	@Autowired
	private MemberDao memberDao;

	public List<Member> findByCriteria(MemberFilter criteria, Pageable pageable) {
		Page page = memberDao.findAll(new Specification<Member>() {
			@Override
			public Predicate toPredicate(Root<Member> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				List<Predicate> predicates = new ArrayList<>();
				if (criteria.getFname() != null) {
					predicates.add(criteriaBuilder
							.and(criteriaBuilder.like(root.get("fname"), "%" + criteria.getFname() + "%")));
				}
				if (criteria.getIsActive() != null) {
					predicates.add(
							criteriaBuilder.and(criteriaBuilder.equal(root.get("isActive"), criteria.getIsActive())));
				}
				return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
			}

		}, pageable);
		return page.getContent();    
	}
	
}
