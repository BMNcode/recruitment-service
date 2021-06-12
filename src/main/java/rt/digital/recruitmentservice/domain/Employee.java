package rt.digital.recruitmentservice.domain;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_employee")
    private Long id;

    @Column(name = "firstname", nullable = false)
    private String firstName;

    @Column(name = "middlename")
    private String middleName;

    @Column(name = "lastname", nullable = false)
    private String lastName;

    @Column(name = "hourly_rate", nullable = false)
    private Double HourlyRate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_position", referencedColumnName = "id_position")
    private Position position;

    @OneToMany(mappedBy = "employee")
    private Set<Skill> skills;

    @Column(name = "note")
    private String note;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_provider")
    private Provider provider;

    public Employee() {
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

    public Double getHourlyRate() {
        return HourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        HourlyRate = hourlyRate;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(firstName, employee.firstName) && Objects.equals(middleName, employee.middleName) && Objects.equals(lastName, employee.lastName) && Objects.equals(HourlyRate, employee.HourlyRate) && Objects.equals(position, employee.position) && Objects.equals(skills, employee.skills) && Objects.equals(note, employee.note) && Objects.equals(description, employee.description) && Objects.equals(provider, employee.provider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, middleName, lastName, HourlyRate, position, skills, note, description, provider);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", HourlyRate=" + HourlyRate +
                ", position=" + position +
                ", skills=" + skills +
                ", note='" + note + '\'' +
                ", description='" + description + '\'' +
                ", provider=" + provider +
                '}';
    }
}
