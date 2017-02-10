import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ScrabbleGrid extends JPanel implements MouseListener, MouseMotionListener
{
   private ImageIcon aTile = new ImageIcon("a.jpg");
   private ImageIcon bTile = new ImageIcon("b.jpg");
   private ImageIcon cTile = new ImageIcon("c.jpg");
   private ImageIcon dTile = new ImageIcon("d.jpg");
   private ImageIcon eTile = new ImageIcon("e.jpg");
   private ImageIcon fTile = new ImageIcon("f.jpg");
   private ImageIcon gTile = new ImageIcon("g.jpg");
   private ImageIcon hTile = new ImageIcon("h.jpg");
   private ImageIcon iTile = new ImageIcon("i.jpg");
   private ImageIcon jTile = new ImageIcon("j.jpg");
   private ImageIcon kTile = new ImageIcon("k.jpg");
   private ImageIcon lTile = new ImageIcon("l.jpg");
   private ImageIcon mTile = new ImageIcon("m.jpg");
   private ImageIcon nTile = new ImageIcon("n.jpg");
   private ImageIcon oTile = new ImageIcon("o.jpg");
   private ImageIcon pTile = new ImageIcon("p.jpg");
   private ImageIcon qTile = new ImageIcon("q.jpg");
   private ImageIcon rTile = new ImageIcon("r.jpg");
   private ImageIcon sTile = new ImageIcon("s.jpg");
   private ImageIcon tTile = new ImageIcon("t.jpg");
   private ImageIcon uTile = new ImageIcon("u.jpg");
   private ImageIcon vTile = new ImageIcon("v.jpg");
   private ImageIcon wTile = new ImageIcon("w.jpg");
   private ImageIcon xTile = new ImageIcon("x.jpg");
   private ImageIcon yTile = new ImageIcon("y.jpg");
   private ImageIcon zTile = new ImageIcon("z.jpg");
   private ImageIcon blankTile = new ImageIcon("blank.jpg");
   private ImageIcon dwTile = new ImageIcon("dw.jpg");
   private ImageIcon twTile = new ImageIcon("tw.jpg");
   private ImageIcon dlTile = new ImageIcon("dl.jpg");
   private ImageIcon tlTile = new ImageIcon("tl.jpg");


   private static final int SIZE=40;

   private static int[][] board;	
 	//A moveable smiley face will start in the center of the field
   private static int playerR;			//start row for the player
   private static int playerC;        //start col for the player
   
   protected static int mouseX;			//locations for the mouse pointer
   protected static int mouseY;
   
   protected static int selected;
   
   public ScrabbleGrid()
   {
      selected = -1;
     
      addMouseListener(this);
      addMouseMotionListener(this);
      mouseX = 0;
      mouseY = 0;
   
      int numRows = 15;		//board has 15 rows
      int numColumns = 15; //board has 15 cols
      board = new int[numRows][numColumns];
      for(int r=0;r<board.length;r++)					//fill with random values (0,1 or 2)
         for(int c=0;c<board[0].length;c++)
            board[r][c] = 0;
      playerR = board.length/2;							//start player position in the middle
      playerC = board[0].length/2;	
   }
   
   public void showBoard(Graphics g)	
   {
      int x =0, y=0;		//upper left corner location of where image will be drawn
      for(int r=0;r<board.length;r++)
      {
         x = 0;						//reset the row distance
         for(int c=0;c<board[0].length;c++)
         {
               g.drawImage(blank.getImage(), x, y, SIZE, SIZE, null);  //scaled image
               if(selected == -1)
                  g.drawImage(crossHair.getImage(), x, y, SIZE, SIZE, null);  //scaled image
               else
               {
                  if(selected==1)
                     g.drawImage(white.getImage(), x, y, SIZE, SIZE, null);  //scaled image
                  else // if(board[r][c]==2)
                     g.drawImage(black.getImage(), x, y, SIZE, SIZE, null);  //scaled image
               
               }
            }
            x+=SIZE;
         }
         y+=SIZE;
      }
   }
