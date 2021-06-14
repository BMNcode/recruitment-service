package rt.digital.recruitmentservice.domain;

import javax.persistence.*;

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

}
