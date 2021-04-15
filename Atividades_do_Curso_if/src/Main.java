import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int x ;
	
	System.out.println("Digite o Numero :");
	
	
	
	x = sc.nextInt();
	
	if (x >= 0) {
		System.out.println("numero e Positivo");
	}
	else {
		System.out.println("Numero e Negativo");
	}
	
	
	
	
	sc.close();
}
}