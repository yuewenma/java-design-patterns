package mockObjects.person1;

import mockObjects.common.InvalidPathException;
import mockObjects.person2.FileSystem;
import mockObjects.common.IFileSystem;

// This is the cat command implementation by person1
public class Cat {
  private IFileSystem fs;

  public Cat(IFileSystem fs){
    this.fs = fs;
  }

  public String execute(String path) {
    String contents;
    try {
      // since cat command collaborate with fs so that if we want to test cat we need to make sure
      // fs.getFileContents(path) work perfect. However the real fs is not finish by person2. So we
      // need create a mock fs to test our code.
      contents=fs.getFileContents(path);
    } catch (InvalidPathException e) {
      contents="Invalid Path Entered!";
    }
    return contents;
  }

}
