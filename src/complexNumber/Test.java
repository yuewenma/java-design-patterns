package complexNumber;

public class Test {

  /**
   *
   */
  public static void main(String[] args) {
    //TODO Auto-generated method stub
    //Lets create a complexNumber i.e. 6+5i
    ComplexNumber number1 =
        ComplexNumber.createComplexNumberFromCartesianCoordinates(6.0, 5.0);
    ComplexNumber number2 =
        ComplexNumber.createComplexNumberFromCartesianCoordinates(1.0, 7.0);
    ComplexNumber number3 = number1.addComplexNumber(number2);
    System.out.println("First complex number");
    Test.printDebugMessages(number1);
    System.out.println("Second complex number");
    Test.printDebugMessages(number2);
    System.out.println("Third complex number");
    Test.printDebugMessages(number3);
    System.out.println("Modulus of complex number1 " + number1.getModulusOfComplexNumber());
    ComplexNumber number4 =
        ComplexNumber.creatComplexNumberFromPolarCoordinates(1.0, Math.PI / 2);

  }

  public static void printDebugMessages(ComplexNumber number) {
    System.out.println("The real part of the complexNumber is " + number.getReal());
    System.out.println("The imaginary part of the complexNumber is " + number.getImaginary());
  }

}
