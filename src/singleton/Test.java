package singleton;

public class Test {
  public static void main (String args[]) {
    // create a new file system
    FileSystem a  = FileSystem.createInstanceOfFileSystem();
    // b is the same filesystem with a
    FileSystem b = FileSystem.createInstanceOfFileSystem();
    // create finder window with filesystem
    FinderWindow fw1 = new FinderWindow();
    // create another finder window share the same file system
    FinderWindow fw2 = new FinderWindow();
  }
}
