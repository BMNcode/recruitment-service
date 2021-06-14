package rt.digital.recruitmentservice.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "providers")
public class Provider extends User{

    @Column(name = "company")
    private String companyName;

    @OneToMany(mappedBy = "provider")
    private Set<Employee> employees;
}
