package com.example.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.example.demo.model.*;

/* Author
 * Date:
 */
@SpringBootApplication
public class Json2JavaApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(Json2JavaApplication.class, args);
		try {
			ObjectMapper om = new ObjectMapper();
			Root root = om.readValue(new File("Test2.json"), Root.class);// Config File Location ,Hardcoded now
			ArrayList<GPinEligibility> getgPinEligibilityArray = root.getgPinEligibility();

			System.out.println("Total Count of gPinEligibility > " + getgPinEligibilityArray.size());

			extractGPinEligibility(getgPinEligibilityArray);

		} catch (FileNotFoundException fe) {
			System.out.println("File Not Found,Please choose the correct File Path");
		} catch (org.springframework.boot.json.JsonParseException jpe) {
			System.out.println("Please check JSON Format");
		} catch (JsonMappingException jme) {
			System.out.println("Please check JSON mapping");
		} catch (Exception e) {
			System.out.println("YIKES!");
			e.printStackTrace();
		}
	}

	private static void extractGPinEligibility(ArrayList<GPinEligibility> myObjects) {
		for (GPinEligibility gPinEligibility : myObjects) {
			System.out.println("Country is " + gPinEligibility.getCountry());
			System.out.println("*******");

			ArrayList<GPinEligibilityForSource> getgPinEligibilityForSource = gPinEligibility
					.getgPinEligibilityForSource();

			extractGPinEligibilityForSource(getgPinEligibilityForSource);
			System.out.println("*******");
			System.out.println("*******");

		}
	}

	private static void extractGPinEligibilityForSource(
			ArrayList<GPinEligibilityForSource> getgPinEligibilityForSource) {
		for (GPinEligibilityForSource gPinEligibilityForSource : getgPinEligibilityForSource) {
			System.out.println("SourceCode " + gPinEligibilityForSource.getSourceCode());
			System.out.println("*******");
			extractEligibility(gPinEligibilityForSource);
		}
	}

	private static void extractEligibility(GPinEligibilityForSource gPinEligibilityForSource) {
		Eligibility eg = gPinEligibilityForSource.getEligibility();
		System.out.println("gPinInq " + eg.isgPinInq());
		System.out.println("gPinView " + eg.isgPinView());
		System.out.println("gPinSelfSelect " + eg.isgPinSelfSelect());
		System.out.println("gPinReminder " + eg.isgPinReminder());
		System.out.println("gPinUnlockInitiate " + eg.isgPinUnlockInitiate());
		System.out.println("gPinPips " + eg.isgPinPips());
		System.out.println("gPinPipsReset " + eg.isgPinPipsReset());
		System.out.println("gPinUnlock " + eg.isgPinUnlock());
		System.out.println("gPinValidate " + eg.isgPinValidate());
		System.out.println("gGetGlobalPin " + eg.isGetGlobalPin());
		System.out.println("LockPin " + eg.isLockPin());
	}

}
