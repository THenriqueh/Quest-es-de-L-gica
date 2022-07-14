package question02;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 1;
		int b = 0;
		int aux;
		System.out.print("Digite um n�mero para saber se esse n�mero faz parte da sequencia de Fibonacci (0 � 832040): ");
		int n = sc.nextInt();
		System.out.println();
		Fibonacci fibo = new Fibonacci(n);
		for (int i=0;i<30;i++) {
			System.out.print(a + " ");
			aux = a;
			a = a + b;
			b = aux;
		}
		System.out.println();
		System.out.println();
		System.out.println(fibo.fibo(n));
		sc.close();
	}

}
