package FortyPgms;

public class InnerClass1 {

		 private String msg="Welcome"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+", starting learning Inner Classes");}  
		 }  


		public static void main(String[] args) {

			InnerClass1 obj=new InnerClass1();
			InnerClass1.Inner in=obj.new Inner();  
			in.hello();  
		}
	}


	
