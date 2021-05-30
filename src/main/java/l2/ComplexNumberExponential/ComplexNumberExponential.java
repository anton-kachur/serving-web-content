package l2.ComplexNumberExponential;

import l2.About;
import l2.ComplexNumber.ComplexNumber;
import l2.Info;

@Info(name = "Exponential form")
public class ComplexNumberExponential extends ComplexNumber {
    private double real;
    private double imaginary;


    public ComplexNumberExponential(double a, double b){
        super(a, b);
        real = a;
        imaginary = b;
    }

    @Override
    @About(name="Method, which gets complex number in exponential form")
    public String toString() {
        double mod = Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary, 2));
        double arg = Math.atan(imaginary/real);
        return Math.round(mod) + "e^i" + Math.round(arg);
    }

    @Override
    public void start() {
        System.out.println(this.toString());
    }
}
