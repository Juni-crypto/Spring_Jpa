package single_table;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;  

@Entity  
@DiscriminatorValue("Hde_team")  
public class Hde_Team extends Makers{  
      
@Column(name="total_Hde")    
private int totalst;  
  
@Column(name="no_of_staff")     
private int noOfStaff;  
  

//setters and getters  
public int getTotalst() {
	return totalst;
}
public void setTotalst(int totalst) {
	this.totalst = totalst;
}
public int getNoOfStaff() {
	return noOfStaff;
}
public void setNoOfStaff(int noOfStaff) {
	this.noOfStaff = noOfStaff;
}
}  
