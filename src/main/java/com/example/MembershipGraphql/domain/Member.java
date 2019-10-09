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
@Table(name="member"
    ,schema="public"
)
public class Member implements java.io.Serializable {

     @Id
     private long memberId;
     private long visibilityScopeId;
     private String title;
     private String fname;
     private String mname;
     private String lname;
     private String suffix;
     private Date dob;
     private String gender;
     private String memberNumber;
     private String emailId;
     private String phoneNnumber;
     private String nationalId;
     private String extMemberRef;
     private String preferences;
     private Date startDate;
     private Date endDate;
     private Boolean isActive;
     private String createdBy;
     private Date createdDate;
     private String updatedBy;
     private Date updatedDate;
     private String aofKey;
     private String mailingName1;
     private String mailingName2;
     private String salutation;
     private String correlationId;
     private Long languageId;
     private String memberGuid;
}