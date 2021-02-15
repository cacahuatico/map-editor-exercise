import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Grid {


    private Cell[][] grid;

    public static final int COLS = 25;
    public static final int ROWS = 25;
    public static final int CELLSIZE = 30;
    public static final int PADDING = 10;

    public Grid(){
        this.grid = new Cell[COLS][ROWS];

    }

    public void drawCells(){

        for (int i = 0; i < COLS ; i++) {
            for (int j = 0; j < ROWS; j++) {
                grid[i][j] = new Cell(i,j);
                grid[i][j].setRectangle(new Rectangle(PADDING + i * CELLSIZE, PADDING + j*CELLSIZE, CELLSIZE, CELLSIZE));
                grid[i][j].setColor(Color.BLACK);
                grid[i][j].draw();
            }
        }

    }

    public Cell[][] getGrid() {
        return grid;
    }



    public void paint(int col, int row) {
        grid[col][row].setColor(Color.BLACK);
        grid[col][row].fill();
    }

    public Cell getRectangle(int col, int row) {
        return grid[col][row];
    }
}
