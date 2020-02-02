package mockObjects.common;

import java.nio.file.InvalidPathException;

public interface IFileSystem {
  public String getFileContents(String path) throws InvalidPathException, mockObjects.common.InvalidPathException;
}
