package java2;
public class DataManager {
   
    private MazeManager mgr;
   
    public DataManager(MazeManager mgr) {
        this.mgr = mgr;
    }
   
    public maze makeMaze(String filename) {
        
    	return new maze(filename);
    }
   
}