package car;

public class Test {

  public static void main(String[] args) {
    // I am creating a reference ferrariCarEngine that gets allocated on the stack, so as a value
    // it contains the memory address of where the Engine object is on the heap
    Engine ferrariCarEngine = new Engine();

    // I am creating a reference bmwCarEngine that gets allocated on the stack, so as a value
    // it contains the memory address of where the Engine object is on the heap
    Engine bmwCarEngine = new Engine();

    // I am creating a reference ferrari that gets allocated on the stack, so as a value
    // it contains the memory address of where the car object is on the heap
    Car ferrari = new Car(ferrariCarEngine);

    // I am creating a reference bmw that gets allocated on the stack, so as a value
    // it contains the memory address of where the car object is on the heap
    Car bmw = new Car(bmwCarEngine);

    // the ferrariCarEngine won't delete from heap by java garbage collector
    // since the ferrari car object still have carEngine point to the ferrariCarEngine
    ferrariCarEngine = null;

    // the ferrariCarEngine will delete from heap by java garbage collector
    ferrari = null;
  }
}
