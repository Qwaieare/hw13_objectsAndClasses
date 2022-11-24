package hw13_objectsAndClasses;

public class Author {
    // Поля класса. Ограничение уровня доступа с помощью модификатора privat.
    // Обращение к полям через геттеры и сеттеры.
    private  final String firstName;
    private  final String familyName;

    // конструктор
    public Author(String firstName, String familyName) {
        this.firstName = firstName;
        this.familyName = familyName;
    }
    // Обеспечения инкапсуляции для скрытия состояния объекта
    public String getFirstName() {
        return firstName;
    }
    public String getFamilyName() {
        return familyName;
    }
}
