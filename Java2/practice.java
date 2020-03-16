/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2;
/**
 *
 * @author Beauty
 */
import java.awt.*;
class practice extends Frame {
    practice(){
        Button b=new Button("Click Me");
        b.setBounds(50,100,80,30);//x, y of top-left, and length and breadth
        add(b);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]){
        practice p=new practice();
    }
    
}



