import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer();
        printer.addPaper(300);
    }

    @Test
    public void newPrinterHasNoPaper() {
        Printer newPrinter = new Printer();
        assertEquals(0, newPrinter.getSheets());
    }

    @Test
    public void printOnePage() {
        printer.print(1, 1);
        assertEquals(299, printer.getSheets());
    }

    @Test
    public void printThirtyPages() {
        printer.print(10, 3);
        assertEquals(270, printer.getSheets());
    }

    @Test
    public void printTooManyPages() {
        printer.print(320, 1);
        assertEquals(300, printer.getSheets());
    }

    @Test
    public void reduceTonerBy10() {
        printer.print(10, 1);
        assertEquals(4990, printer.getToner());
    }

    @Test
    public void notEnoughTonerToPrint() {
        printer.addPaper(5500);
        printer.print(5100, 1);
        assertEquals(5000, printer.getToner());
    }
}
