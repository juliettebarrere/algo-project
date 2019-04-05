

public class Workout{

	// attributes
	
	Exercise exo1;
	Exercise exo2;
	Exercise exo3;
	
	
	//constructor
	public Workout (Exercise exo1, Exercise exo2, Exercise exo3){
		this.exo1=exo1;
		this.exo2=exo2;
		this.exo3=exo3;
		
	}
	
	//methods
	public int totCalories(Human human){
		
		int caloriesburned=0;
		Exercise [] allexos={this.exo1, this.exo2, this.exo3};
		
		for(int i=0; i<3; i++){
		caloriesburned+= allexos[i].burnedcalories(human);
		
		}
		return caloriesburned*2;
	}

}


