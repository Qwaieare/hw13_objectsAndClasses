package hw13_objectsAndClasses;

public class MainHw13 {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Уильям", "Гибсон");
        Author secondAuthor = new Author("Марио", "Пьюзо");

        Book firstBook = new Book(firstAuthor, "Нейромант", 2015);
        Book secondBook = new Book(secondAuthor, "Крестный отец", 2018);

        System.out.println(firstAuthor.getFirstName() + " " + firstAuthor.getFamilyName () + " '" + firstBook.getBookTitle() + ", " + firstBook.getPublisherYear());

        System.out.println(secondAuthor.getFirstName() + " " + secondAuthor.getFamilyName () + " '" + secondBook.getBookTitle() + ", " + secondBook.getPublisherYear());

        secondBook.setPublisherYear(2022);

        System.out.println(secondAuthor.getFirstName() + " " + secondAuthor.getFamilyName () + " '" + secondBook.getBookTitle() + ", " + secondBook.getPublisherYear());

        System.out.println(firstAuthor);
        System.out.println(firstBook);
        System.out.println(secondAuthor);
        System.out.println(secondBook);
    }
}
