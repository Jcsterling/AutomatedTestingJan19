package com.bae.TravelWebsite;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
            
             glue = {"com.bae.TravelWebsite"},
             features = "C:\\Users\\Admin\\eclipse-workspace\\desktop\\TravelWebsite")

public class Runner {

}
