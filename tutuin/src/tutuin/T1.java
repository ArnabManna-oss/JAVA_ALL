package tutuin;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.*;
class T1 {
 public static void main(String[] args) {
   Scanner in= new Scanner(System.in);
   int time;
   System.out.println("enter the time in seconds :");
   time=in.nextInt();
   
   int hr=time/3600;
   int temp=time%3600;
   int min=temp/60;
   int sec=temp%60;
   
 System.out.println("enterd time "+time+" sec");
 System.out.println("after conversion"+hr+" hr "+min+" min  "+sec+" sec");
 }
}