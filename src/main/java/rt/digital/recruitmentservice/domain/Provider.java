package rt.digital.recruitmentservice.domain;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "providers")
public class Provider extends User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_provider")
    private Long id;

    @Column(name = "firstname", nullable = false)
    private String firstName;

    @Column(name = "middlename")
    private String middleName;

    @Column(name = "lastname", nullable = false)
    private String lastName;

    @Column(name = "company")
    private String companyName;

    @OneToMany(mappedBy = "provider")
    private Set<Contact> contacts;

    @OneToMany(mappedBy = "provider")
    private Set<Employee> employees;

    public Provider() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Provider provider = (Provider) o;
        return Objects.equals(id, provider.id) && Objects.equals(firstName, provider.firstName) && Objects.equals(middleName, provider.middleName) && Objects.equals(lastName, provider.lastName) && Objects.equals(companyName, provider.companyName) && Objects.equals(contacts, provider.contacts) && Objects.equals(employees, provider.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, middleName, lastName, companyName, contacts, employees);
    }

    public Set<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", contacts=" + contacts +
                ", employees=" + employees +
                '}';
    }
}
