package l2;

import l2.ComplexNumExponential.ComplexNumExponentialController;
import l2.ComplexNumExponential.ComplexNumExponentialView;
import l2.ComplexNumberExponential.ComplexNumberExponentialController;
import l2.ComplexNumberExponential.ComplexNumberExponentialView;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ConfigForExponential {
    public ComplexNumberExponentialView view(){ return new ComplexNumberExponentialView(); }
    //@Bean
    public ComplexNumberExponentialController controller(){
        return new ComplexNumberExponentialController(view());
    }
}
