package contacts.mvc.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;


/**
 * Класс для хранения данных контакта
 */
@Component
@Scope("prototype")
@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    // Имя
    @Column(name = "firstName")
    private String firstName;
    // Фамилия
    @Column(name = "lastName")
    private String lastName;

    public Contact() {
    }

    public Contact(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getContactId() {
        return this.id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Contact{" + "contactId=" + id + ", firstName=" + firstName + ", lastName=" + lastName + '}';
    }
}
