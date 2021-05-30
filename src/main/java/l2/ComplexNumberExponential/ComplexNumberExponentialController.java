package l2.ComplexNumberExponential;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComplexNumberExponentialController {
    private ComplexNumberExponential model;
    private ComplexNumberExponentialView view;

    @Autowired
    public ComplexNumberExponentialController(ComplexNumberExponentialView v) {
        this.view = v;
    }
    public ComplexNumberExponentialController(ComplexNumberExponential model) {
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
