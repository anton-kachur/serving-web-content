package l2.ComplexNumExponential;

import l2.ComplexNumberExponential.ComplexNumberExponentialView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComplexNumExponentialController {
    private ComplexNumExponential model;
    private ComplexNumExponentialView view;

    @Autowired
    public ComplexNumExponentialController(ComplexNumExponentialView v) {
        this.view = v;
    }
    public ComplexNumExponentialController(ComplexNumExponential model) {
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
