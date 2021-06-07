package com.hiber.examples;

import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name = "Icaurushub")  
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)   
  
public class Icaurushub {  
@Id  
@GeneratedValue(strategy=GenerationType.AUTO)  
      
@Column(name = "id")  
private int id;  
  
@Column(name = "name")  
private String name;  



public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
  
//setters and getters  
}  
