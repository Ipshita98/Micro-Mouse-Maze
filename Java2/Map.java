package java2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Image;
import java.io.File;
//import java.util.Scanner;
import javax.swing.ImageIcon;

/**
 *
 * @author hello
 */
public class Map {
  //  private Scanner  m;
   //static String logicMap[]=new String[14];
    private Image grass,wall, mouseN, mouseE, mouseW, mouseS, sand, cheese, go;
    
//    public Map(String logicMap[]) {
//    	this.logicMap=logicMap;
//    }
    public Map()
    {
        ImageIcon img=new ImageIcon("grass.jpg");
        grass =img.getImage();
        ImageIcon img1=new ImageIcon("wall.jpg");
        wall =img1.getImage();
        ImageIcon img2=new ImageIcon("mouseN.png");
        mouseN =img2.getImage();
        ImageIcon img3=new ImageIcon("mouseS.png");
        mouseS =img3.getImage();
        ImageIcon img4=new ImageIcon("mouseE.png");
        mouseE =img4.getImage();
        ImageIcon img5=new ImageIcon("mouseW.png");
        mouseW =img5.getImage();
        ImageIcon img6=new ImageIcon("sand.png");
        sand =img6.getImage();
        ImageIcon img7=new ImageIcon("cheese.jpg");
        cheese = img7.getImage();
        ImageIcon img8=new ImageIcon("go.jpg");
        go = img8.getImage();
   // openFile();
   // readFile();
   // closeFile();
    }
    public Image getGo(){
        return go;
    }
    public Image getCheese(){
        return cheese;
    }
    public Image getSand(){
        return sand;
    }
    public Image getGrass()
    {
    return grass;
    }
    
    public Image getWall()
    {
    return wall;
    }
    public Image getMouseN(){
        return mouseN;
    }
    public Image getMouseE(){
        return mouseE;
    }
    public Image getMouseS(){
        return mouseS;
    }
    public Image getMouseW(){
        return mouseW;
    }
    
    public String getMap(int x,int y){
       // System.out.println("Logic Map");
//        for(int i=0;i<maze.i;i++)
//            System.out.println(maze.logicMap[i]);
    String index=maze.logicMap[y].substring(x,x+1);
    return index;
    }
//    public void openFile()
//    {
//        try{
//        m=new Scanner(new File("Map.txt"));
//        }catch(Exception e){
//        System.out.println("Error Loading App");
//        }
//    }
//    public void readFile()
//    {
//        while(m.hasNext()){
//        for(int i=0;i<14;i++)
//        {
//        logicMap[i]=m.next();
//        }
//        }
//    }
//    public void closeFile()
//    {
//    m.close();
//    }
}
