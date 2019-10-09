package com.example.MembershipGraphql.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.MembershipGraphql.domain.Member;


public interface MemberDao  extends JpaRepository<Member, Long>,JpaSpecificationExecutor<Member>{
		
}

