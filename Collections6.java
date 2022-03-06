package FortyPgms;
import java.util.*;

public class Collections6 {
	

		public static void main(String[] args) {
			//creating arraylist
			System.out.println("ArrayList");
			ArrayList<String> city=new ArrayList<String>();   
		      city.add("Madras");//
		      city.add("Bombay");    	   
		      System.out.println(city);  
			
			//creating vector
		      System.out.println("\n");
		      System.out.println("Vector");
		      Vector<Integer> vec = new Vector();
		      vec.addElement(20); 
		      vec.addElement(40); 
		      System.out.println(vec);
			
			//creating linkedlist
		      System.out.println("\n");
		      System.out.println("LinkedList");
		      LinkedList<String> names=new LinkedList<String>();  
		      names.add("madhu");  
		      names.add("jacob");  	      
		      Iterator<String> itr=names.iterator();  
		      while(itr.hasNext()){  
		       System.out.println(itr.next());  
		       
		       //creating HashSet
		       System.out.println("\n");
		       System.out.println("HashSet");
		       HashSet<Integer> s=new HashSet<Integer>();  
		       s.add(30);  
		       s.add(10);  
		       s.add(15);
		       s.add(80);
		       System.out.println(s);
		       
		       //creating linkedHashset
		       System.out.println("\n");
		       System.out.println("LinkedHashSet");
		       LinkedHashSet<Integer> s2=new LinkedHashSet<Integer>();  
		       s2.add(20);  
		       s2.add(15);  
		       s2.add(30);
		       s2.add(19);	       
		       System.out.println(s2);
		      	} 
		      }  
		}







