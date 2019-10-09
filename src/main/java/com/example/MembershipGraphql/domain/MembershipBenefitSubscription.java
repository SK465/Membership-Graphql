package com.example.MembershipGraphql.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "membership_benefit_subscription", schema = "public")
public class MembershipBenefitSubscription {
	
	@Id
	private long memberSubscriptionId;
	private Member member;
	//private Membership membership;
	//private VisibilityScope visibilityScope;
	private String benefitKey;
	private String status;
	private Date startDate;
	private Date endDate;
	private String benefitRef;
	private Date cancelledDate;
	private String cancelledReason;
	private Boolean isActive;
	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;
	//private Set<BenefitSubscriptionAsset> benefitSubscriptionAssets = new HashSet<BenefitSubscriptionAsset>(0);
	private String correlationId;
	private String reinstateReason;

}
