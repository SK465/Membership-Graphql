package com.example.MembershipGraphql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.MembershipGraphql.domain.VisibilityScope;


public interface VisibilityScopeDao extends JpaRepository<VisibilityScope, Long>{

	@Query( value = "select visibility_scope_hash from visibility_scope where visibility_scope_id= (select visibility_scope_id from member where member_id=?1)", nativeQuery = true)
	public String getVisibilityScopeHashByMemberId(Long memberId);
}
