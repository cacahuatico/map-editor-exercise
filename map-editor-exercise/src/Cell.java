import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Cell {

    private int col;
    private int row;
    private boolean isWalkedOn; // to mark later as have been walked on or not.
    private Rectangle rectangle;
    private Color color;


    public Cell(int col, int row){
        this.col = col;
        this.row = row;
        this.rectangle = new Rectangle(Grid.CELLSIZE+Grid.PADDING, Grid.CELLSIZE+Grid.PADDING, Grid.CELLSIZE, Grid.CELLSIZE);
        this.rectangle.setColor(Color.BLUE);
        this.isWalkedOn = false;
    }

    public void draw(){
        rectangle.draw();
    }

    public void fill(){
        rectangle.fill();
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setCol(int col) {
        this.col= col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public boolean isWalkedOn() {
        return isWalkedOn;
    }

    public void setWalkedOn(boolean walkedOn) {
        isWalkedOn = walkedOn;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle=rectangle;
    }

    // nos permite cambiar los colores luego (?) por que? no deberia de heredarse de la libreria.?
    public void setColor(Color color) {
        this.color = color;
    }

    public void move(int x, int y){
        rectangle.translate(col*Grid.CELLSIZE,row*Grid.CELLSIZE);
    }

    /*public Cell setPosCol() {
        return getCol();
    }*/
}
