package com.howtoprogram.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class BasicDemoTest {
  private BasicDemo basicDemo;

  @BeforeAll
  static void setUpAll() {
	  System.out.println("BeforeAll");
  }
  
  @BeforeEach
  void setUp() {
	  System.out.println("BeforeEach");
  }
  
  @AfterEach
  void tearDown() {
	  System.out.println("AfterEach");
  }
  
  @AfterAll
  static void tearDownAll() {
	  System.out.println("AfterAll");
  }
  
  @Test
  void simpleTest() {
	  System.out.println("Simple Test");
	  assertEquals(true, true);
  }
  
  
  @Test
  @DisplayName("Prueba Demo")
  void testGetDemoString() {
    basicDemo = new BasicDemo();
    String expectedDemo = "Prueba";
    basicDemo.setDemoString(expectedDemo);
    assertEquals(expectedDemo, basicDemo.getDemoString());

  }

}
