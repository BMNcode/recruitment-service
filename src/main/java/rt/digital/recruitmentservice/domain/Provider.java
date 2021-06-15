package rt.digital.recruitmentservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "providers")
public class Provider extends User {

    @Column(name = "company")
    private String companyName;

    @OneToMany(mappedBy = "provider")
    private Set<Employee> employees;

    public Provider() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @JsonIgnore
    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }


}
