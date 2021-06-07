package table_per_class;
import javax.persistence.*;  

@Entity  
@Table(name="Trainer")  
@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name"))  
}) 
public class Trainer extends Icaurushub{  
      
@Column(name="dept")    
private String dept;  
  
@Column(name="fees")     
private float fees;  
  

 
//setters and getters  
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public float getFees() {
	return fees;
}
public void setFees(float fees) {
	this.fees = fees;
}
}  