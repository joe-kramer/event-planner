import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Welcome to our event planner");
    System.out.println("Before we get started, at the end you will have the choice to add two coupons if you meet the requirement of over 150 guests - The first being a free band for your entertainment, and secondly, 10% off your entire total if you choose to get your alcohol through us.");
    System.out.println("---------------------------");
    myConsole.readLine();
    System.out.print("\033[H\033[2J");
    System.out.println("First, how many people will be attending this event?");
    int people = Integer.parseInt(myConsole.readLine());
    System.out.print("\033[H\033[2J");
    System.out.println("Second, what kind of food would you like: Chicken, Steak, or Salmon. (Please type in exactly as seen)");
    String food = myConsole.readLine();
    System.out.print("\033[H\033[2J");
    System.out.println("Third, what kind of beverages would you like: Water, Soda, or Alcohol. (Please type in exactly as seen)");
    String beverages = myConsole.readLine();
    System.out.print("\033[H\033[2J");
    System.out.println("Lastly, would you like a band at your event? \"Yes\" or \"No\". (Please type in exactly as seen)");
    String bandString = myConsole.readLine();
    boolean band;
    if (bandString.equals("Yes")) {
      band = true;
    } else {
      band = false;
    }
    System.out.print("\033[H\033[2J");
    Event userEvent = new Event(people, food, beverages, band);
    userEvent.setPrice();
    System.out.println("Your current total is: $" + userEvent.getTotal());
    myConsole.readLine();
    System.out.print("\033[H\033[2J");
    if(userEvent.getPeople() > 150) {
      System.out.println("Since you have over 150 people, lets see if you qualify for any of our coupons:");
      myConsole.readLine();
      System.out.print("\033[H\033[2J");
      if(userEvent.getBand()) {
        userEvent.peopleCouponTotal();
        System.out.println("Since you have a band, we will knock off the original $250. Your new total is: $" + userEvent.getTotal());
        myConsole.readLine();
        System.out.print("\033[H\033[2J");
      }
      if (userEvent.getBeverage().equals("Alcohol")) {
        userEvent.alcoholCouponTotal();
        System.out.println("Since you are purchasing your alcohol through us, we will reduce your price by 10%. Your new total is: $" + userEvent.getTotal());
        myConsole.readLine();
        System.out.print("\033[H\033[2J");
      }
    } else {
      System.out.println("It appears you do not have enough people to qualify for any of our coupon deals.");
      myConsole.readLine();
      System.out.print("\033[H\033[2J");
    }
    System.out.println("Your final order consists of: " + userEvent.getFood() + " and " + userEvent.getBeverage() + " for " + userEvent.getPeople() + " people");
    if (userEvent.getBand()) {
      System.out.println("And a band!");
    }
    System.out.println("Your grand total is... $" + userEvent.getTotal());
  }
}
