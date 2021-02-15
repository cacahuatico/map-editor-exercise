import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Cell {

    private int col;
    private int row;
    private Color color;
    private boolean isWalkedOn; // to mark later as have been walked on or not.
    private Rectangle rectangle;


    public Cell(int col, int row){

        this.col = col;
        this.row = row;
        this.rectangle = new Rectangle();
        this.color = Color.WHITE;
        this.isWalkedOn = false;




    }






   /*
    private void colorCell(Rectangle rectangle){
        if(rectangle.isWalkedOn()) {
            rectangle.setColor(Color.BLACK);
            rectangle.fill();
        }
    }*/






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

    public void setColor(Color color) {
        this.color = color;
    }
}
