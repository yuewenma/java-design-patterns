package Decorator;

public class Soy extends CondimentDecorator {
  //component of bev
  Beverage bev;

  //constructor of decorator use for set whose component
  public Soy(Beverage bev) {
    this.bev = bev;
  }

  //add description into base
  @Override
  public String getDescription() {
    return bev.getDescription() + ", Soy";
  }

  //add cost into base
  @Override
  public double cost() {
    return bev.cost() + .20;
  }
}
