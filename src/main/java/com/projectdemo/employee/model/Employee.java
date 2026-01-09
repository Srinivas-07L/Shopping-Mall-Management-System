package com.projectdemo.employee.model;
import com.projectdemo.employee.model.Employee; 
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@Table(name = "employee") 
public class Employee {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    private String firstName;
    private String lastName;
    private String email; 
    private String designation; 
    private Double salary; 
}