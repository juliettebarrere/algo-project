import java.*;

public abstract class Activity{
	public String name;
	int coeff;
	
	
	public Activity(String name, int coeff){
		name=this.name;
		coeff=this.coeff;
		
	}
	
	public abstract double burnedcalories(Human human);
			
}		
