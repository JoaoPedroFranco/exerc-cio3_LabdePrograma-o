import java.util.Scanner;
public class ex3 {
	public static void main(String[] args) {
//		Escreva um programa em Java que leia um número representando um número na base 
//		binária. O seu programa deverá ter um método para converter e retornar o valor da base binária 
//		para decimal.
		
		Scanner t=new Scanner(System.in);
		int b;
		
		System.out.print("número binário --> ");
		b=t.nextInt();
		
		int[] c={1,2,4,8,16,32,64,128};
		int s=0;
		
		for(int i=0; i<8; i++) {
			if((b%10) ==1) {
				s+=c[i];
				b/=10;
			}else {
				b/=10;
			}
		}
			System.out.println(s);
	}
}


