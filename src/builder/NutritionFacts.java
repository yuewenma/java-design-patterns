package builder;

public class NutritionFacts {
  //two required parameters
  private final int servingSize;
  private final int servings;
  //four optional parameters
  private final int calories;
  private final int fat;
  private final int sodium;
  private final int carbohydrate;

  //private constructor take in its inner class builder
  private NutritionFacts(Builder b) {
    this.calories = b.calories;
    this.carbohydrate = b.carbohydrate;
    this.fat = b.fat;
    this.servings = b.servings;
    this.servingSize = b.servingSize;
    this.sodium = b.sodium;
  }

  public static class Builder {
    //two required parameters
    private final int servingSize;
    private final int servings;
    //four optional parameters with default value
    private int calories=0;
    private int fat=0;
    private int sodium=0;
    private int carbohydrate=0;

    //constructor for builder and set value for required parameters
    public Builder(int servingSize, int servings) {
      this.servingSize = servingSize;
      this.servings = servings;
    }

    public NutritionFacts build() {
      // the inner Builder class can call the private constructor of the outer class
      // private NutritionFacts(Builder b)
      return new NutritionFacts(this);
    }

    public Builder calories(int calories) {
      this.calories = calories;
      return this;
    }

    public Builder fat(int fat) {
      this.fat = fat;
      return this;
    }

    public Builder sodium(int sodium) {
      this.sodium = sodium;
      return this;
    }

    public Builder carbohydrate(int carbohydrate) {
      this.carbohydrate = carbohydrate;
      return this;
    }
  }

}
