import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x , y , z , total ;
		
		System.out.println("Digite a nota da Primeira etapa :");
		x = sc.nextInt();
		System.out.println("Digite a nota da Segundar etapa :");
		y = sc.nextInt();
		System.out.println("Digite a nota da Terceira etapa :");
		z = sc.nextInt();
		total = x + y + z ;
		
		if (total <= 45 ) {
			System.out.println("Voc� foi reprovado sua nota e :" + total + " N�o foi falta de avisar ");
		
		}
		else {
		if  (total >=60 ){
			System.out.println("Voc� foi aprovado sua nota e : " + total + " Parabens " );
		
		}
		else {
			System.out.println("Voc� est� em recupera��o sua nota e : " + total + " N�o foi falta de avisar");
		}
		
	
	
		System.out.println(x);
	
		}
		sc.close();
}
}
