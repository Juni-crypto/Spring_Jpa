package single_table;

import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name = "Makers")  
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name="stream",discriminatorType=DiscriminatorType.STRING)  
@DiscriminatorValue(value="worksstream")  
  
public class Makers {  
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
