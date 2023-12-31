package edu.school21.spring.printer;

import edu.school21.spring.renderer.Renderer;
import java.time.LocalDateTime;

public class PrinterWithDateTimeImpl implements Printer {
    private Renderer renderer;

    public PrinterWithDateTimeImpl(Renderer renderer) {
        this.renderer = renderer;
    }

    @Override
    public void print(String msg) {
        LocalDateTime dateTime = LocalDateTime.now();
        renderer.rendering(dateTime + " " + msg);
    }
}
