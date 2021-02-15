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
    private Cell position;
    private int moveTo = Grid.CELLSIZE;
    private int initialPosX = 5/moveTo;
    private int initialPosY = 5/moveTo;

    public Cursor(int col, int row){
        super(col,  row);
        this.keyboard = new Keyboard(this);
        this.markedArr = new Cell[cells];
        setColor(Color.BLUE);
        draw();
        fill();


        //adds all events up, down, left and right to move, space to paint, L to load (info about cuadritos), C to clear, S to save
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
                move(0, 1);
                break;
            case KeyboardEvent.KEY_DOWN:
                move(0,+1);
                break;
            case KeyboardEvent.KEY_LEFT:
                move(getCol(), getRow()-1);
                break;
            case KeyboardEvent.KEY_RIGHT:
                move(getCol(), getRow()+1);
                break;
            case KeyboardEvent.KEY_SPACE:
                Grid.getCell.setWalkedOn(true);
                Grid.getCell.setColor(Color.MAGENTA);
                fill();
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
