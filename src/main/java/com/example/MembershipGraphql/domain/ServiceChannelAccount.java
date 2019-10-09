package com.example.MembershipGraphql.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
@Table(name="service_channel_account"
    ,schema="public"
)
public class ServiceChannelAccount {
	
	@Id
    private long serviceChAcId;
    private long memberId;
    private String channel;
    private String userId;
    private String credential;
    private String lastAccessValAt;
    private String lastAccessSuccessAt;
    private String lastAuthFailedAt;
    private long offestMinsToNxtLogin;
    private Boolean isActive;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
    private long visibilityScopeId;
    private String accessValidationCode;
}
