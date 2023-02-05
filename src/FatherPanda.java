package exercicexpgold;

public class FatherPanda {
	//declarer les variables
	public boolean  isPredator;
	protected int weight;
	private int age;
	
	public FatherPanda(boolean isPre, int poids, int age){
		this.isPredator = isPre;
		this.weight = poids;
		this.age = age;
		
	}
	 
	//definition de la methode eat
	public void eat(){
		System.out.println("After each meal, Father Panda gains weight: " + this.weight
				+" kg" + "\n" + "And his age is: " + this.age + " years old " + "\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creer une instance de la classe FatherPanda
		FatherPanda FatherFanta = new FatherPanda(true, 85, 55);
		
		
		FatherFanta.eat();

	}

}
