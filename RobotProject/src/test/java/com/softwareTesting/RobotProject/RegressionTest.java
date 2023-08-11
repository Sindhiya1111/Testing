package com.softwareTesting.RobotProject;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class RegressionTest {

	Robot robot;
	
	  @BeforeEach
	    public void init() {
	        robot = new Robot();
	  }
	  
	  @Test 
	  public void testValidateInput_Regression_f() {
		  robot.validateInput(false, "f");
		  assertEquals(false, robot.isPass());
	  }
	  
	  @Test 
	  public void testValidateInput_Regression_D() {
		  robot.validateInput(true, "D");
		  assertEquals(true, robot.isPen_active());
	  }
	  
	  @Test 
	  public void testValidateInput_Regression_Q() {
		  robot.validateInput(false, "Q");
		  assertEquals(false, robot.isPass());
	  }
	  
	  
	

	
}
