package rt.digital.recruitmentservice.domain;

import javax.persistence.*;

@Entity
@Table(name = "skill_level")
public class SkillLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "skill_level_id")
    private Long id;

    @Column(name = "number_level")
    private String numberLevel;

    @Column(name = "position_level")
    private String positionLevel;

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

    public String getPositionLevel() {
        return positionLevel;
    }

    public void setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel;
    }
}
