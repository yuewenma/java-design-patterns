package pubSubDesignPattern;

public class Test {
  public static void main(String args[]) {
    //create publisher
    Database database = new Database();

    //create 3 subscribers
    Archival archival = new Archival();
    Client client = new Client();
    Manager manager = new Manager();

    //add subscribers to publisher so that let them connected
    database.addObserver(archival);
    database.addObserver(client);
    database.addObserver(manager);

    //do an operation to publisher then we expect every subscribers should get notification
    database.editRecord("delete", "record1");
  }
}
