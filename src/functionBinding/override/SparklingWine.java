package functionBinding.override;

public class SparklingWine extends Wine {
  @Override //Override 重写：子类覆盖父类方法
  public String name() {
    return "sparkling wine";
  }
}
