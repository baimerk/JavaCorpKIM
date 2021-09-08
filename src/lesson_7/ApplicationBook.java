package lesson_7;

public class ApplicationBook {
    public static void main(String[] args) {

        Book book1 = new Book("Приключения");
        Book book2 = new Book("Словарь");
        Book book3 = new Book("Энциклопедия");

        Reader reader = new Reader("Петров В.В.");

        reader.takeBook(book1,book2,book3);
        reader.takeBook(4);
    }
}
