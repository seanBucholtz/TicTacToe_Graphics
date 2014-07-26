/**
 * 
 * <p>The purpose of this assignment is to create a simple class 
 * that displays a window and draws tic-tac-toe boards in the window.
 * 
 * <p>Level at which to grade the assignment: <b>Standard Version</b><p>
 * 
 * @author Sean Bucholtz
 * @version Assignment 3: Tic-Tac-Toe
 * 
 */

public class TicTacToeBoards {
 
  // Declares a private field variable named win of type NsccWindow.
  private NsccWindow win;
  // Declares a private field variable named c of the type java.awt.Color.
  private java.awt.Color c;
  
  /**
  * This is the application method that instantiates the TicTacToeBoards
  * constructor.
  * .
  * @param args The command-line arguments
  */
  
  public static void main(String[] args) {
   
    TicTacToeBoards letsPlay = new TicTacToeBoards();
  }
  
  /**
   * The zero-parameter constructor for TicTacToeBoards.
   * This creates a window component at location (10, 10) (the
   * upper-left corner of the container), of size 300 x 330,
   * and draws three tic-tac-toe board variations.
   * 
   */
  
  public TicTacToeBoards() {
    
    // instantiates window object at specific location.
    win = new NsccWindow(10,10,300,330);
    win.setTitle("TicTacToe");
    
    drawTicTacToeBoard(40,40);
    // adjustable color
    drawTicTacToeBoard(170,40,java.awt.Color.red);
    // adjustable width
    drawTicTacToeBoard(40,170,5);
    
  }
  
  /**
   *  This method draws a tictactoe board.
   * 
   * <p>Calculations: <br>
   * fly:hoist::3:3::90:90 </p>
   * 
   * <p>overall board: <br>
   * dimension: 90x90 <br>
   * location: variable </p>
   * 
   * <p>verticle lines: <br>
   * dimensions: 90x90 <br>
   * locations: [(x+30,y+90),(x+30,y)] & [(x+60, y+90),(x+60,y)] </p>
   * 
   * <p>horizontal lines: <br>
   * dimensions: 90x90 <br>
   * locations: [(x,y+30),(x+90,y+30)] & [(x,y+60),(x+90,y+60)]</p>
   * 
   * @param x The x-coordinate for the component.
   * @param y The y-coordinate for the component.
   */
  
  public void drawTicTacToeBoard(int x, int y) {
    
    NsccLine vertLine;
    NsccLine horzLine;
    
    vertLine = new NsccLine(x+30, y+90, x+30, y);
    win.add(vertLine);
    
    vertLine = new NsccLine(x+60, y+90, x+60, y);
    win.add(vertLine);
    
    horzLine = new NsccLine(x, y+30, x+90, y+30);
    win.add(horzLine);
    
    horzLine = new NsccLine(x, y+60, x+90, y+60);
    win.add(horzLine);
    
    win.repaint();
    
  }
  
  /**
   *  This method draws and colors a tictactoe board.
   * 
   * <p>Calculations: <br>
   * fly:hoist::3:3::90:90 </p>
   * 
   * <p>overall board: <br>
   * dimension: 90x90 <br>
   * location: variable </p>
   * 
   * <p>verticle lines: <br>
   * dimensions: 90x90 <br>
   * locations: [(x+30,y+90),(x+30,y)] & [(x+60, y+90),(x+60,y)] </p>
   * 
   * <p>horizontal lines: <br>
   * dimensions: 90x90 <br>
   * locations: [(x,y+30),(x+90,y+30)] & [(x,y+60),(x+90,y+60)]</p>
   * 
   * @param x The x-coordinate for the component.
   * @param y The y-coordinate for the component.
   * @param c The color of the component.
   */
  
  public void drawTicTacToeBoard(int x, int y, java.awt.Color c) {
    
    NsccLine vertLine;
    NsccLine horzLine;
    
    
    vertLine = new NsccLine(x+30, y+90, x+30, y);
    vertLine.setForeground(c);
    win.add(vertLine);
    
    vertLine = new NsccLine(x+60, y+90, x+60, y);
    vertLine.setForeground(c);
    win.add(vertLine);
    
    horzLine = new NsccLine(x, y+30, x+90, y+30);
    horzLine.setForeground(c);
    win.add(horzLine);
    
    horzLine = new NsccLine(x, y+60, x+90, y+60);
    horzLine.setForeground(c);
    win.add(horzLine);
    
    win.repaint();
  }
  
  /**
   *  This method draws a tictactoe board with a variable width.
   * 
   * <p>Calculations: <br>
   * fly:hoist::3:3::90:90 </p>
   * 
   * <p>overall board: <br>
   * dimension: 90x90 <br>
   * location: variable </p>
   * 
   * <p>verticle lines: <br>
   * dimensions: 90x90 <br>
   * locations: [(x+(30-COV),y),(x+(30-COV),90] & [(x+(60-COV),y),(x+(60-COV),90)]<br>
   * Center Offset Value (COV): 1/2 * Width </p>
   * 
   * <p>horizontal lines: <br>
   * dimensions: 90x90 <br>
   * locations: [(x,y+(30-COV),(x+90,y+(30-COV))] & [(x,y+(60-COV)),(x+90,y+(60-COV))]<br>
   * Center offset value: 1/2 * Width </p>
   * 
   * @param x The x-coordinate for the component.
   * @param y The y-coordinate for the component.
   * @param w The width of the component.
   */
  
    public void drawTicTacToeBoard(int x, int y, int w) {
    
    NsccRectangle vertLine;
    NsccRectangle horzLine;
    
    vertLine = new NsccRectangle(x+(int)(30-w*0.5), y, w, 90);
    vertLine.setBackground(java.awt.Color.black);
    vertLine.setFilled(true);
    win.add(vertLine);
    
    vertLine = new NsccRectangle(x+(int)(60-w*0.5), y, w, 90);
    vertLine.setBackground(java.awt.Color.black);
    vertLine.setFilled(true);
    win.add(vertLine);
    
    horzLine = new NsccRectangle(x, y+(int)(30-w*0.5), 90, w);
    horzLine.setBackground(java.awt.Color.black);
    horzLine.setFilled(true);
    win.add(horzLine);
    
    horzLine = new NsccRectangle(x, y+(int)(60-w*0.5), 90, w);
    horzLine.setBackground(java.awt.Color.black);
    horzLine.setFilled(true);
    win.add(horzLine);
    
    win.repaint();
    
  }
  
}