package rt.digital.recruitmentservice.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "employee_positions")
public class EmployeePosition {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "position_id")
    private Long id;

    @Column(name = "position", nullable = false)
    private String position;

    @OneToMany(mappedBy = "employeePosition")
    private Set<Employee> employees;

    public EmployeePosition() {
    }
}
