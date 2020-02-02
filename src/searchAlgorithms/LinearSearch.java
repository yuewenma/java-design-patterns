package searchAlgorithms;

public class LinearSearch {

  public static boolean performLinearSearch(int targetValue, int[] items) {
    /*
     * every value to the left of index (not including index), have been looked at
     */
    int index = 0;
    int lengthOfArray = items.length;

    while (index < lengthOfArray) {
      if (items[index] == targetValue) {
        return true;
      }

      index = index + 1;
    }
    return false;
  }

  public static void main(String[] args) {
    int targetValue = 3;
    int[] items = {9, 5, 3};
    boolean output1 = LinearSearch.performLinearSearch(targetValue, items);
    System.out.println(output1);
  }
}
