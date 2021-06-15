package rt.digital.recruitmentservice.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contact_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "contact_type_id", nullable = false)
    private ContactType contactType;

    @Column(name = "contact_detail", nullable = false)
    private String detail;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public Contact() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(id, contact.id) &&
                Objects.equals(contactType, contact.contactType) &&
                Objects.equals(detail, contact.detail) &&
                Objects.equals(user, contact.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contactType, detail, user);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", contactType=" + contactType +
                ", detail='" + detail + '\'' +
                ", user=" + user +
                '}';
    }
}
