package com.example.demo.model;

import java.util.ArrayList;

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
public class GPinEligibility {
	public String country;
	public ArrayList<GPinEligibilityForSource> gPinEligibilityForSource;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public ArrayList<GPinEligibilityForSource> getgPinEligibilityForSource() {
		return gPinEligibilityForSource;
	}
	public void setgPinEligibilityForSource(ArrayList<GPinEligibilityForSource> gPinEligibilityForSource) {
		this.gPinEligibilityForSource = gPinEligibilityForSource;
	}

}
