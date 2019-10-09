package com.example.MembershipGraphql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MembershipGraphql.domain.MemberAddress;


public interface AddressDao extends JpaRepository<MemberAddress, Long>{

	MemberAddress findByMemberId(Long id);
}
