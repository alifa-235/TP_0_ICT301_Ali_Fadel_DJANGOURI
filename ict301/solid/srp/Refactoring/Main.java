//package ict301.solid.srp;

public class Main {
    public static void main(String[] args) {
        BookSRP book = new BookSRP("Les principes SOLID", "Etudiants de MI-GL", "Révision des principes SOLID");
        
        BookPrinter printer = new BookPrinter();
        BookSaver saver = new BookSaver();
        BookBusinessLogic businessLogic = new BookBusinessLogic();
        
        printer.printToScreen(book);
        printer.printToHTML(book);
        
        saver.saveToDatabase(book);
        saver.saveToFile(book, "backup.txt");
        
        businessLogic.emprunter(book, "Marcial");
        businessLogic.autreService(book);
    }
}