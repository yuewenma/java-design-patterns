package Decorator;

//base
public class HouseBlend extends Beverage {
  public HouseBlend() {
    description = "Espresso";
  }

  @Override
  public double cost() {
    return 1.99;
  }

}
