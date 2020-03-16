package java2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.*;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;







/**
 *
 * @author hello
 */
public class Board extends JPanel implements ActionListener {
    private Timer timer;
    private Map m;
    int x1, y1, x2, y2, flag, soundFlag;
    String filepath;
    int path2[][]=new int[maze.i][maze.i];
    public Board()
    {
        y1=maze.startEndXY[0];
        x1=maze.startEndXY[1];
        y2=y1;
        x2=y1;
        flag=1;
        soundFlag=0;
        filepath="music\\\\beep.wav";
        for(int i=0;i<maze.i;i++){
            for (int j=0;j<maze.i;j++){
                path2[i][j]=LogicManager.path[i][j];
            }
        }
        
        m=new Map();
        timer=new Timer(500,this);
        timer.start();
    }
    public void actionPerformed(ActionEvent e){
        if(Screen1.Screen1Flag==1)
            Cell();
       repaint(); 
    }
    public void Cell(){
        if(path2[y1+1][x1]== 2 && flag ==1){//south
            y1+=1;
            path2[y1][x1]=3;
        }
        else if(path2[y1-1][x1]== 2 && flag ==1){//north
            y1-=1;
            path2[y1][x1]=3;
        }
        else if(path2[y1][x1+1]== 2 && flag ==1){//east
            x1+=1;
            path2[y1][x1]=3;
        }
        else if(path2[y1][x1-1]== 2 && flag ==1){//west
            x1-=1;
            path2[y1][x1]=3;
        }
        
       else if(path2[y1+1][x1]== 3){//south
            y1+=1;
            path2[y1][x1]=-1;
            flag=3;
        }
        else if(path2[y1-1][x1]== 3){//north
            y1-=1;
            path2[y1][x1]=-1;
            flag=3;
        }
        else if(path2[y1][x1+1]== 3){//east
            x1+=1;
            path2[y1][x1]=-1;
            flag=3;
        }
        else if(path2[y1][x1-1]== 3){//west
            x1-=1;
            path2[y1][x1]=-1;
            flag=3;
        }
        else if(path2[y1+1][x1]== 1){//south
            y1+=1;
            path2[y1][x1]=4;
            flag=1;
        }
        else if(path2[y1-1][x1]== 1){//north
            y1-=1;
            path2[y1][x1]=4;
            flag=1;
        }
        else if(path2[y1][x1+1]== 1){//east
            x1+=1;
            path2[y1][x1]=4;
            flag=1;
        }
        else if(path2[y1][x1-1]== 1){//west
            x1-=1;
            path2[y1][x1]=4;
            flag=1;
        }
        else if(path2[y1+1][x1]== 4 && flag==3){//south
            y1+=1;
        }
        else if(path2[y1-1][x1]== 4 && flag ==3){//north
            y1-=1;
        }
        else if(path2[y1][x1+1]== 4 && flag==3){//east
            x1+=1;
        }
        else if(path2[y1][x1-1]== 4 && flag==3){//west
            x1-=1;
        }
    }
    public void paint(Graphics g)
    {
        System.out.println("Paint");
    super.paint(g);
    
    
//    g.setColor(Color.red);
//    g.fillRect(45,60,32,32);
for(int y=0;y<maze.i;y++)
{
for(int x=0;x<maze.i;x++)
{
if(m.getMap(x,y).equals("S")){
    g.drawImage(m.getGo(), x*50, y*50, null);
}    
if(m.getMap(x,y).equals("g")){
//g.drawImage(m.getGrass(),x*32 , y*32, null);
g.drawImage(m.getGrass(),x*50 , y*50, null);

}
if( m.getMap(x,y).equals("p")){
    g.drawImage(m.getSand(), x*50, y*50, null);
}
if(m.getMap(x,y).equals("w")){
   // System.out.print(m.getMap(x, y));
g.drawImage(m.getWall(),x*50 , y*50, null);
}
if(m.getMap(x, y).equals("E")){
    g.drawImage(m.getCheese(), x*50, y*50, null);
}

  
}}
if(Screen1.Screen1Flag==1){
   if(y1-y2==0 && x1-x2>0){
                   // g.drawImage(m.getGrass(),x2*50 , y2*50, null);
                     g.drawImage(m.getMouseE(),x1*50, y1*50, null);
                     if(soundFlag==2){
                         playMusic(filepath);
                     }
                     soundFlag = 1;
                }
   else if(y1-y2==0 && x1-x2<0){
                   // g.drawImage(m.getGrass(),x2*50 , y2*50, null);
                     g.drawImage(m.getMouseW(),x1*50, y1*50, null);
                     if(soundFlag==1){
                         playMusic(filepath);
                     }
                     soundFlag=2;
                }
   
   else if(x1-x2==0 && y1-y2>0){
      // g.drawImage(m.getGrass(),x2*50 , y2*50, null);
                     g.drawImage(m.getMouseS(),x1*50, y1*50, null);
                     if(soundFlag==4){
                         playMusic(filepath);
                     }
                     soundFlag=3;
                }
   else if(x1-x2==0 && y1-y2<0){
      // g.drawImage(m.getGrass(),x2*50 , y2*50, null);
                     g.drawImage(m.getMouseN(),x1*50, y1*50, null);
                     if(soundFlag==3){
                         playMusic(filepath);
                     }
                     soundFlag=4;
                }
   
   else if(m.getMap(x1, y1).equals("E")){
         timer.stop();
         Screen1.timer1.stop();
         System.out.println("Stop");
           }
   x2=x1;
   y2=y1;
             
    }
}
    public void playMusic(String filepath){
        InputStream music;
        try{
            music= new FileInputStream(new File(filepath));
            AudioStream audios=new AudioStream(music);
            AudioPlayer.player.start(audios);
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error"); 
        }
    }
}
    
    

