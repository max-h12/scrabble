import java.io.*;
import java.util.*;
public class scrabble
{

   private SparseMatrix<tile> board = new SparseMatrix(15,15);
   Scanner input = new Scanner(System.in);
   ArrayList<tile> wordBag = new ArrayList<tile>();
   ArrayList<tile> rack1 = new ArrayList<tile>();
   ArrayList<tile> rack2 = new ArrayList<tile>();
   ArrayList<tile> tempWord = new ArrayList<tile>();
   ArrayList<Coordinate> doubleLetter = new ArrayList<Coordinate>();
   ArrayList<Coordinate> tripleLetter = new ArrayList<Coordinate>();
   ArrayList<Coordinate> doubleWord = new ArrayList<Coordinate>();
   ArrayList<Coordinate> tripleWord = new ArrayList<Coordinate>();
   int bagCount = 0, rack1count = 0, rack2count = 0;
   
   public static void main(String[]arg){
      Scanner input = new Scanner(System.in);
      System.out.println("WELCOME TO SCRABBLE");
      System.out.println("- Max Herz & LP Pham");
      int choice;
      System.out.println("Choose a game mode");
      System.out.println("1)Singleplayer");
      System.out.println("2)2 Player");
      choice = input.nextInt();
      while(choice<1||choice>2){
         System.out.println("Invalid Selection! Try again");
         System.out.println("Choose a game mode");
         System.out.println("1)Singleplayer");
         System.out.println("2)2 Player");
         choice = input.nextInt();
      }
      doubleLetter.add(new Coordinate(1, 2));doubleLetter.add(new Coordinate(1, 12));doubleLetter.add(new Coordinate(2, 1));doubleLetter.add(new Coordinate(2, 4));doubleLetter.add(new Coordinate(2, 10));doubleLetter.add(new Coordinate(2, 13));doubleLetter.add(new Coordinate(4, 2));doubleLetter.add(new Coordinate(4, 6));doubleLetter.add(new Coordinate(4, 8));doubleLetter.add(new Coordinate(4, 12));doubleLetter.add(new Coordinate(6, 4));doubleLetter.add(new Coordinate(6, 10));doubleLetter.add(new Coordinate(8, 4));doubleLetter.add(new Coordinate(8, 10));doubleLetter.add(new Coordinate(10, 2));doubleLetter.add(new Coordinate(10, 6));doubleLetter.add(new Coordinate(10, 8));doubleLetter.add(new Coordinate(10, 12));doubleLetter.add(new Coordinate(12, 1));doubleLetter.add(new Coordinate(12, 4));doubleLetter.add(new Coordinate(12, 10));doubleLetter.add(new Coordinate(12, 13));doubleLetter.add(new Coordinate(13, 2));doubleLetter.add(new Coordinate(13, 12)); 
      tripleLetter.add(new Coordinate(0, 6));tripleLetter.add(new Coordinate(0, 8));tripleLetter.add(new Coordinate(3, 3));tripleLetter.add(new Coordinate(3, 11));tripleLetter.add(new Coordinate(5, 5));tripleLetter.add(new Coordinate(5, 9));tripleLetter.add(new Coordinate(6, 0));tripleLetter.add(new Coordinate(6, 14));tripleLetter.add(new Coordinate(8, 0));tripleLetter.add(new Coordinate(8, 14));tripleLetter.add(new Coordinate(9, 5));tripleLetter.add(new Coordinate(9, 9));tripleLetter.add(new Coordinate(11, 3));tripleLetter.add(new Coordinate(11, 11));tripleLetter.add(new Coordinate(3, 3));tripleLetter.add(new Coordinate(3, 11));tripleLetter.add(new Coordinate(14, 6));tripleLetter.add(new Coordinate(14, 8));
      doubleWord.add(new Coordinate(1, 5));doubleWord.add(new Coordinate(1, 9));doubleWord.add(new Coordinate(3, 7));doubleWord.add(new Coordinate(5, 1));doubleWord.add(new Coordinate(5, 13));doubleWord.add(new Coordinate(7, 3));doubleWord.add(new Coordinate(7, 11));doubleWord.add(new Coordinate(9, 1));doubleWord.add(new Coordinate(9, 13));doubleWord.add(new Coordinate(11, 7));doubleWord.add(new Coordinate(13, 5));doubleWord.add(new Coordinate(13, 9));
      tripleWord.add(new Coordinate(0, 3));tripleWord.add(new Coordinate(0, 11));tripleWord.add(new Coordinate(3, 0));tripleWord.add(new Coordinate(3, 14));tripleWord.add(new Coordinate(11, 0));tripleWord.add(new Coordinate(11, 14));tripleWord.add(new Coordinate(14, 3));tripleWord.add(new Coordinate(14, 11));
   
    
    
      if(choice==1){
         System.out.println("In progress");
      //play singleplayer
      }
      else
      //play two player
         System.out.println("In progress");
      
   
   }
   public scrabble()
   {
      tile blanky = new tile();
      for(int i = 0; i < 15; i++)
      {
         for(int j = 0; j <15; j++)
         {
            board.add(i, j, blanky);
         }
      }
   }

   public static String[] createDictionary() throws IOException{
      String[]Dictionary = new String[getFileSize("dictionary.txt")];
      Dictionary = readFile("dictionary.txt");
      return Dictionary;
   }
  

   public static void addtile(SparseMatrix<tile> board, int r, int c, tile t)
   {
      board.set(r, c, t);
   }

//fills the "bag" with tiles
   public static void addWordBag(ArrayList<tile> wordBag, int bagCount)
   {
      for(bagCount = 0; bagCount < 9; bagCount++)
      {
         wordBag.add(new tile("A"));
      }
      for(bagCount = 9; bagCount < 11; bagCount++)
      {
         wordBag.add(new tile("B"));
      }
      for(bagCount = 11; bagCount < 13; bagCount++)
      {
         wordBag.add(new tile("C"));
      }
      for(bagCount = 13; bagCount < 18; bagCount++)
      {
         wordBag.add(new tile("D"));
      }
      for(bagCount = 18; bagCount < 31; bagCount++)
      {
         wordBag.add(new tile("E"));
      }
      for(bagCount = 31; bagCount < 33; bagCount++)
      {
         wordBag.add(new tile("F"));
      }
      for(bagCount = 33; bagCount < 36; bagCount++)
      {
         wordBag.add(new tile("G"));
      }
      for(bagCount = 36; bagCount < 40; bagCount++)
      {
         wordBag.add(new tile("H"));
      }
      for(bagCount = 40; bagCount < 48; bagCount++)
      {
         wordBag.add(new tile("I"));
      }
      for(bagCount = 48; bagCount < 49; bagCount++)
      {
         wordBag.add(new tile("J"));
      }
      for(bagCount = 49; bagCount < 50; bagCount++)
      {
         wordBag.add(new tile("K"));
      }
      for(bagCount = 50; bagCount < 54; bagCount++)
      {
         wordBag.add(new tile("L"));
      }
      for(bagCount = 54; bagCount < 56; bagCount++)
      {
         wordBag.add(new tile("M"));
      }
      for(bagCount = 56; bagCount < 61; bagCount++)
      {
         wordBag.add(new tile("N"));
      }
      for(bagCount = 61; bagCount < 69; bagCount++)
      {
         wordBag.add(new tile("O"));
      }
      for(bagCount = 69; bagCount < 71; bagCount++)
      {
         wordBag.add(new tile("P"));
      }
      for(bagCount = 71; bagCount < 72; bagCount++)
      {
         wordBag.add(new tile("Q"));
      }
      for(bagCount = 72; bagCount < 78; bagCount++)
      {
         wordBag.add(new tile("R"));
      }
      for(bagCount = 78; bagCount < 83; bagCount++)
      {
         wordBag.add(new tile("S"));
      }
      for(bagCount = 83; bagCount < 90; bagCount++)
      {
         wordBag.add(new tile("T"));
      }
      for(bagCount = 90; bagCount < 94; bagCount++)
      {
         wordBag.add(new tile("U"));
      }
      for(bagCount = 94; bagCount < 96; bagCount++)
      {
         wordBag.add(new tile("V"));
      }
      for(bagCount = 96; bagCount < 98; bagCount++)
      {
         wordBag.add(new tile("W"));
      }
      for(bagCount = 98; bagCount < 99; bagCount++)
      {
         wordBag.add(new tile("X"));
      }
      for(bagCount = 99; bagCount < 101; bagCount++)
      {
         wordBag.add(new tile("Y"));
      }
      for(bagCount = 101; bagCount < 102; bagCount++)
      {
         wordBag.add(new tile("Z"));
      }
      for(bagCount = 102; bagCount < 104; bagCount++)
      {
         wordBag.add(new tile("BL"));
      }
   }

//distributes tiles to each players rack
   public static void rackFillStart(ArrayList<tile> wordBag, ArrayList<tile> rack1, ArrayList<tile> rack2, int bagCount)
   {
      for(int i = 0; i < 7; i++)
      {
         int random1 = (int)(Math.random()* bagCount);
         bagCount--;
         int random2 = (int)(Math.random()* bagCount);
         bagCount--;
         rack1.add(wordBag.remove(random1));
         rack2.add(wordBag.remove(random2));
      }
   }
  
  //creates a string word from an arraylist of tiles
   public static String getWord (ArrayList<tile>word){
      String temp = "";
      for(int i =word.size()-1;i<=0;i--){
         temp +=word.get(i);
      }
      return temp;
   }
   
   //checks to see if an inputted string is a word in the dictionary
   public static boolean isWord(String word, String[]Dictionary){
      boolean temp = false;
      for(int i=0;i<Dictionary.length;i++){
         if(word.equals(Dictionary[i])){
            temp = true;
         }
      }
      return temp;
   }
  
  //prints the board
   public static void printBoard(SparseMatrix<tile> board)
   {
      System.out.print("_______________________________________________________");
      for(int r = 0; r < 15; r++)
      {
         System.out.print("|");
         for(int c = 0; c < 15; c++)
         {
            System.out.print(board.get(r, c).getLetter());
         }
      }
   }
   
   //returns file size
   public static int getFileSize(String fileName)throws IOException
   {
      Scanner input = new Scanner(new FileReader(fileName));
      int size=0;
      while (input.hasNextLine())				//while there is another line in the file
      {
         size++;										//add to the size
         input.nextLine();							//go to the next line in the file
      }
      input.close();									//always close the files when you are done
      return size;
   }
   
   	//pre:  "fileName" is the name of a real file containing lines of text - the first line intended to be unused
      //post:returns a String array of all the elements in <filename>.txt, with index 0 unused (heap) O(n)
   public static String[] readFile(String fileName)throws IOException
   {
      int size = getFileSize(fileName);		//holds the # of elements in the file
      String[] list = new String[size];		//a heap will not use index 0;
      Scanner input = new Scanner(new FileReader(fileName));
      int i=0;											//index for placement in the array
      String line;	
      while (input.hasNextLine())				//while there is another line in the file
      {
         line=input.nextLine();					//read in the next Line in the file and store it in line
         list[i]= line;								//add the line into the array
         i++;											//advance the index of the array         
      }
      input.close();	
      return list;					
   }
      
   //Post: puts all the elements in the array into <filename>.txt,
   //      with one element per line O(n)
   public static void writeToFile(String[] array, String filename) throws IOException
   {
      System.setOut(new PrintStream(new FileOutputStream(filename)));
      for(int i = 0; i < array.length; i++) 
         System.out.println(array[i]);
   }
   
//creates a board of 0s and 1s for tiles and non tiles
   public static int[][] createIntBoard (SparseMatrix<tile> board){
      int[][]intboard = new int[15][15];         
      for(int r=0;r<15;r++){
         for(int c=0;c<15;c++){
            if(board.get(r, c).getLetter().equals("")||board.get(r,c)==null)
               intboard[r][c] = 0;
            else
               intboard[r][c] = 1;
         }
      }
      return intboard;
   }

//checks to see if tiles are all adjacent, no floating tiles
   public static boolean checkBoard(int[][]intboard){
      boolean valid = true;
      for(int r=0;r<15;r++){
         for(int c=0;c<15;c++){
            boolean tilevalid = true;
            if(intboard[r][c] == 1) //if theres a tile
            {
               boolean down = false; //assume there isnt anything touching it currently
               boolean up = false;
               boolean right = false;
               boolean left = false;
               
               tilevalid =false;//is this tile valid?
               if(r<14){ //check down (making sure we can)
                  if(intboard[r+1][c] == 1)
                     down = true;
               }
               if(r>0){ //check up (making sure we can)
                  if(intboard[r-1][c] ==1)
                     up = true;
               }
               if(c<14){ //check right (making sure we can)
                  if(intboard[r][c+1]==1)
                     right = true;
               }
               if(c>0){ //check left (making sure we can)
                  if(intboard[r][c-1]==1)
                     left = true;
               }
               if(down||up||right||left)
                  tilevalid = true;
            }
            if(!tilevalid)
               return false;
         }
      }
      return true;
   }

   public static int checkWordHorizontal(int r, int c, int[][] intboard)
   {
      int count = 1;
      if(r != 15 && intboard[r+1][c] == 1)
      {
         count += checkWordHorizontal(r+1, c, intboard);
      }
      return count;
   }
 
   public static ArrayList<tile> formWordHorizontal(int count, int r, int c, SparseMatrix<tile> board)
   {
      ArrayList<tile> temp = new ArrayList<tile>();
      for(int i = 0; i < count; i++)
      {
         temp.add(board.get(r, c)); 
         c++;
      }
      return temp;
   }
 
   public static int checkWordVertical(int r, int c, int[][] intboard)
   {
      int count = 1;
      if(c != 15 && intboard[r][c+1] == 1)
      {
         count += checkWordVertical(r, c+1, intboard);
      }
      return count;
   }
 
   public static ArrayList<tile> formWordVertical(int count, int r, int c, SparseMatrix<tile> board)
   {
      ArrayList<tile> temp = new ArrayList<tile>();
      for(int i = 0; i < count; i++)
      {
         temp.add(board.get(r, c)); 
         r++;
      }
      return temp;
   }
}
