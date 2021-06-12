package rt.digital.recruitmentservice.domain;

import java.util.Set;

public class Employee {
    private String firstName;
    private String middleName; //null
    private String lastName;
    private Double HourlyRate;
    private Position position;
    private Set<Skill> skills;
    private String note;
    private String description;
}
