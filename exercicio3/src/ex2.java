import java.util.*;
public class ex2 {
	public static void main(String[] args) {
//		Escreva um programa em Java que preencha um vetor de 10 posições com valores 
//		inteiros (o preenchimento deverá ser feito por um método). Um segundo método deverá ser 
//		chamado para calcular e retornar a soma dos elementos armazenados no array.
//		Ultiliazando a recursividade.
		
		int[]vet=new int[10];
		int s=0;
		int x =0 ;
		p(vet);
		s=c(vet,s,x);
		
		System.out.print("soma valores --> "+s);
	}
	public static int[] p(int[]vet) {
		Scanner t=new Scanner(System.in);
		for(int i=0; i<10; i++) {
			System.out.println("O valor que vai ser armazenado no vetor é --> "+(i+1));
			vet[i]=t.nextInt();
		}
		return vet;
	}
	public static int c(int[]vet, int s, int x) {
		if(x==10) {
			return s;
		}else {
			s+=vet[x];
			return c(vet, s, x+1);
		}
	}
}
