package java2;

public class DisplayManager {
   
    private MazeManager mgr;
    private Screen1 screen1;
    Map mp;
   
   
    public DisplayManager(MazeManager mgr)        {
        this.mgr = mgr;
    }
    public DisplayManager() {
       
        this.screen1 = new Screen1(this);
    } 
   
    public void showScreen1() {
      
        screen1.setVisible(true);
    }
   
//    public static void main(String[] args) {
//       
//        DisplayManager mgr = new DisplayManager();
//        mgr.showScreen1();   
//    }

   public void showScreen1(maze myMaze, int[][] myPath) {
    	 DisplayManager mgr = new DisplayManager();
         mgr.showScreen1();
      //   mp = new Map(myMaze.logicMap);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
   
