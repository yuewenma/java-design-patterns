package mockObjects.person2;

import mockObjects.common.IFileSystem;
import mockObjects.common.InvalidPathException;

public class FileSystem implements IFileSystem {

  @Override
  public String getFileContents(String path) throws InvalidPathException {
    // This is the real implementation of the FileSystem by person2
    return "real";
  }
}
