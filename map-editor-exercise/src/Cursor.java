import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Cursor extends Cell implements KeyboardHandler {

    private Keyboard keyboard;
    private Cell marked;
    private Cell[] markedArr;
    private int indexMarkedArr;
    private int cells = Grid.COLS*Grid.ROWS;
    private Cell currentPos;
    private int moveTo = Grid.CELLSIZE;
    private Grid grid;
    //private int initialPosX = 5/moveTo;
    //private int initialPosY = 5/moveTo;

    public Cursor(int col, int row){
        super(col,  row);
        this.keyboard = new Keyboard(this);
        this.markedArr = new Cell[cells];
        //this.grid = grid;
        setColor(Color.BLUE);
        draw();
        fill();

        //this.currentPos = grid.getRectangle(col, row);

        //adds all events up, down, left and right to move, space to paint, L to load (gets info about rectangles to an
        // array), C to "unpaint" but does not , S to save the info to the array
        keyboard.addEventListener(KeyboardEvent.KEY_UP, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_DOWN, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_LEFT, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_RIGHT, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_SPACE, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_L, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_C, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_S, KeyboardEventType.KEY_PRESSED);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()){

            case KeyboardEvent.KEY_UP:
                moveUp();
                break;
            case KeyboardEvent.KEY_DOWN:
                moveDown();
                break;
            case KeyboardEvent.KEY_LEFT:
                moveLeft();
                break;
            case KeyboardEvent.KEY_RIGHT:
                moveRight();
                break;
            case KeyboardEvent.KEY_SPACE:
                //grid.getCell(getCol(),getRow());
                currentPos.setColor(Color.BLUE);
                currentPos.fill();
                //referencia a la cell del grid que necesito marcar Grid.getCell.setWalkedOn(true);
                // aqui tiene que haber la referencia a la celda en la que estoy parada en el grid setColor(Color.MAGENTA);
                System.out.println("space");
                break;
            case KeyboardEvent.KEY_L:
                if(isWalkedOn()){
                    markedArr[indexMarkedArr] = marked;
                    indexMarkedArr++;
                }
            default:
                System.out.println("hola");

        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
