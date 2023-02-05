package exercicexpgold;

import java.util.Scanner;

public class basicSalary {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salaireBrut = 0;
		Scanner sc = new Scanner(System.in);
		
		
		//demande à l'utilisateur d'entrer un salaire basic
		System.out.print("Enter The Basic Salary : ");
		double basicSalaire = sc.nextDouble();
		
		
		//calcul de salaire
		if(basicSalaire  <= 10000){
			salaireBrut = basicSalaire + (0.2 * basicSalaire) + (0.8 * basicSalaire) ;
			System.out.print("Gross Salary : " + salaireBrut);
			
		}
		else if(basicSalaire  <= 20000){
			salaireBrut = basicSalaire + (0.25 * basicSalaire) + (0.9 * basicSalaire) ;
			System.out.print("Gross Salary : " + salaireBrut);
			
		}
		else if(basicSalaire  > 20000){
			salaireBrut = basicSalaire + (0.3 *basicSalaire) + (0.95 * basicSalaire) ;
			System.out.print("Gross Salary : " + salaireBrut);
			
		}
		}
		
		

	}


