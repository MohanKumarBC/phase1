package practice.Proj;
import java.io.*;
public class FileHdling {
 public static void main(String[] args){
 
 try
 {
FileWriter f = new FileWriter("C:\\workspace\\Practice\\src\\practice\\Proj\\mohan.txt");
 try
 {
 f.write("Mohan is the employee of MNC ..!!");
 }
 finally
 {
 f.close();
 }
 System.out.println("Successfully Written..!! ");
 }
 catch(IOException i)
 {
 System.out.println(i);
 } 
 
 }
}
