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
  public void setPrice_returnsPrice_490() {
    Event testEvent = new Event(10, "Chicken", "Alcohol", true);
    testEvent.setPrice();
    assertEquals("490.00", testEvent.getTotal());
  }

  @Test
  public void peopleCouponTotal_ifBandSelected_240() {
    Event testEvent = new Event(10, "Chicken", "Alcohol", true);
    testEvent.setPrice();
    testEvent.peopleCouponTotal();
    assertEquals("240.00", testEvent.getTotal());
  }

  @Test
  public void peopleCouponTotal_ifBandNotSelected_240() {
    Event testEvent = new Event(10, "Chicken", "Alcohol", false);
    testEvent.setPrice();
    testEvent.peopleCouponTotal();
    assertEquals("240.00", testEvent.getTotal());
  }

  @Test
  public void alcoholCouponTotal_checkForFloat_108() {
    Event testEvent = new Event(6, "Steak", "Water", false);
    testEvent.setPrice();
    testEvent.alcoholCouponTotal();
    assertEquals("97.20", testEvent.getTotal());
  }
}
