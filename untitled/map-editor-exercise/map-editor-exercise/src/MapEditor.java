public class MapEditor {

    private Grid grid;
    private Cell[][] canvas;


    public MapEditor (Grid grid){
        this.grid = grid;
        canvas = grid.getGrid();

    }

    public void start(){

        Cursor cursor = new Cursor(10,10, grid);




    }


}
