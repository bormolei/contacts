package contacts.mvc.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Scope("prototype")
@Entity
@Table(name = "mail")
public class Mail implements Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    //Номер
    @Column(name = "mail")
    private String mail;

    public String getMail() {
        return mail;


    }

    public void setNumber(String mail) {
        this.mail = mail;
    }
}
