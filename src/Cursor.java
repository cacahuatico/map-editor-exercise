import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Cursor extends Cell implements KeyboardHandler {

    private Keyboard keyboard;
    private Grid grid;
    private Cell cursorPosOnGrid;

    public Cursor(int col, int row, Grid grid){
        super(col,  row);
        this.keyboard = new Keyboard(this);
        this.grid = grid;
        setColor(Color.BLACK);
        fill();



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
        keyboard.addEventListener(KeyboardEvent.KEY_1, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_2, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_3, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_Q, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_W, KeyboardEventType.KEY_PRESSED);

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
                paint(Color.BLUE);
                break;
            case KeyboardEvent.KEY_1:
                paint(Color.BLACK);
                break;

            case KeyboardEvent.KEY_2:
                paint(Color.GREEN);
                break;

            case KeyboardEvent.KEY_3:
                paint(Color.GRAY);
                break;

            case KeyboardEvent.KEY_Q:
                paint(Color.DARK_GRAY);
                break;

            case KeyboardEvent.KEY_W:
                paint(Color.LIGHT_GRAY);
                break;




            case KeyboardEvent.KEY_L:
                if(painted()){

                }
                break;
            case KeyboardEvent.KEY_C:
                grid.clear();
                break;

            default:
                System.out.println("Hi, Caches");

        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    private void paint(Color color){
        cursorPosOnGrid = grid.getCell(getCol(),getRow());
        if(cursorPosOnGrid.painted()){
            cursorPosOnGrid.setColor(Color.BLACK);
            cursorPosOnGrid.draw();
            cursorPosOnGrid.setPainted(false);
            return;
        }
        cursorPosOnGrid.setColor(color);
        cursorPosOnGrid.fill();
        cursorPosOnGrid.setPainted(true);
    }
}
