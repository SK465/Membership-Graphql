package com.example.MembershipGraphql.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Builder;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name="visibility_scope"
    ,schema="public"
)
public class VisibilityScope {

	@Id
    private long visibilityScopeId;
    private long clientId;
    private String visibilityScopeHash;
    private Boolean isActive;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
    private String correlationId;
}
