package pubSubDesignPattern;

import java.util.Observable;
import java.util.Observer;

public class Archival implements Observer {

  public Archival(){

  }

  @Override
  public void update(Observable obs, Object record) {
    System.out.println("The Archival says a " + ((Database) obs).getOperation() +
        " operation was performed on " + ((Database) obs).getRecord());
  }
}
