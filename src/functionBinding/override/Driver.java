package functionBinding.override;

import java.util.ArrayList;
import java.util.List;

public class Driver {

  public static void main(String[] args) {
    List<Wine> wineList = new ArrayList();
    wineList.add(new Wine());
    wineList.add(new SparklingWine());
    wineList.add(new Champagne());

    for (Wine wine:wineList)
      //function binding during runtime if its not static, overload or private
      System.out.println(wine.name());
  }

}
