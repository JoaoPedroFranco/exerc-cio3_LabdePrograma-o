import java.util.Random;
public class ex1 {
	public static void main(String[] args) {
//		Escreva um programa em Java que preencha um vetor de 10 posi��es com valores 
//		inteiros (o preenchimento dever� ser feito por um m�todo). Um segundo m�todo dever� ser 
//		chamado para calcular e retornar a soma dos elementos armazenados no array.
		
		int[] x=new int[10];
		
		preencher(x);
		calcular(x);
}
		public static void preencher (int[]x) {
			Random gerador=new Random();
				for(int i=0; i<x.length; i++) {
					x[i]=gerador.nextInt(2);
					
					System.out.println(+x[i]);
	}
}
		public static void calcular (int[]x) {
			int y=0;
			for(int i=0; i<x.length; i++) {
				y+=x[i];
		}
			System.out.println("A soma dos elementos armazenados no array � de --> "+y);
	}
}