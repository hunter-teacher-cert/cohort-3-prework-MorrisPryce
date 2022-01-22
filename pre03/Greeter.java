import java.io.*;
import java.util.*;

public class Greeter{


public static void greet(){

System.out.println("Whats your name?");
}

public static void main(String[] args){
System.out.println("Hey");
greet();
Greeting("I am Sandy");
}

public static void Greeting(String name){
System.out.println("Good Morning "+ name);

}

}