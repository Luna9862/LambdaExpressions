package LibraryManagemen;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String libraryCardNumber;
    private List<Book> booksOnLoan;
    private LocalDate loanDate;

    public User(String name, String libraryCardNumber) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
        this.booksOnLoan = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() { return name; }
    public String getLibraryCardNumber() { return libraryCardNumber; }
    public List<Book> getBooksOnLoan() { return booksOnLoan; }

    public void loanBook(Book book) {
        if (!book.isOnLoan()) {
            booksOnLoan.add(book);
            book.setOnLoan(true);
            loanDate = LocalDate.now();
        }
    }

    public void returnBook(Book book) {
        if (book.isOnLoan()) {
            booksOnLoan.remove(book);
            book.setOnLoan(false);
        }
    }

    public double calculateLateFees() {
        long daysOverdue = LocalDate.now().toEpochDay() - loanDate.plusWeeks(2).toEpochDay();
        return daysOverdue > 0 ? daysOverdue * 0.5 : 0;
    }
}
