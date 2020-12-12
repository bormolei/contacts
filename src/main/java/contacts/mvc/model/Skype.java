package contacts.mvc.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Scope("prototype")
@Entity
@Table(name = "skype")
public class Skype implements Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "skype")
    private String skype;

    public String getSkype() {
        return skype;
    }

    public void setNumber(String skype) {
        this.skype = skype;
    }
}
