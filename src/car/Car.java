package car;

//Car is an object
public class Car {

  //all of these are instance variables
  //Car has a Engine (Composition or Aggregation)
  private Engine carEngine;
  private float gosalineCapacity;
  private String carColor;
  //Car has 4 wheels (Composition)
  private Wheel w1;
  private Wheel w2;
  private Wheel w3;
  private Wheel w4;

  //Default Constructor
  public Car() {

  }

  public Car(Engine e) {
    //carEngine is my instance variable
    //e is my local variable
    carEngine = e;
  }

  public Car(Engine e, Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4) {
    carEngine = e;
    w1 = wheel1;
    w2 = wheel2;
    w3 = wheel3;
    w4 = wheel4;
  }


}
