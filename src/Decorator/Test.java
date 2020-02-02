package Decorator;

public class Test {

  public static void main(String[] args) {
    //make a base beverage
    Beverage bev = new Espresso();
    //add decorator to base became a new beverage
    bev = new Mocha(bev);
    bev = new Milk(bev);
    bev = new Soy(bev);

    System.out.println(bev.getDescription() + " $" + bev.cost());
  }

}
