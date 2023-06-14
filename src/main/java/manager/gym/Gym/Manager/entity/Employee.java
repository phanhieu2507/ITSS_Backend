package manager.gym.Gym.Manager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor // constructor using all fields as para
@NoArgsConstructor // constructor using no field as para
@Table(name = "EMPLOYEE")
public class Employee {
    @Id // every id of entity needs this notation
    @GeneratedValue
    private int id;
    private String name;
    private double salary;
    private String address;
    public Employee (String name, double salary){
        super();
        this.name = name;
        this.salary = salary;
    }
}
