public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }
    //method with 2 parameters to add complex number real & imaginary parts
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    //method with 2 parameters to subtract complex number real & imaginary parts
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    //method with 1 parameter to add complex number real & imaginary parts
    public void add(ComplexNumber complexNumber) {
        this.real += complexNumber.real;
        this.imaginary += complexNumber.imaginary;
    }

    //method with 1 parameter to subtract complex number real & imaginary parts
    public void subtract(ComplexNumber complexNumber) {
        this.real -= complexNumber.real;
        this.imaginary -= complexNumber.imaginary;
    }

}
