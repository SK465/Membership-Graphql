package com.example.MembershipGraphql.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MembershipGraphql.domain.ServiceChannelAccount;


public interface ServiceChannelAccountDao extends JpaRepository<ServiceChannelAccount, Long>{

	public List<ServiceChannelAccount> findByMemberId(Long memberId);
}

