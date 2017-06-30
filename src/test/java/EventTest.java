import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event testEvent = new Event(10, "Chicken", "Beer", true);
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void newEvent_getsPeople_10() {
    Event testEvent = new Event(10, "Chicken", "Beer", true);
    assertEquals(10, testEvent.getPeople());
  }

  @Test
  public void newEvent_getsFood_Chicken() {
    Event testEvent = new Event(10, "Chicken", "Beer", true);
    assertEquals("Chicken", testEvent.getFood());
  }

  @Test
  public void newEvent_getsBeverage_Chicken() {
    Event testEvent = new Event(10, "Chicken", "Beer", true);
    assertEquals("Beer", testEvent.getBeverage());
  }

  @Test
  public void newEvent_getsBand_Chicken() {
    Event testEvent = new Event(10, "Chicken", "Beer", true);
    assertEquals(true, testEvent.getBand());
  }


}
