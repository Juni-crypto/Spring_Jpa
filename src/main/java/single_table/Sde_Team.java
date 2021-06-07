package single_table;
import javax.persistence.*;  

@Entity  
@DiscriminatorValue("Sde_team")  
public class Sde_Team extends Makers{  
      
@Column(name="no_of_sections")    
private int nos;  
  
@Column(name="member_per_section")     
private int sps;  
  

public int getNos() {
	return nos;
}
public void setNos(int nos) {
	this.nos = nos;
}
public int getSps() {
	return sps;
}
public void setSps(int sps) {
	this.sps = sps;
}

//setters and getters  
}  