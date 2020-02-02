package pubSubDesignPattern;

import java.util.Observable;
import java.util.Observer;

public class Manager implements Observer {

  public Manager(){

  }

  @Override
  public void update(Observable obs, Object record) {
    System.out.println("The Manager says a " + ((Database) obs).getOperation() +
        " operation was performed on " + ((Database) obs).getRecord());
  }
}
