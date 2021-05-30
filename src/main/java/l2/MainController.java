package l2;

import l2.ComplexNumber.ComplexNumber;
import l2.ComplexNumberExponential.ComplexNumberExponential;
/*import l2.patternChainOfResponsibility.Chain;
import l2.patternChainOfResponsibility.ComplexNumberFiveDivision;
import l2.patternChainOfResponsibility.ComplexNumberThreeDivision;
import l2.patternChainOfResponsibility.ComplexNumberTwoDivision;
import l2.patternCommand.CompoundCommand;
import l2.patternCommand.Controller;
import l2.patternCommand.StartComplex;
import l2.patternCommand.StartExponential;*/
import l2.ComplexNumExponential.ComplexNumExponential;
/*import l2.patternObserver.Board;
import l2.patternProxy.NewComplexProxy.NewComplexProxy;*/

import java.util.ArrayList;
import java.util.List;

public class MainController {
    ComplexNumber n1 = new ComplexNumber(1, 2);
    ComplexNumberExponential n2 = new ComplexNumberExponential(1, 2);

    public MainController(int choice) {
        switch(choice) {
            //case 1: System.out.println("\nCommand pattern"); startCommand(); break;
            case 2: System.out.println("\nDecorator pattern"); startDecorator(); break;
            /*case 3: System.out.println("\nProxy pattern"); startProxy(); break;
            case 4: System.out.println("\nObserver pattern"); startObserver(); break;
            case 5: System.out.println("\nChainOfResponsibility pattern"); startChainOfResponsibility(); break;*/
            default: System.out.println("Error! No such pattern!\n");
        }
    }

    /*public void startCommand() {
        // Создание контроллера, отвечающего за выбор команд
        Controller controller = new Controller();

        // "Приведение в боевую готовность" двух комплексных чисел
        StartComplex startComplex = new StartComplex(n1);
        StartExponential startExponential = new StartExponential(n2);

        // Список для хранения последовательности команд
        List commands = new ArrayList();

        // Добавляем команду задания комплексного числа
        commands.add(startComplex);

        // Добавляем команду для задания комплексного числа в экспоненциальной форме
        commands.add(startExponential);

        CompoundCommand compCom = new CompoundCommand(commands);

        // Назначаем команду задания косплексного числа на кнопку 0 на контроллере
        controller.setCommand(0, startComplex);
        // Назначаем команду задания комплексного числа и комплексного числа в
        // экспоненциальной форме на кнопку 1 на контроллере
        controller.setCommand(1, compCom);
        // Нажимаем кнопку
        controller.buttonPress(1);
    }*/

    public void startDecorator() {
        ComplexNumExponential n = new ComplexNumExponential(n1);
        n.start();
    }

    /*public void startProxy() {
        NewComplexProxy n3 = new NewComplexProxy();
        n3.start();
    }

    public void startObserver() {
        Board n3 = new Board(n1);
        n1.setImaginary(2);
        n1.setImaginary(3);
        n1.setImaginary(4);
    }

    public void startChainOfResponsibility() {
        Chain c1 = new ComplexNumberFiveDivision();
        Chain c2 = new ComplexNumberThreeDivision();
        Chain c3 = new ComplexNumberTwoDivision();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);

        c1.method(new ComplexNumber(17, 17));
    }*/
}
