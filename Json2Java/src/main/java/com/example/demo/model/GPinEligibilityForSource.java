package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class GPinEligibilityForSource{
    public String sourceCode;
    public Eligibility eligibility;
	public String getSourceCode() {
		return sourceCode;
	}
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}
	public Eligibility getEligibility() {
		return eligibility;
	}
	public void setEligibility(Eligibility eligibility) {
		this.eligibility = eligibility;
	}
}