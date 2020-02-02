package complexNumber;

public class ComplexNumber {

  //What is a ComplexNumber?
  //real and imaginary are my instance members
  private double real;
  private double imaginary;

  private ComplexNumber(double r, double i) {
    //r and i are my local variables
    real = r;
    imaginary = i;
  }

  public static ComplexNumber creatComplexNumberFromPolarCoordinates(double modulus, double angle) {
    return new ComplexNumber(modulus * Math.cos(angle), modulus * Math.sin(angle));
  }

  public static ComplexNumber createComplexNumberFromCartesianCoordinates(double real,
      double imaginary) {
    return new ComplexNumber(real, imaginary);
  }

  public ComplexNumber addComplexNumber(ComplexNumber number2) {
    double resultOfRealComponent = number2.real + this.real;
    double resultOfImaginaryComponent = number2.imaginary + this.imaginary;

    ComplexNumber result = new ComplexNumber(resultOfRealComponent, resultOfImaginaryComponent);
    return result;
  }

  public double getModulusOfComplexNumber() {
    return Math.sqrt(Math.pow(this.getReal(), 2.0) + Math.pow(this.getImaginary(), 2.0));
  }

  public double getReal() {
    return real;
  }

  public double getImaginary() {
    return imaginary;
  }
}
