package l2.ComplexNumberExponential;

import l2.ComplexNumExponential.ComplexNumExponential;
import l2.ComplexNumber.ComplexNumber;
import org.springframework.stereotype.Component;

@Component
public class ComplexNumberExponentialView {
    private ComplexNumberExponential model;

    public ComplexNumberExponentialView() { this.model = new ComplexNumberExponential(9, 9); }
    public ComplexNumberExponentialView(ComplexNumberExponential model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model.toString();
    }

    public ComplexNumberExponential setModel(ComplexNumberExponential m) {
        this.model = m;
        return this.model;
    }

}
