import java.io.*;
import java.util.*;


public class Time{

public static void main(String[] args){
int hour = 10;
int minute = 60;
int second = 60;
System.out.println(hour);
currentTime(hour, minute, second);

}
public static void currentTime(int hour, int minute, int second){
System.out.print(hour);
System.out.print(" : ");
System.out.print(minute);
System.out.print(" : ");
System.out.println(second);
System.out.println(hour * second);
System.out.println("Number of seconds since midnight:" +(hour *(minute*60)));
}  



}
