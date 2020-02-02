package Decorator;

//Beverage饮品 everything is Beverage
public abstract class Beverage {
  String description = "Unknown";

  public String getDescription() {
    return description;
  }

  public abstract double cost();
}
