package com.hiber.examples;

import javax.persistence.*;

import javax.persistence.Entity;  

@Entity  
@Table(name="SeniorEmployee")  
@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name"))  
}) 
public class SeniorEmployee extends Icaurushub{  
      
@Column(name="age")    
private int age;  
  
@Column(name="salary")     
private float salary;  
  
 
//setters and getters  
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}

}  
