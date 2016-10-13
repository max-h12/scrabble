import java.util.*;
import java.io.*;
public class tile{
   private int val;
   private String letter;
   boolean doubled,tripled,isTile,isAny,isPlaced;

   public tile(){
      letter = "";
      val = 0;
      doubled = false;
      tripled = false;
      isTile = false;
      isAny = false;
      isPlaced = false;
   }
   
   public tile(String l){
      if(l.equals("BL")){
         isAny = true;
         val = 0;
      }
      else{
         letter = l.toUpperCase();
         val = calculateValue(letter);
      }
      isTile=true;
      doubled=false;
      tripled=false;
      isPlaced = false;
   
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
   
   public boolean getDouble(){
      return doubled;
   }
   public void doubleLetter(){
      if(!this.getDouble()&&(!this.getTriple())){
         val*=2;
         doubled=true;
      }
   }
   
   public boolean getTriple(){
      return tripled;
   }
   public void tripleLetter(){
      if(!this.getDouble()&&(!this.getTriple())){
         val*=3;
         tripled=true;
      }
   } 
   
   public boolean isTile(){
      return isTile;
   }

   public boolean isAny(){
      return isAny;
   }
   
   public void setPlaced(){
      isPlaced = true;
   }
   
   public boolean isPlaced(){
      return isPlaced; 
   }
}