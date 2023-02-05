package exercicexpgold;

public class RLVariables {
	// Declare local variable here
	private int mySecretNumber = 10;
	//definition de la methode displaySecret
	public void displaySecret(){
        // write your code here
		int mySecretNumber = 45;
		System.out.println("Local Variable: " + mySecretNumber + "\n");
		System.out.println("Reference variable accessing instance variable: " + this.mySecretNumber + "\n");
		System.out.println("Reference variable accessing instance variable that points to the local variable: " + mySecretNumber + "\n");
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RLVariables secret = new RLVariables();
		
		secret.displaySecret();

	}

}
