package l2.ComplexNumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComplexNumberController {
    private ComplexNumber model;
    private ComplexNumberView view;

    @Autowired
    public ComplexNumberController(ComplexNumberView model) {
        this.view = model;
    }
    public ComplexNumberController(ComplexNumber model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model.toString();
    }
    public String getNumberReal() {
        return model.getReal();
    }
    public String getNumberImaginary() {
        return model.getImaginary();
    }

    public double setNumberReal(int r) {
        return model.setReal(r);
    }

    public double setNumberImaginary(int i) {
        return model.setImaginary(i);
    }

    public ComplexNumber sumComplexNumbers(ComplexNumber num) {
        System.out.println(model.sumNumbers(num));
        return model.sumNumbers(num);
    }

    public ComplexNumber minusComplexNumbers(ComplexNumber num) {
        return model.minusNumbers(num);
    }

    public ComplexNumber timesComplexNumbers(ComplexNumber num) {
        return model.timesNumbers(num);
    }

    public ComplexNumber setModel(ComplexNumber m) {
        this.model = m;
        return this.model;
    }
}
