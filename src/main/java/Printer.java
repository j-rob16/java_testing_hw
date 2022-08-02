public class Printer {

    private int availablePaper;
    private int toner = 5000;
    public void addPaper(int sheets) {
        availablePaper += sheets;
    }

    public int getSheets() {
        return availablePaper;
    }

    public void print(int pages, int copies) {
        int printRequest = pages * copies;
        if (printRequest <= availablePaper && printRequest <= toner) {
        availablePaper -= printRequest;
        toner -= printRequest;
        System.out.println("Printed");
        } else {
            System.out.println("Sorry, cannot print what you need.");
        }
    }

    public int getToner() {
        return toner;
    }
}
