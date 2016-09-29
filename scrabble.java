public class scrabble{


   public static void main(String[]arg){
      ArrayList<Tile> wordBag = new ArrayList<Tile>();
   
      public SparseMatrix<Tile> board = new SparseMatrix(15,15);
      Tile blanky = new Tile(' ');
      for(int i = 0; i < 15; i++)
      {
         for(int j = 0; j <15; j++)
         {
            board.add(i, j, blanky);
         }
      }
   }


   public static void addTile(Tile t)
   {
      board.set(i, j, t);
   }
   public static void createBag(ArrayList wordBag){
      for(int counter = 0; count < 9; count++)
      {
         list.add(new Tile("A"));
      }
      for(int counter = 9; count < 11; count++)
      {
         list.add(new Tile("B"));
      }
      for(int counter = 11; count < 13; count++)
      {
         list.add(new Tile("C"));
      }
      for(int counter = 13; count < 18; count++)
      {
         list.add(new Tile("D"));
      }
      for(int counter = 18; count < 31; count++)
      {
         list.add(new Tile("E"));
      }
      for(int counter = 31; count < 33; count++)
      {
         list.add(new Tile("F"));
      }
      for(int counter = 33; count < 36; count++)
      {
         list.add(new Tile("G"));
      }
      for(int counter = 36; count < 40; count++)
      {
         list.add(new Tile("H"));
      }
      for(int counter = 40; count < 48; count++)
      {
         list.add(new Tile("I"));
      }
      for(int counter = 48; count < 49; count++)
      {
         list.add(new Tile("J"));
      }
      for(int counter = 49; count < 50; count++)
      {
         list.add(new Tile("K"));
      }
      for(int counter = 50; count < 54; count++)
      {
         list.add(new Tile("L"));
      }
      for(int counter = 54; count < 56; count++)
      {
         list.add(new Tile("M"));
      }
      for(int counter = 56; count < 61; count++)
      {
         list.add(new Tile("N"));
      }
      for(int counter = 61; count < 69; count++)
      {
         list.add(new Tile("O"));
      }
      for(int counter = 69; count < 71; count++)
      {
         list.add(new Tile("P"));
      }
      for(int counter = 71; count < 72; count++)
      {
         list.add(new Tile("Q"));
      }
      for(int counter = 72; count < 78; count++)
      {
         list.add(new Tile("R"));
      }
      for(int counter = 78; count < 83; count++)
      {
         list.add(new Tile("S"));
      }
      for(int counter = 83; count < 90; count++)
      {
         list.add(new Tile("T"));
      }
      for(int counter = 90; count < 94; count++)
      {
         list.add(new Tile("U"));
      }
      for(int counter = 94; count < 96; count++)
      {
         list.add(new Tile("V"));
      }
      for(int counter = 96; count < 98; count++)
      {
         list.add(new Tile("W"));
      }
      for(int counter = 98; count < 99; count++)
      {
         list.add(new Tile("X"));
      }
      for(int counter = 99; count < 101; count++)
      {
         list.add(new Tile("Y"));
      }
      for(int counter = 101; count < 102; count++)
      {
         list.add(new Tile("Z"));
      }
      for(int counter = 102; count < 104; count++)
      {
         list.add(new Tile("BL"));
      }
   }
   
     //pre:  "fileName" is the name of a real file containing lines of text
      //post: returns the number of lines in fileName O(n)
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
   
     //pre: 
     //post:displays all of the elements of the array words O(n)
   public static void showArray(String[] words)
   {
      for (int i=0; i<words.length; i++)
         System.out.println(words[i] + " ");
      System.out.println();
      System.out.println("Size of array:" + words.length);
   }
   
   //Post: puts all the elements in the array into <filename>.txt,
   //      with one element per line O(n)
   public static void writeToFile(String[] array, String filename) throws IOException
   {
      System.setOut(new PrintStream(new FileOutputStream(filename)));
      for(int i = 0; i < array.length; i++) 
         System.out.println(array[i]);
   }

}