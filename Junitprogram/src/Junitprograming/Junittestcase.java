package Junitprograming;

import static org.junit.Assert.*;

import org.junit.Test;

public class Junittestcase {

  @Test
  public void test() {
    Junit Junit = new Junit();
    int result;
    result = Junit.add(20,30);
    assertEquals(50,result);
  }

}