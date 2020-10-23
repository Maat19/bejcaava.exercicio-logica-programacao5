
import java.util.Scanner;

public class Resultado {

	public static Resultado resultado;
	public int Numero;
	public int Soma =0;
	public Scanner Leitura = new Scanner(System.in);
	
	public void Numero() {
		System.out.println("Digite o número desejado:");
		Numero =Leitura.nextInt();
	}	
	
	public void Soma() {
		while (Numero >0){
			Soma += (Numero%10);
			
			Numero /= 10;
		}
		
		System.out.println("Seu resultado é:" +Soma);
	
	}
	
	
}
