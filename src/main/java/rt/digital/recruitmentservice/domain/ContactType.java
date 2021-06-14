package rt.digital.recruitmentservice.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "contact_types")
public class ContactType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contact_type_id")
    private Long id;

    @Column(name = "contact_type", nullable = false)
    private String type;

    @OneToMany(mappedBy = "contactType")
    private Set<Contact> contacts;

    public ContactType() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
