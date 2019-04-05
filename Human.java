import java.util.*;

public class Human {
	
	String name;
	double weight;
	double height;
	int age;
	boolean sex;
	String goal;
	double calEaten;
	
	public Human(String Name, double Weight, int Age, boolean Sex, String Goal, int CalEaten){
		this.name = Name;
		this.weight = Weight;
		this.age = Age;
		this.sex = Sex;
		this.goal = Goal;
		this.calEaten = CalEaten;
		
	}
	
	public double BMIM() {
		double BMI;
		BMI=weight/(Math.pow(height, 2));
		return BMI;
	}
	
	public double BMRM() {
		double BMR;
		if (sex == true) { //female
			BMR=10*weight + 6.25*height - 5*age - 161;
		}else{ //male
			BMR=10*weight + 6.25*height - 5*age + 5;
		}
		return BMR;
	}
	
	public double TotCalBurnedM(Endurance endurance,Workout workout){
		double TotalCalBurned = workout.totCalories(this) + endurance.burnedcalories(this);// burned with workout + burned with endurance activity already done in the day
		return TotalCalBurned;
	}
	
	public double CaloriesRemainM(Endurance endurance,Workout workout) {
		double CaloriesRemain;
		CaloriesRemain = BMRM() + TotCalBurnedM(endurance, workout) - calEaten;
		return CaloriesRemain;
	}

}


