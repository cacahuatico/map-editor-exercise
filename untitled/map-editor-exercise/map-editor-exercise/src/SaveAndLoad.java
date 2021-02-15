public class SaveAndLoad {

    private Grid grid;

    public SaveAndLoad(Grid grid){
        this.grid = grid;
    }

    // We need a text where cells that have been drawn on are saved as one thing and the others as another char
    public void save(Grid grid){
        String test = " ";
        for (int i = 0; i < Grid.COLS; i++) {
            for (int j = 0; j < Grid.ROWS; j++) {
                if(grid.getCell(i,j).isWalkedOn()){
                    test += "1";
                }
            } test += "0";
        }
    }
}
