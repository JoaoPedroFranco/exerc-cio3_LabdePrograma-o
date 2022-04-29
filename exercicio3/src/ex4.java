import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
//		Escreva um programa em Java que leia um número representando um número na base 
//		binária. O seu programa deverá ter um método para converter e retornar o valor da base binária 
//		para decimal. 
//		Usando a recursividade.
		
		Scanner t=new Scanner(System.in);
		int b;
		int x=0;
		
		System.out.print("número binário --> ");
		b=t.nextInt();
		
		int[] c={1,2,4,8,16,32,64,128};
		int s=0;
		
		System.out.println(metodo1(b,c,s,x));
	}
		public static int metodo1(int b,int[]c,int s,int x){
			if(x==8) {
				return s;
			}else {
				if((b%10) ==1) {
					s+=c[x];
					b/=10;
					x++;
						return metodo1(b,c,s,x);
				}else {
					b/=10;
					x++;
						return metodo1(b,c,s,x);
			}			
		}
	}
}
