package mockObjects.person1;

import mockObjects.common.IFileSystem;
import mockObjects.common.InvalidPathException;

public class MockFileSystem implements IFileSystem {

  @Override
  public String getFileContents(String path) throws InvalidPathException {
    if (path.equals("validPath"))
      return "success";
    else
      throw new InvalidPathException();
  }
}
