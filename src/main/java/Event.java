public class Event {
  private int mPeople;
  private String mFood;
  private String mBeverages;
  private boolean mBand;
  private float mTotal;

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

  public String getTotal() {
    return String.format("%.2f", mTotal);
  }

  public void setPrice() {
    if(mFood.equals("Chicken")) {
      mTotal += 12;
    } else if (mFood.equals("Steak")) {
      mTotal += 18;
    } else if (mFood.equals("Salmon")) {
      mTotal += 25;
    }
    if(mBeverages.equals("Water")) {
      mTotal += 0;
    } else if (mBeverages.equals("Soda")) {
      mTotal += 3;
    } else if (mBeverages.equals("Alcohol")) {
      mTotal += 12;
    }
    mTotal = (mTotal * mPeople);
    if(mBand == true) {
      mTotal += 250;
    }
  }

  public boolean checkPeopleCoupon() {
    return mPeople > 150;
  }

  public void peopleCouponTotal() {
    if (mBand == true) {
      mTotal = mTotal - 250;
    } else {
      mBand = true;
    }
  }

  public void alcoholCouponTotal() {
    mTotal = mTotal/10;
  }
}
