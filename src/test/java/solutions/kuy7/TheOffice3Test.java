package solutions.kuy7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TheOffice3Test {

  @Test
  public void tests() {
    // assertEquals("expected", "actual");
    assertEquals("0", TheOffice3.broken("1"));
    assertEquals("01111111010010000001100110111", TheOffice3.broken("10000000101101111110011001000"));
    assertEquals("011101", TheOffice3.broken("100010"));
  }

}