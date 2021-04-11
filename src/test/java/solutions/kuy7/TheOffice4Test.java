package solutions.kuy7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class TheOffice4Test {
  @Test
  public void basic1() {
    assertEquals(1, TheOffice4.meeting(new char[] {'X', 'O', 'X'}));
  }

  @Test
  public void basic2() {
    assertEquals(0, TheOffice4.meeting(new char[] {'O','X','X','X','X'}));
  }

  @Test
  public void basic3() {
    assertEquals(2, TheOffice4.meeting(new char[] {'X','X','O','X','X'}));
  }

  @Test
  public void basic4() {
    assertEquals("None available!", TheOffice4.meeting(new char[] {'X','X','X','X','X'}));
  }
}