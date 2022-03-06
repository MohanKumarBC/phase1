package practice.Proj;
import java.util.Scanner;
public class ArithmeticCalc {
			static int n1,n2;
			static int o;
			public static void main(String[] args) {
				Scanner s1=new Scanner(System.in);
				System.out.println("Enter the Numbers");
				
				n1=s1.nextInt();
				n2=s1.nextInt();
				
				System.out.println("Enter the Operations (+,-,*,/)");
				
				char op = s1.next().charAt(0);
				
				switch (op) {
				case '+':
					o=n1+n2;
					break;
				case '-':
					o=n1-n2;
					break;
				case '*':
					o=n1*n2;
					break;
				case '/':
					o=n1/n2;
					break;
					

				default:
					System.out.println("Enter correct input");
					break;
				}
				System.out.println("The Operation of two numbers is:");
				System.out.println(n1+" "+op+" "+n2+" = " + o);
				
			}
}
