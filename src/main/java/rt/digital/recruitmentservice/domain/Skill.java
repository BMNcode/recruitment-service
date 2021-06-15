package rt.digital.recruitmentservice.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "skills")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "skill_id")
    private Long Id;

    @Column(name = "skill_name", nullable = false)
    private String skillName;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "skill_group", nullable = false)
    private SkillGroup skillGroup;

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

    public SkillGroup getSkillGroup() {
        return skillGroup;
    }

    public void setSkillGroup(SkillGroup skillGroup) {
        this.skillGroup = skillGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return Objects.equals(Id, skill.Id) &&
                Objects.equals(skillName, skill.skillName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, skillName);
    }

    @Override
    public String toString() {
        return "Skill{" +
                "Id=" + Id +
                ", skillName='" + skillName + '\'' +
                ", skillGroup=" + skillGroup +
                '}';
    }
}
