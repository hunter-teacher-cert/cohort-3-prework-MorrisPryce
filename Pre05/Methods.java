import java.io.*;
import java.util.*;

public class Methods{
  
  public static void main(String[] args){

  System.out.println(isDivisible(12, 3));  
  System.out.println(isTriangle(5,5,5));
}
  
public static boolean isDivisible(int n, int m){ 
 if (n % m == 0){
  return true;
       }else{
  return false; 
 } 
}
  
public static boolean isTriangle(int a, int b, int c){
  //return (a + b > c && b + c > a && c + a > b);
  if (a + b > c && b + c > a && c + a > b){
    return true;  
  }else{
    return false;
  }
}
  }
