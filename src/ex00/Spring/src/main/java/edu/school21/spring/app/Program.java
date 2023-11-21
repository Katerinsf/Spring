package edu.school21.spring.app;
//ex00.String.src.main.java.

import edu.school21.spring.preprocessor.PreProcessor;
import edu.school21.spring.preprocessor.PreProcessorToLowerImpl;
import edu.school21.spring.preprocessor.PreProcessorToUpperImpl;
import edu.school21.spring.printer.Printer;
import edu.school21.spring.printer.PrinterWithDateTimeImpl;
import edu.school21.spring.printer.PrinterWithPrefixImpl;
import edu.school21.spring.renderer.Renderer;
import edu.school21.spring.renderer.RendererErrImpl;
import edu.school21.spring.renderer.RendererStandardImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
    public static void main(String[] args) {
        System.out.println("-------------Standard way------------");
        PreProcessor preProcessor = new PreProcessorToUpperImpl();
        Renderer renderer = new RendererErrImpl(preProcessor);
        PrinterWithPrefixImpl printer = new PrinterWithPrefixImpl(renderer);
        printer.setPrefix("Prefix");
        printer.print("Hello!");

        System.out.println("-------------Spring looks------------");
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Printer printerSpring = context.getBean("printerPrefixErrUp", Printer.class);
        printerSpring.print("Hello!");
    }
}
