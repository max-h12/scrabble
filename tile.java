import java.util.*;
import java.io.*;
public class tile{
   private int val;
   private String letter;

   public tile(){
      letter = "";
      val = 0;
   }
   
   public tile(String l){
      letter = l;
      val = calculateValue(letter);
   }
   
   public static int calculateValue(String letter){
      int value = 0;
      switch(letter){
         case "A":
            value = 1;
            break;
         case "B":
            value = 3;
            break;
         case "C":
            value = 3;
            break;
         case "D":
            value = 2;
            break;
         case "E":
            value = 1;
            break;
         case "F":
            value = 4;
            break;
         case "G":
            value = 2;
            break;
         case "H":
            value = 4;
            break;
         case "I":
            value = 1;
            break;
         case "J":
            value = 8;
            break;
         case "K":
            value = 5;
            break;
         case "L":
            value = 1;
            break;
         case "M":
            value = 3;
            break;
         case "N":
            value = 1;
            break;
         case "O":
            value = 1;
            break;
         case "P":
            value = 3;
            break;
         case "Q":
            value = 10;
            break;
         case "R":
            value = 1;
            break;
         case "S":
            value = 1;
            break;
         case "T":
            value = 1;
            break;
         case "U":
            value = 1;
            break;
         case "V":
            value = 4;
            break;
         case "W":
            value = 4;
            break;
         case "X":
            value = 8;
            break;
         case "Y":
            value = 4;
            break;
         case "Z":
            value = 10;
            break;
            
      }
      return value;
   }
   
   public String toString(){
      return "Letter:"+letter+" Point Value:"+val;
   }
   
   public String getLetter(){
      return letter;
   }
   
   public int getVal(){
      return val;
   }
   
}