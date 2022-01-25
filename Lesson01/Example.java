import java.io.*;
import java.util.*;

public class Example{
  
public static void zoo1(int value, String S, String s){
System.out.println(value);

}

public static void main(String[] args){
int value = 11;
int month = 01;
int date = 01;
int year = 2022;
System.out.println(value);
petName("Penny", "Takoma street");
printAmerica("Monday", "January", month, year );

}

public static void petName(String S, String s){

System.out.println("My pets name is " + S);
System.out.println("Street lived on "+ s);
}

public static void printAmerica(String day, String month, int date, int year){
System.out.println(day);
System.out.println(month);
System.out.println(date);
System.out.println(year);

}

}