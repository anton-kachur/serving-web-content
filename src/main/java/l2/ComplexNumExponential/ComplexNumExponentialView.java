package l2.ComplexNumExponential;

import l2.ComplexNumber.ComplexNumber;
import org.springframework.stereotype.Component;

@Component
public class ComplexNumExponentialView {
    private ComplexNumExponential model;

    public ComplexNumExponentialView() { this.model = new ComplexNumExponential(new ComplexNumber(9, 9)); }
    public ComplexNumExponentialView(ComplexNumExponential model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model.toString();
    }

    public ComplexNumExponential setModel(ComplexNumExponential m) {
        this.model = m;
        return this.model;
    }

}
