package mockObjects.person1;

import static org.junit.Assert.*;

public class CatTest {

  @org.junit.Test
  public void execute() {
    Cat c = new Cat(new MockFileSystem());
    String result = c.execute("validPath");
    assertEquals("success", result);
  }
}