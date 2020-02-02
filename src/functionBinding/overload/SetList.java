package functionBinding.overload;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetList {
  public static void main(String[] args) {
    Set<Integer> set = new TreeSet<>();
    List<Integer> list = new ArrayList<>();
    //expect:[-3,-2,-1,0,1,2]
    for (int i=-3; i<3; i++) {
      set.add(i);
      list.add(i);
    }
    //expect:[-3,-2,-1]
    for (int i=0; i<3; i++) {
      set.remove(i);
      // list interface has 2 remove methods so its function overloading
      // remove(object) remove(int)
      // so that binding during compiler
      // compiler is finding some method is remove(int)
      //list.remove(i);
      Integer integer = new Integer(i);
      list.remove(integer);
    }
    System.out.println(set + " " + list);
  }
}
