package Decorator;

//Condiment Decorator调味品 is Beverage
public abstract class CondimentDecorator extends Beverage {
  public abstract String getDescription();
  public abstract double cost();
}
