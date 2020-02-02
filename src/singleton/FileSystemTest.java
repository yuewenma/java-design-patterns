package singleton;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FileSystemTest {
  private FileSystem fs;

  @Before
  public void setUp() throws Exception {
    fs = FileSystem.createInstanceOfFileSystem();
  }

  @After
  public void tearDown() throws Exception {
    Field field = (fs.getClass()).getDeclaredField("ref");
    field.setAccessible(true);
    field.set(null, null);
  }

  @Test
  public void test1() {
    assertEquals(false, fs.getState());
  }

  @Test
  public void test2() {
    // since we run tearDown before execute test2 so that ref is null and createInstance will be
    // return a new fs
    assertEquals(false, fs.getState());
  }
}