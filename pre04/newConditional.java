import java.io.*;
import java.util.*;

public class newConditional{

public static void main(String[] args){
  int x; 
  x = 7;
if (x > 0 || x < 10) {
  System.out.println("positive single digit number.");
    }else{
System.out.println("Negative single digit number");
}
countdown(3);
}

public static void countdown(int n){
  if (n== 0){
    System.out.println("Blasf Off!!");
  } else {
        System.out.println(n);
        countdown(n - 1);
    }

}
}



  
