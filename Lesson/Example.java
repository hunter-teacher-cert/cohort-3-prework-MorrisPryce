import java.io.*;
import java.util.*;

public class Example{
  
public static void zoo1(int value, String S, String s){
System.out.println(value);

}

public static void main(String[] args){
int value = 11;
int date = 24;
int year = 2022;

System.out.println(value);
petName("Penny",  "Macbeth street");
printAmerica("Monday" , "January" , date , year);

}

public static void petName(String S, String s){

System.out.println("My pets name is " + S + ", Street lived on " + s);
//System.out.println("Street lived on "+ s);
}

public static void printAmerica(String day, String month, int date, int year){
System.out.println(day + ", " + month + " " + date + ", " + year);


}

}