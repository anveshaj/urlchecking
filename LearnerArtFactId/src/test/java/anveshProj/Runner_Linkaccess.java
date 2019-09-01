package anveshProj;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/anveshProj/linkaccess.feature"},
							plugin = {"pretty"},
							glue = "anveshProj")

				
public class Runner_Linkaccess {

}
//package com.lexisnexis.presentation.runner.BISContentSystems;
//
//import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//
//@RunWith(Cucumber.class)
//
//@CucumberOptions(features = {
//		"src/test/resources/features/com/lexisnexis/presentation/BISContentSystems/RIS_CompanyProfiles.feature" }, plugin = {
//				"pretty", "html:target/Bibliography",
//				"json:target/Bibliography.json" }, glue = "com.lexisnexis.presentation")
//
//public class Runner_RIS_CompanyProfiles {
//
//}
