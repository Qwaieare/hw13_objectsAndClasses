package hw13_objectsAndClasses;

public class Book {
    // Поля класса. Ограничение уровня доступа с помощью модификатора privat.
    // Обращение к полям через геттеры и сеттеры.
    private final Author authorName; // имя автора
    private final String bookTitle; // название книги
    private int publisherYear; // год публикации

    // Конструктор класса с 3 параметрами
    // Для обозначения переменных, объявленных для всего класса, используется this
    public Book(Author authorName, String bookTitle, int publisherYear) {
        this.authorName = authorName;
        this.bookTitle = bookTitle;
        this.publisherYear = publisherYear;
    }
    // Обеспечения инкапсуляции для скрытия состояния объекта
    // и предотвращения прямого доступа к его полям

    // Ограничить доступ к полям только для чтения
    // обеспечить неизменяемости объекта – реализация метода геттера
    public Author getAuthorName() {
        return authorName;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public int getPublisherYear() {
        return publisherYear;
    }
    // Ограничить доступ к полям для изменения – реализация сеттера
    // метод ничего не возвращает
    // проверка корректности значения перед его присваиванием
    public void setPublisherYear(int publisherYear) {
        if (publisherYear < 1950 || publisherYear > 2050) {
           System.out.println("Invalid publishing year parameter: " + publisherYear);
           return;
        }
        this.publisherYear = publisherYear;
    }
}
