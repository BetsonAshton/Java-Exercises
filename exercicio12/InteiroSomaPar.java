package exercicio12;

public class InteiroSomaPar {
	public static void main(String[] args) {

		for (int i = 100; i <= 150; ++i) {
			
			//num vai ser o numero de 100 a 150
			int num = i;
			
			//sum vai ser a soma dos 3 digitos(ex: 103, 3 digitos)
			//sum retorna a 0 para contar o proximo numero em cada repetiçao do for
			int sum = 0;
			
			// aqui por exemplo pegarei 103 
			while (num != 0) {

				//acharei seu resto que vai ser 3 , somarei ao sum
				sum += num % 10;
				
				//vou dividir 103/10 que vai ser igual a 10.3
				//só que como  estou dividindo um inteiro, o numero dps da virgula e ignorado
				//logo 10.3 acaba virando 10
				num = num / 10;
				
				//faço de novo o mesmo processo só que começando com 10

			}
			
			//no while, foi somado os 3 digitos ao sum
			//aqui, estou verificando se essa soma é par
			if (sum % 2 == 0) {
				//quando ela for par, imprimo o numero  ( exemplo: 101 = 1 + 0 +1 = 2 logo é par e 101 será  imprimido no console)
				System.out.println(i);

			}
		}

	}
}
