package pubSubDesignPattern;

import java.util.Observable;

//Database is publisher
public class Database extends Observable {
  //i.e. delete
  private String operation;
  //i.e. data
  private String record;

  public Database(){

  }

  public void editRecord(String operation, String record) {
    this.operation = operation;
    this.record = record;
    setChanged();
    notifyObservers();
  }

  public String getOperation() {
    return operation;
  }

  public String getRecord() {
    return record;
  }
}
