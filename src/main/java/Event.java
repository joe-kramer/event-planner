public class Event {
  private int mPeople;
  private String mFood;
  private String mBeverages;
  private boolean mBand;

  public Event(int people, String food, String beverages, boolean band) {
    mPeople = people;
    mFood = food;
    mBeverages = beverages;
    mBand = band;
  }

  public int getPeople() {
    return mPeople;
  }

  public String getFood() {
    return mFood;
  }

  public String getBeverage() {
    return "";
  }
}
