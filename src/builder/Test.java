package builder;

public class Test {
  public static void main(String[] args) {
    //NutritionFacts.Builder is the constructor of inner class
    //240 8 is the request parameters
    NutritionFacts Cola = new NutritionFacts.Builder(240, 8)
        .calories(100).sodium(35).carbohydrate(27) //set optional parameters
        .build(); //return NutritionFacts
  }
}
