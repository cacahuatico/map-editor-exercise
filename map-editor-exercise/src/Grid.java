import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Grid {

    private String name;
    private Cell[][] canvas;

    public static final int ROWS = 100;
    public static final int COLS = 200;
    public static final int CELLSIZE = 20;
    public final int PADDING = 5;

    public Grid(){
        this.canvas = new Cell[COLS][ROWS];

        for (int i = 0; i < COLS ; i++) {
            for (int j = 0; j < ROWS; j++) {
                canvas[i][j] = new Cell(i,j);
                canvas[i][j].setRectangle(new Rectangle(PADDING, PADDING, CELLSIZE, CELLSIZE));
            }
        }

    }


    public Cell[][] getCanvas() {
        return canvas;
    }



}
