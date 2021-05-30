package l2;

import l2.ComplexNumExponential.ComplexNumExponentialController;
import l2.ComplexNumExponential.ComplexNumExponentialView;
import l2.ComplexNumber.ComplexNumberController;
import l2.ComplexNumber.ComplexNumberView;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ConfigForDecorator {
    public ComplexNumExponentialView view(){ return new ComplexNumExponentialView(); }
    @Bean
    public ComplexNumExponentialController controller(){
        return new ComplexNumExponentialController(view());
    }
}

