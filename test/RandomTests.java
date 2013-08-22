package test;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class RandomTests {
  @Test
  public void testA() {
    assertTrue(42 == 42);
  }

  @Test
  public void testB() {
    assertTrue(6 * 7 == 42);
  }

  @Test
  public void testC() {
    assertTrue(84 / 2 == 42);
  }

  @Test
  public void testD() {
    assertTrue("coquetterie" == "classe");
  }
}
