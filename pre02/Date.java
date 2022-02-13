import java.io.*;
import java.util.*;


public class Date{

public static void main(String[] args){
int date = 24;
int year = 2022;
printAmerica("Monday" , "January" , date , year);
}

public static void printAmerica(String day, String month, int date, int year){
/*System.out.println(day);
System.out.println( month);
System.out.println( date);
System.out.println( year);*/
System.out.println(day + ", " + month + " " + date + ", " + year);

}
}