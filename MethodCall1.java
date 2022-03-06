package FortyPgms;
//method call based on value
public class MethodCall1 {
	int val=200;

	int operation(int val) {
		val =val*10/100;
		return(val);
	}

	public static void main(String args[]) {
		MethodCall1 mc = new MethodCall1();
		System.out.println("value of mc before operation "+mc.val);
		mc.operation(150);
		System.out.println("value of mc after operation "+mc.val);
		}

}
