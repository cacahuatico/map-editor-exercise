public class MapEditor {

    private Grid grid;



    public MapEditor (Grid grid){
        this.grid = grid;


    }

    public void start(){
        grid.drawCells();
        Cursor cursor = new Cursor(10,10, grid);




    }


}
