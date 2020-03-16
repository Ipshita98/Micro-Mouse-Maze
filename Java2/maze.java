package java2;

import java.io.File;
import java.util.Scanner;

import javax.swing.JFrame;
import java.awt.Image;
import javax.swing.ImageIcon;


/**
 *
 * @author hello
 */
public class maze {
	private Scanner m;
	private String Map[]=new String[14];
	static String logicMap[]=new String[14];
	static int i = 0;
	static int startEndXY[]= new int[4];
	String filename;
//    public static void main(String[] args) {
//        new maze();
//    }
    public maze(String filename)
    {
    	this.filename=filename;
    		
//        JFrame f=new JFrame();
//        f.setTitle("Maze Game");
//        f.add(new Board());
//        f.setSize(500,500);
//        f.setLocationRelativeTo(null);
//        f.setVisible(true);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	openFile();
        readFile();
        closeFile();
    }
    public void openFile()
    {
        try{
        m=new Scanner(new File(filename));
        }catch(Exception e){
        System.out.println("Error Loading App");
        }
    }
    public void readFile()
    {
    	
        while(m.hasNextLine()){
//        for(int i=0;i<14;i++)
//        {
        Map[i]=m.nextLine();
        System.out.println(Map[i]);
        i++;
//        }
//        
        }
        System.out.println(i);
    }
    public void closeFile()
    {
    	char c;
    	int gp=0;
    	for(int j=0;j<i;j++){
    		logicMap[j]="";
    		for(int k=0;k<Map[j].length();k++){
    			c=Map[j].charAt(k);
    			if(j%2==0){
    				if(c=='+')
    					logicMap[j]+='w';
    				else if(c=='-'){
    					logicMap[j]+='w';
    					k+=2;
    				}
    				else{
    					logicMap[j]+='p';
    					k+=2;
    				}
    					
    			}
    			else{
    				if(c=='|'){
    					logicMap[j]+='w';
    					gp=0;
    				}
    				else if(c==' ' && gp==0){
    					if(Map[j].charAt(k+1)=='S'){
    						logicMap[j]+='S';
    						startEndXY[0]=j;
    						startEndXY[1]=logicMap[j].length()-1;
    					}
    					else if(Map[j].charAt(k+1)=='E'){
    						logicMap[j]+='E';
    						startEndXY[2]=j;
    						startEndXY[3]=logicMap[j].length()-1;
    					}
    					else
    						logicMap[j]+='g';
    					
    					k+=2;
    					gp=1;
    				}
    				else{
    					logicMap[j]+='p';
    					gp=0;
    				}
    			}
    		}
    	}
    	for(int l=0;l<i;l++)
    		System.out.println(logicMap[l]);
    	System.out.println(startEndXY[0]+" "+startEndXY[1]+" "+startEndXY[2]+" "+startEndXY[3]);
    	m.close();
    }
}
