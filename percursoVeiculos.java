package Rafael;
    
	import java.util.Scanner;
	
	public class percursoVeiculos {
	
	public static void main (String args[]) {
      
	Scanner input = new Scanner(System.in);
	
	double TaxaDeConsumo;//media de combustível por km
	double km1;//km inicial
	double km2;//km final
	double kmtotal;//km percorridos
	double litros;//combustivel gasto 
	double kmLitro=10;
	
	System.out.print(" Informe o KM inicial: " );
	km1 = input.nextDouble();
	System.out.print(" Informe o KM final: " ); 
	km2 = input.nextDouble();   System.out.print(" Informe a quantidade de litros inseridos:" ); 
	litros = input.nextDouble();
	
	kmtotal = km2 - km1;
	
	
	
	TaxaDeConsumo = kmtotal / litros;
			
	kmLitro = kmtotal / kmLitro; 
	
	System.out.println("=================================================================");
	System.out.println(" O total percorrido foi de: " +kmtotal+ " Km");
	System.out.println(" O total de Litros gasto foi: " +kmLitro+ " litros por km"); 
	
	input.close();
	
	}
  
}
