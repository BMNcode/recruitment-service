package rt.digital.recruitmentservice.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_contact")
    private Long id;

    @Column(name = "type_contact", nullable = false)
    private String type;

    @Column(name = "detail", nullable = false)
    private String detail;

    @ManyToOne
    @JoinColumn(name="id_provider", nullable=false)
    private Provider provider;

    @ManyToOne
    @JoinColumn(name="id_manager", nullable=false)
    private Manager manager;

    public Contact() {
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(id, contact.id) && Objects.equals(type, contact.type) && Objects.equals(detail, contact.detail) && Objects.equals(provider, contact.provider) && Objects.equals(manager, contact.manager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, detail, provider, manager);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", detail='" + detail + '\'' +
                ", provider=" + provider +
                ", manager=" + manager +
                '}';
    }
}
