package rt.digital.recruitmentservice.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "skills")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_skill")
    private Long Id;

    @Column(name = "skill")
    private String skillName;

    @Column(name = "level_skill")
    private byte skillLevel;

    @ManyToOne //@ManyToMany
    @JoinColumn(name = "id_employee", nullable = false)
    private Employee employee;

    public Skill() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public byte getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(byte skillLevel) {
        this.skillLevel = skillLevel;
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
        Skill skill = (Skill) o;
        return skillLevel == skill.skillLevel && Objects.equals(Id, skill.Id) && Objects.equals(skillName, skill.skillName) && Objects.equals(employee, skill.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, skillName, skillLevel, employee);
    }

    @Override
    public String toString() {
        return "Skill{" +
                "Id=" + Id +
                ", skillName='" + skillName + '\'' +
                ", skillLevel=" + skillLevel +
                ", employee=" + employee +
                '}';
    }
}
