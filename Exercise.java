import  javax.swing.ImageIcon;


public class Exercise extends Activity {
	
	
	String image1;
	String image2;
	
	String details;
	
	
	public Exercise (String name, String E1, String E2,int coeff, String det){
		
		super(name,coeff);
		this.image1 = E1;
		this.image2 = E2;
		this.details = det;
		
	}
	
	public double burnedcalories(Human human){// use as Exercisename.burnedcalories();
		
		
		return this.coeff*1;
		
		
	}
}
		
		

