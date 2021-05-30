package l2;

import l2.ComplexNumExponential.ComplexNumExponential;
import l2.ComplexNumExponential.ComplexNumExponentialController;
import l2.ComplexNumber.ComplexNumber;
import l2.ComplexNumber.ComplexNumberController;
import l2.ComplexNumberExponential.ComplexNumberExponential;
import l2.ComplexNumberExponential.ComplexNumberExponentialController;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

//Anton Kachur TI-82
//Task: 7.Create a complex numbers using Java

@SpringBootApplication
@Component
public class ProgEng_lab_1 implements ApplicationContextAware{

    private static boolean run = true;
    private static ApplicationContext context;

    public static ApplicationContext getApplicationContext() {
        return context;
    }

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        context = ac;
    }

    public static void main (String []args) {
        SpringApplication.run(ProgEng_lab_1.class, args);

        /*Parser parser = getApplicationContext().getBean(Parser.class);*/
        ComplexNumberController complex_num = getApplicationContext().getBean(ComplexNumberController.class);
        ComplexNumberExponentialController exponential_num = getApplicationContext().getBean(ComplexNumberExponentialController.class);

        /*ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(ctx);
        ComplexNumberController controller = ctx.getBean("controller", ComplexNumberController.class);*/

        ApplicationContext ctx_decor = new AnnotationConfigApplicationContext(ConfigForDecorator.class);
        System.out.println(ctx_decor);
        ComplexNumExponentialController controller_decor = ctx_decor.getBean("controller", ComplexNumExponentialController.class);

        /*List<ProgEng_lab_1> mains = new ArrayList<>();

        for (int i=1; i<6; i++)
            mains.add(new ProgEng_lab_1(i));*/
    }
}

