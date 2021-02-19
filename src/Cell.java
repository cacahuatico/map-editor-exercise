import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Cell {

    private int col;
    private int row;
    private boolean painted;
    private Rectangle rectangle;



    public Cell(int col, int row){
        this.col = col;
        this.row = row;
        this.rectangle = new Rectangle(col * Grid.CELLSIZE+Grid.PADDING, row * Grid.CELLSIZE+Grid.PADDING, Grid.CELLSIZE, Grid.CELLSIZE);
        this.rectangle.setColor(Color.BLACK);
        this.rectangle.draw();
        this.painted = false;
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

    public boolean painted() {
        return painted;
    }

    public void setPainted(boolean painted) {
        this.painted = painted;
    }

    // To be able to call the rectangle's color from cell
    public void setColor(Color color) {
        rectangle.setColor(color);
    }

    public void moveUp(){
        rectangle.translate(0, -Grid.CELLSIZE);
        row--;
    }

    public void moveDown(){
        rectangle.translate(0, Grid.CELLSIZE);
        row++;
    }

    public void moveLeft(){
        rectangle.translate(-Grid.CELLSIZE,0);
        col--;
    }

    public void moveRight(){
        rectangle.translate(Grid.CELLSIZE,0);
        col++;
    }



}
