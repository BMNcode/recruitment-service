package rt.digital.recruitmentservice.domain;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name = "employees")
public class Employee extends User {

    @Column(name = "hourly_rate", nullable = false)
    private Double hourlyRate;

    @ManyToOne
    @JoinColumn(name = "position_id", nullable = false)
    private EmployeePosition employeePosition;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "employee_status", nullable = false)
    private EmployeeStatus employeeStatus;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_skill_level_skill_mapping",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "skill_level_id", referencedColumnName = "skill_level_id")})
    @MapKeyJoinColumn(name = "skill_id")
    private Map<Skill, SkillLevel> employeeSkillLevelMap;

    @Column(name = "manager_note")
    private String note;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;

    public Employee() {
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public EmployeePosition getPosition() {
        return employeePosition;
    }

    public void setPosition(EmployeePosition employeePosition) {
        this.employeePosition = employeePosition;
    }

    public EmployeeStatus getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(EmployeeStatus employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public Map<Skill, SkillLevel> getEmployeeSkillLevelMap() {
        return employeeSkillLevelMap;
    }

    public void setEmployeeSkillLevelMap(Map<Skill, SkillLevel> employeeSkillLevelMap) {
        this.employeeSkillLevelMap = employeeSkillLevelMap;
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
}
