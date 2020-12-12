package contacts.mvc.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Scope("prototype")
@Entity
@Table(name = "steam")
public class Steam implements Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "steam")
    private String steam;

    public String getSteam() {
        return steam;
    }

    public void setNumber(String steam) {
        this.steam = steam;
    }
}
