package Oop;
import java.io.*;

import org.w3c.dom.events.MouseEvent;

import Oop.*;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    Employee Jim;
    Jim = new Employee("Jim", "Smith", new Address(1725, "O'ConnorStreet", "Markham", "On", "Canada", "16707"));
    int random = (int)(Math.random() * 50 + 1);
    System.out.println(Jim);

    int y1 = random;

    Employee Mat;
    Mat = new Employee("Mat", "Williams", new Address(1768, "BayStreet", "Markham", "On", "Canada", "42069"));
    int random2 = (int)(Math.random() * 50 + 1);
    System.out.println(Mat);

    int y2 = random2; 
    Employee Joe;
    Joe = new Employee("Joe", "Brown", new Address(1748, "VictoriaStreet", "Markham", "On", "Canada", "44467"));
    int random3 = (int)(Math.random() * 50 + 1);
    System.out.println(Joe);

    int y3 = random3;
    Employee Moe;
    Moe = new Employee("Moe", "Miller", new Address(1788, "9thline", "Markham", "On", "Canada", "17601"));
    int random4 = (int)(Math.random() * 50 + 1);
    int y4 = random4;
    System.out.println(Moe);

    System.out.println("");

int a = random;
int b = random2;
int c = random3;
int d = random4;
int tmp;
if (a > b) { tmp = a; a = b; b = tmp; }
if (c > d) { tmp = c; c = d; d = tmp; }
if (a > c) { tmp = a; a = c; c = tmp; }
if (b > d) { tmp = b; b = d; d = tmp; }
if (b > c) { tmp = b; b = c; c = tmp; }
      
    System.out.println("pick a roll:");
    System.out.println("1:Worker");
    System.out.println("2:Manager");
    System.out.println("3:vice President");
    System.out.println("4:Ceo");
    System.out.println("");

    int intoption;

    intoption = Integer.parseInt(keyboard.readLine());

    switch(intoption) {
  case 1:
    if(a == y1){
      System.out.println(Jim);
      System.out.println("Jim's Parts Per Day");
      System.out.println("300");
      System.out.println("Jim's Salary");
      System.out.println("85,000");
    }
    if(a == y2){
      System.out.println(Mat);
      System.out.println("Mat's Parts Per Day");
      System.out.println("500");
      System.out.println("Mat's Salary");
      System.out.println("100,000");
    }
    if(a == y3){
      System.out.println(Joe);
      System.out.println("Joe's Parts Per Day");
      System.out.println("100");
      System.out.println("Joe's Salary");
      System.out.println("50,000");
    }
    if(a == y4){
      System.out.println(Moe);
      System.out.println("Moe's Parts Per Day");
      System.out.println("200");
      System.out.println("Moe's Salary");
      System.out.println("75,000");
    }
    break;
  case 2:
    if(a == y1){
      System.out.println(Jim);
      System.out.println("Jim's worker count");
      System.out.println("500");
      System.out.println("Jim's Salary");
      System.out.println("150,000");
    }
    if(a == y2){
      System.out.println(Mat);
      System.out.println("Mat's worker count");
      System.out.println("500");
      System.out.println("Mat's Salary");
      System.out.println("150,000");
    }
    if(a == y3){
      System.out.println(Joe);
      System.out.println("Joe's worker count");
      System.out.println("500");
      System.out.println("Joe's Salary");
      System.out.println("150,000");
    }
    if(a == y4){
      System.out.println(Moe);
      System.out.println("Moe's worker count");
      System.out.println("500");
      System.out.println("Moe's Salary");
      System.out.println("150,000");
    }
    break;
  case 3:
    if(a == y1){
      System.out.println(Jim);
      System.out.println("Jim's company earnings");
      System.out.println("400,000");
      System.out.println("Jim's Salary");
      System.out.println("300,000");
    }
    if(a == y2){
      System.out.println(Mat);
      System.out.println("Mat's company earnings");
      System.out.println("400,000");
      System.out.println("Mat's Salary");
      System.out.println("300,000");
    }
    if(a == y3){
      System.out.println(Joe);
      System.out.println("Joe's company earnings");
      System.out.println("400,000");
      System.out.println("Joe's Salary");
      System.out.println("300,000");
    }
    if(a == y4){
      System.out.println(Moe);
      System.out.println("Moe's company earnings");
      System.out.println("400,000");
      System.out.println("Moe's Salary");
      System.out.println("300,000");
    }
    break;
  case 4:
    if(a == y1){
      System.out.println(Jim);
      System.out.println("Jim's Salary");
      System.out.println("420,690");

    }
    if(a == y2){
      System.out.println(Mat);
      System.out.println("Mats's Salary");
      System.out.println("420,690");

    }
    if(a == y3){
      System.out.println(Joe);
      System.out.println("Joe's Salary");
      System.out.println("420,690");

    }
    if(a == y4){
      System.out.println(Moe);
      System.out.println("Moe's Salary");
      System.out.println("420,690");
    }
    break;
    case 5:
    System.out.println("How's your day going, Good or Bad");
    String day = keyboard.readLine();
    if(day.equalsIgnoreCase("good")){
      System.out.println("That's great to hear");
    }else if(day.equalsIgnoreCase("bad")){
      System.out.println("Thats's sad");
    }
    break;
    case 6:
    for(int r = 0;r < 1 ;r++){
    System.out.println("( ͡° ͜ʖ ͡°)");
    System.out.println("( ͡ ͜ʖ ͡  )");
    }
    break;
  default:
    System.out.println("N/A");
    }
  }
}