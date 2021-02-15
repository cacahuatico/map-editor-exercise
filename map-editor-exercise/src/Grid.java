import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Grid {


    private Cell[][] canvas;

    public static final int COLS = 25;
    public static final int ROWS = 25;
    public static final int CELLSIZE = 30;
    public static final int PADDING = 10;

    public Grid(){
        this.canvas = new Cell[COLS][ROWS];

    }

    public void drawCells(){

        for (int i = 0; i < COLS ; i++) {
            for (int j = 0; j < ROWS; j++) {
                canvas[i][j] = new Cell(i,j);
                canvas[i][j].setRectangle(new Rectangle(PADDING + i * CELLSIZE, PADDING + j*CELLSIZE, CELLSIZE, CELLSIZE));
                canvas[i][j].setColor(Color.BLACK);
                if(i == 10 && j == 10){
                    canvas[i][j].fill();
                }
                canvas[i][j].draw();
            }
        }

    }

    public Cell[][] getCanvas() {
        return canvas;
    }


    public void paint(int col, int row) {
        canvas[col][row].setColor(Color.BLACK);
        canvas[col][row].fill();
    }

    public void getCell(int col, int row) {
        canvas[col][row] = new Cell(col, row);
    }
}
