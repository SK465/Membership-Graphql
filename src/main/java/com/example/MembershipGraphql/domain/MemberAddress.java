package com.example.MembershipGraphql.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name="member_address"
    ,schema="public"
)
public class MemberAddress {
	 @Id
    private long memberAddressId;
	@Column(name="member_id") 
	private long memberId; 
    private String adressLine1;
    private String adressLine2;
    private String adressLine3;
    private String city;
    private String state;
    private String postalCode;
    private String countryCode;
    private Boolean isActive;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
    private long visibilityScopeId;
    
}
