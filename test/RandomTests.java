package test;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class RandomTests {
  @Test
  public void testA() {
    assertTrue(42 == 42);
  }

  public void testB() {
    assertTrue(6 * 8 == 42);
  }

  public void testC() {
    assertTrue(84 / 2 == 42);
  }
}
