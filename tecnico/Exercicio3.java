
public class Exercicio3 {
	public static void main(String[] args) {
		float num1 = 160.67f;
		float num2 = 160.67f;
		
		if(num1 > num2) {
			System.out.println("O numero 1 '" + num1 + "' eh maior que o numero 2 '" + num2 + "'");
		} else if(num2 > num1) {
			System.out.println("O numero 1 '" + num1 + "' eh menor que o numero 2 '" + num2 + "'");
		} else {
			System.out.println("Os dois numeros sao iguais");
		}
	}
}
