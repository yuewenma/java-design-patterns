package functionBinding.overload;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionClassifier {

  public static String classify(HashSet s) {
    return "Set";
  }

  //overload：重载：在一个类中通过定义不同的参数的同名方法
  //function overloading so that binding by compiler
  public static String classify(ArrayList lst) {
    return "List";
  }

  //function overloading by compiler
  public static String classify(Collection lst) {
    return "Unknown Collection";
  }

  public static void main(String[] args) {
    Collection[] collections = {
        new HashSet(),
        new ArrayList(),
        new HashMap().values()
    };

    for (Collection c:collections)
      //function binding during compiler when its static, overload or private
      System.out.println(classify(c));
  }
}
