package model;

import lombok.*;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;

//@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "EMPLOYEE")
public class Employee {

    @Id
    private String employeeUsername;

    @OneToOne(mappedBy = "permissionUser")
    private Permissions permissions;

    private String name;

    private Integer zip_code;

    private String city;

    private String street;

    private String house_number;

    private Integer phone_number;

    private String email;

    @OneToMany(mappedBy = "receptionist")
    List<Guest> guests = new ArrayList<>();

    @Override
    public String toString() {
        return "Employee{" +
                "username='" + employeeUsername + '\'' +
                ", name='" + name + '\'' +
                ", zip_code=" + zip_code +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house_number='" + house_number + '\'' +
                ", phone_number=" + phone_number +
                ", email='" + email + '\'' +
                '}';
    }

    public String getEmployeeUsername() {
        return employeeUsername;
    }

    public void setEmployeeUsername(String employeeUsername) {
        this.employeeUsername = employeeUsername;
    }

    public Permissions getPermissions() {
        return permissions;
    }

    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getZip_code() {
        return zip_code;
    }

    public void setZip_code(Integer zip_code) {
        this.zip_code = zip_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse_number() {
        return house_number;
    }

    public void setHouse_number(String house_number) {
        this.house_number = house_number;
    }

    public Integer getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Integer phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
