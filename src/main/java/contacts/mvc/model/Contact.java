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
    @Column(name = "info")
    private String info;

    public Contact() {
    }

    public Contact(String firstName, String info) {
        this.firstName = firstName;
        this.info = info;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }



    @Override
    public String toString() {
        return "Contact{" + "contactId=" + id + ", firstName=" + firstName + ", info=" + info + '}';
    }
}
