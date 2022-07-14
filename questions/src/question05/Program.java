package question05;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escreva algo que você queira inverter: ");
		String str = sc.nextLine();
		System.out.println(str);
		char[] ch = str.toCharArray();
		int begin = 0;
		int end = ch.length - 1;
		char temp;
		while (end > begin) {
			temp = ch[begin];
			ch[begin] = ch[end];
			ch[end] = temp;
			end--;
			begin++;
		}
		str = new String(ch);
		System.out.println(str);
		sc.close();
	}

}
