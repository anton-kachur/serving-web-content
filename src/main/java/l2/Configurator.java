package l2;

import l2.ComplexNumber.ComplexNumberController;
import l2.ComplexNumber.ComplexNumberView;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
class Config {
    public ComplexNumberView view(){
        return new ComplexNumberView();
    }
    //@Bean
    public ComplexNumberController controller(){
        return new ComplexNumberController(view());
    }
}
