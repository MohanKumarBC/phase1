package practice.Proj;
import java.io.*;
public class FileHdling2 {
 public static void main(String[] args){
 // Append text to Existing File.
 String path = "C:\\workspace\\Practice\\src\\practice\\Proj\\mohan.txt";
 String text = " Currently doing training at Simplilearn";
 try
 {
 FileWriter f = new FileWriter(path,true);
 f.write(text);
 f.close();
 System.out.println("Append done Successfully..");
 }
 catch(IOException e){
 System.out.println(e);
 } 
 }
}
