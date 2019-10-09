package com.example.MembershipGraphql.filter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class MemberFilter {
	 private String fname;
	 private Boolean isActive;
}
