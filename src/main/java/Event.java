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
    return mBeverages;
  }

  public boolean getBand() {
    return mBand;
  }

  public int getPrice() {
    int total = 0;
    if(mFood.equals("Chicken")) {
      total += 12;
    } else if (mFood.equals("Steak")) {
      total += 18;
    } else if (mFood.equals("Salmon")) {
      total += 25;
    }
    if(mBeverages.equals("Water")) {
      total += 0;
    } else if (mBeverages.equals("Soda")) {
      total += 3;
    } else if (mBeverages.equals("Alcohol")) {
      total += 12;
    }
    total = (total * mPeople);
    if(mBand == true) {
      total += 250;
    }
    return total;
  }

  public boolean checkPeopleCoupon() {
    return mPeople > 150;
  }

  public int peopleCouponTotal(int current) {
    if (mBand == true) {
      return (current - 250);
    } else {
      mBand = true;
      return current;
    }
  }
}
