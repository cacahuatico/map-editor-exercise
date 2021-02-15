import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.w3c.dom.css.Rect;

public class Battleground {

    public static void main(String[] args) {


        Grid firstTry = new Grid();
        firstTry.drawCells();
        MapEditor mapEditor = new MapEditor(firstTry);
        mapEditor.start();









    }

}
