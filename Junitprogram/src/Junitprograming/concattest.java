package Junitprograming;

import static org.junit.Assert.*;

import org.junit.Test;

public class concattest {

  @Test
  public void test() {
    Junit junit = new Junit();
    String result = junit.concat("MS","Dhoni");
    assertEquals("MSDhoni",result);
  }
}