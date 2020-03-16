package java2;

public class MazeManager {
   
    DataManager dataMgr;
    DisplayManager displayMgr;
    LogicManager logicMgr;    
   
    public static void main(String[] args) {

        maze myMaze;   
        int[][] myPath;         

        MazeManager myMgr = new MazeManager();
       
        // create all managers
        myMgr.dataMgr = new DataManager(myMgr);
        myMgr.displayMgr = new DisplayManager(myMgr);
        myMgr.logicMgr = new LogicManager(myMgr);
       
        // initialise data
        myMaze = myMgr.dataMgr.makeMaze("maze3.txt");//this will have access to logic maze

        // apply backtracking
        myPath = myMgr.logicMgr.makePath(myMaze);       

        // show screen
        myMgr.displayMgr.showScreen1(myMaze, myPath);
       
    }
}

