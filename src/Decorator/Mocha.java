package Decorator;

public class Mocha extends CondimentDecorator {
  //component of bev
  Beverage bev;

  //constructor of decorator use for set whose component
  public Mocha(Beverage bev) {
    this.bev = bev;
  }

  //add description into base
  @Override
  public String getDescription() {
    return bev.getDescription() + ", Mocha";
  }

  //add cost into base
  @Override
  public double cost() {
    return bev.cost() + .20;
  }
}
