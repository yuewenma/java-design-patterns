package searchAlgorithms;

public class BinarySearch {

  public static boolean performBinarySearch(int targetValue, int[] items) {
    int leftIndex = 0;
    int rightIndex = items.length - 1;
    /*
     * We will assume that every value in the array to the right of right Index but not including
     * rightIndex have all been looked at
     *
     * We will assume that every value in the array to the left of leftIndex but not including
     * leftIndex have all been looked at
     */

    while (leftIndex <= rightIndex) {
      int middleIndex = (leftIndex + rightIndex) / 2;
      if (items[middleIndex] == targetValue) {
        return true;
      }
      if (items[middleIndex] < targetValue) {
        leftIndex = middleIndex + 1;
      }
      if (items[middleIndex] > targetValue) {
        rightIndex = middleIndex - 1;
      }
    }
    /*if the loop terminates leftIndex>rightIndex, then all the items in the array have been
     *looked at!
     */
    return false;
  }

  public static void main(String[] args) {
    int targetValue = 9;
    int[] items = {5, 6, 7, 8, 9};
    boolean output1 = BinarySearch.performBinarySearch(targetValue, items);
    System.out.println(output1);
  }
}
