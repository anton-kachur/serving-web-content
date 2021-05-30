package l2.ComplexNumber;

import org.springframework.stereotype.Component;

@Component
public class ComplexNumberView {
    private ComplexNumber model;

    public ComplexNumberView() {
        this.model = new ComplexNumber(1, 1);
    }
    public ComplexNumberView(ComplexNumber model) {
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

}
