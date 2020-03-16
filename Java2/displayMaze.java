package java2;

import javax.swing.JFrame;

public class displayMaze {
	 public displayMaze()
	    {
	        JFrame f=new JFrame();
	        f.setTitle("Maze Game");
                
	        f.add(new Board());
	        f.setSize(600,600);
	        f.setLocationRelativeTo(null);
	        f.setVisible(true);
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
	    }
         
}
