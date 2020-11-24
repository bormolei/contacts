package contacts.mvc.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Scope("prototype")
@Entity
@Table(name = "phone")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    //Номер
    @Column(name = "number")
    private String number;

    public String getNumber() {
        return number;


    }

    public void setNumber(String number) {
        this.number = number;
    }
}
