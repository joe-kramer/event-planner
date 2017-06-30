import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event testEvent = new Event(10);
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void newEvent_getsPeople_10() {
    Event testEvent = new Event(10);
    assertEquals(10, testEvent.getPeople());
  }

}
