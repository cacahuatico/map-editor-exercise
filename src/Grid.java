import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Grid {


    private Cell[][] grid;

    public static final int COLS = 100;
    public static final int ROWS = 40;
    public static final int CELLSIZE = 10;
    public static final int PADDING = 10;

    public Grid(){
        this.grid = new Cell[COLS][ROWS];

    }

    public void drawCells(){

        for (int i = 0; i < COLS ; i++) {
            for (int j = 0; j < ROWS; j++) {
                grid[i][j] = new Cell(i,j);
            }
        }

    }

    public Cell[][] getGrid() {
        return grid;
    }




    public Cell getCell(int col, int row) {
        return grid[col][row];
    }

    public void clear() {
        for (int i = 0; i <COLS ; i++) {
            for (int j = 0; j < ROWS ; j++) {
                grid[i][j].setColor(Color.BLACK);
                grid[i][j].draw();
                grid[i][j].setPainted(false);
            }
        }
    }
}
