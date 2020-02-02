package singleton;


// Given any class, you like for that class one and only one instance to be created at any given time

//Here, the filesystem must only have one instance.
public class FileSystem {
  private static FileSystem ref = null;
  private boolean state = false;

  //this constructor creates a filesystem instance
  private FileSystem () {
  }

  public boolean getState() {
    return state;
  }

  public static FileSystem createInstanceOfFileSystem() {
    if (ref == null) {
      ref = new FileSystem();
    }
    return ref;
  }
}
