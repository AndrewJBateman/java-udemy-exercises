public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    // constructor to set values for fields
    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel > -1 ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount <= 0 || tonerAmount > 100) return -1;

        if(this.tonerLevel + tonerAmount > 100) {
            return -1;
        }
        return this.tonerLevel += tonerAmount;
    }

    public int printPages(int pages) {
        int pagesToPrint;

        if(duplex) {
            pagesToPrint = pages / 2 + pages % 2;
            System.out.println("Printing in duplex mode");
        } else {
            pagesToPrint = pages;
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
