package rt.digital.recruitmentservice.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "positions")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_position")
    private Long id;

    @Column(name = "position", nullable = false)
    private String positionName;

    @Column(name = "qualification")
    private String qualification;

    @OneToOne(mappedBy = "position")
    private Employee employee;

    public Position() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return Objects.equals(id, position.id) && Objects.equals(positionName, position.positionName) && Objects.equals(qualification, position.qualification) && Objects.equals(employee, position.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, positionName, qualification, employee);
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", positionName='" + positionName + '\'' +
                ", qualification='" + qualification + '\'' +
                ", employee=" + employee +
                '}';
    }
}
