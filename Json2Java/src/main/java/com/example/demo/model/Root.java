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
public class Root {
 
    public ArrayList<GPinEligibility> gPinEligibility;

	public ArrayList<GPinEligibility> getgPinEligibility() {
		return gPinEligibility;
	}

	public void setgPinEligibility(ArrayList<GPinEligibility> gPinEligibility) {
		this.gPinEligibility = gPinEligibility;
	}
}
