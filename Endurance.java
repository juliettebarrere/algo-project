import java.*;

public class Endurance extends Activity{
	
	public int time;
	

	public Endurance(String name, int time, int coeff){
		super(name,coeff);
		time=this.time;
		
	
	}

	public double burnedcalories(Human human){
		double i= human.weight*this.coeff*(this.time/60);
		return i;
	}
	
}
