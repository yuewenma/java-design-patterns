package singleton;

//How many instances of FinderWindow can the user create?? as many as needed
public class FinderWindow {
  private FileSystem refToFileSystem;
  public  FinderWindow() {
    refToFileSystem = FileSystem.createInstanceOfFileSystem();
  }
}
