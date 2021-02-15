import org.academiadecodigo.simplegraphics.graphics.Color;

public class Battleground {

    public static void main(String[] args) {


        Grid firsttry = new Grid();
        firsttry.drawCells();
        MapEditor mapEditor = new MapEditor(firsttry);
        mapEditor.start();







    }

}
