private JButton[][] board;
JPanel center = new JPanel();
      center.setLayout(new GridLayout(10,10));
      add(center, BorderLayout.CENTER);
board = new JButton[15][15];
for(int r = 0; r < 15; r++)
         for(int c = 0; c < 15; c++)
         {
            board[r][c] = new JButton();
            board[r][c].setBackground(Color.brown);
            board[r][c].addActionListener( new Handler1(r, c) );
            center.add(board[r][c]);
         }



