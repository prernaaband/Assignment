package Assign;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class File_Handling {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     File obj=new File("F:\\File.txt");
     System.out.println("Print words whos length greater than 5");
     Scanner sc=new Scanner(obj);
     String str="";
     String s=sc.nextLine();
     
     for(int i=0;i<s.length();i++)   //Using for loop.
     {
    	 if(s.charAt(i)!=' ') //If condition for checking space.
    	 {
    		 str+=s.charAt(i);
    	 }
    	 else
    	 {
    		if(str.length()>5)//Condition for length is greater than 5.
    			System.out.println(str+" ");
    		str=" "; 
    	 }
     }
     sc.close();
	}
}


