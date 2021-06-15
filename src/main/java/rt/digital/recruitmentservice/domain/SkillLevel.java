package rt.digital.recruitmentservice.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "skill_levels")
public class SkillLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "skill_level_id")
    private Long id;

    @Column(name = "number_level")
    private String numberLevel;

    @Column(name = "qualification_level")
    private String qualificationLevel;

    public SkillLevel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumberLevel() {
        return numberLevel;
    }

    public void setNumberLevel(String numberLevel) {
        this.numberLevel = numberLevel;
    }

    public String getQualificationLevel() {
        return qualificationLevel;
    }

    public void setQualificationLevel(String qualificationLevel) {
        this.qualificationLevel = qualificationLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkillLevel that = (SkillLevel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(numberLevel, that.numberLevel) &&
                Objects.equals(qualificationLevel, that.qualificationLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numberLevel, qualificationLevel);
    }

    @Override
    public String toString() {
        return "SkillLevel{" +
                "id=" + id +
                ", numberLevel='" + numberLevel + '\'' +
                ", qualificationLevel='" + qualificationLevel + '\'' +
                '}';
    }
}
