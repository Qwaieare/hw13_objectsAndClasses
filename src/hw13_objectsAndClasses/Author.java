package hw13_objectsAndClasses;
import java.util.Objects;
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
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Author author = (Author) obj;
        return firstName.equals(author.firstName) &&
                familyName.equals(author.familyName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, familyName);
    }
    @Override
    public String toString() {
        return firstName + " " + familyName;
    }

}
