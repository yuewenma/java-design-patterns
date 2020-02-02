package memoryExample;

public class FinderWindow {
  private FileSystem referenceToFileSystem;
  public FinderWindow(){
    //5.create FileSystem class - draw FileSystem into Static heap
    //6.call the function createFileSystem - draw createFileSystem into stack
    referenceToFileSystem=FileSystem.createFileSystemInstance();
    //9.remove FinderWindow from stack
  }

  //1.create FinderWindow class - draw FinderWindow into static heap
  public static void main(String[] args){
    //2.create fw1 in the main function - draw fw1 into stack
    //3.call constructor of FinderWindow - draw FinderWindow into stack
    //4.create FinderWindow object - draw FinderWindow into object heap
    FinderWindow fw1 = new FinderWindow();
    FinderWindow fw2 = new FinderWindow();
    FinderWindow fw3 = new FinderWindow();
    FinderWindow fw4 = new FinderWindow();
    FinderWindow fw5 = new FinderWindow();

    //there are 5 different FinderWindow objects all point to the same FileSystem object
  }

}
