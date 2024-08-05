package LibraryManagemen;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Find books by year");
            System.out.println("4. Find books by author");
            System.out.println("5. Find book with most pages");
            System.out.println("6. Find books with more than 350 pages");
            System.out.println("7. Print all book titles sorted");
            System.out.println("8. Find books by category");
            System.out.println("9. Loan a book");
            System.out.println("10. Return a book");
            System.out.println("11. Register a user");
            System.out.println("12. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter title:");
                    String title = scanner.nextLine();
                    System.out.println("Enter author:");
                    String author = scanner.nextLine();
                    System.out.println("Enter publication year:");
                    int year = scanner.nextInt();
                    System.out.println("Enter pages:");
                    int pages = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.println("Enter category:");
                    String category = scanner.nextLine();
                    library.addBook(new Book(title, author, year, pages, category));
                    break;
                case 2:
                    System.out.println("Enter title:");
                    title = scanner.nextLine();
                    library.removeBook(title);
                    break;
                case 3:
                    System.out.println("Enter year:");
                    year = scanner.nextInt();
                    library.findBooksByYear(year).forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("Enter author:");
                    author = scanner.nextLine();
                    library.findBooksByAuthor(author).forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Book with most pages: " + library.findBookWithMostPages());
                    break;
                case 6:
                    library.findBooksWithMoreThanNPages(350).forEach(System.out::println);
                    break;
                case 7:
                    library.getAllBookTitlesSorted().forEach(System.out::println);
                    break;
                case 8:
                    System.out.println("Enter category:");
                    category = scanner.nextLine();
                    library.findBooksByCategory(category).forEach(System.out::println);
                    break;
                case 9:
                    System.out.println("Enter title:");
                    title = scanner.nextLine();
                    library.loanBook(title);
                    break;
                case 10:
                    System.out.println("Enter title:");
                    title = scanner.nextLine();
                    library.returnBook(title);
                    break;
                case 11:
                    System.out.println("Enter user name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter library card number:");
                    String cardNumber = scanner.nextLine();
                    User user = new User(name, cardNumber);
                    System.out.println("User " + name + " registered. Welcome!");
                    break;
                case 12:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
