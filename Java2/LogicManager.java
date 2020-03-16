package java2;
/** To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hello
 */
public class LogicManager {
	private MazeManager myMgr;
	static int path[][];
	//int k=0;
    LogicManager(MazeManager myMgr) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    	this.myMgr=myMgr;
    }

    boolean findPath(int x, int y, maze myMaze){
    	if(x<0 || x>=myMaze.i || y<0 || y>=myMaze.i)
    		return false;
    	if(x == myMaze.startEndXY[2] && y == myMaze.startEndXY[3]){
    		path[x][y]=1;
    		return true;
    		
    	}
    	if(myMaze.logicMap[x].charAt(y) == 'w')
    		return false;
    	path[x][y]=1;
    	if(path[x-1][y] == 0 && findPath(x-1, y, myMaze) == true)//north
    		return true;
    	if(path[x][y+1] == 0 && findPath(x, y+1, myMaze) == true)//east
    		return true;
       
    	if(path[x+1][y] == 0 && findPath(x+1, y, myMaze) == true)//south
    		return true;
         if(path[x][y-1] == 0 && findPath(x, y-1, myMaze) == true)//west
    		return true;
    	
    	path[x][y]=2;
    	return false;
    }
    
    int[][] makePath(maze myMaze) {
    	path = new int[myMaze.i][myMaze.i];
 
    	int startX, startY;
    	startX=myMaze.startEndXY[0];
    	startY=myMaze.startEndXY[1];
    	findPath(startX, startY, myMaze);
    	for(int j =0;j<myMaze.i;j++){
    		for(int l =0;l<myMaze.i;l++)
    			System.out.print(path[j][l]);
    		System.out.println();
    	}
        
    	
    	return path;
    }
    
}
