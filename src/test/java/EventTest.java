import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event testEvent = new Event(10, "Chicken", "Alcohol", true);
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void newEvent_getsPeople_10() {
    Event testEvent = new Event(10, "Chicken", "Alcohol", true);
    assertEquals(10, testEvent.getPeople());
  }

  @Test
  public void newEvent_getsFood_Chicken() {
    Event testEvent = new Event(10, "Chicken", "Alcohol", true);
    assertEquals("Chicken", testEvent.getFood());
  }

  @Test
  public void newEvent_getsBeverage_Chicken() {
    Event testEvent = new Event(10, "Chicken", "Alcohol", true);
    assertEquals("Alcohol", testEvent.getBeverage());
  }

  @Test
  public void newEvent_getsBand_Chicken() {
    Event testEvent = new Event(10, "Chicken", "Alcohol", true);
    assertEquals(true, testEvent.getBand());
  }

  @Test
  public void getPrice_returnsPrice_100() {
    Event testEvent = new Event(10, "Chicken", "Alcohol", true);
    assertEquals(490, testEvent.getPrice());
  }

  @Test
  public void checkPeopleCoupon_returnIfEnoughPeople_False() {
    Event testEvent = new Event(10, "Chicken", "Alcohol", true);
    assertEquals(false, testEvent.checkPeopleCoupon());
  }
}
