package memoryExample;

public class FileSystem {
  private static FileSystem singleReference=null;
  private FileSystem(){

  }

  public static FileSystem createFileSystemInstance(){
    if (singleReference==null){
      //7.create FileSystem object - draw FileSystem into object Heap
      singleReference=new FileSystem();
    }
    //8.remove createFileSystemInstance from stack
    return singleReference;
  }
}
