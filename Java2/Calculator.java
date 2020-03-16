package java2;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package calculator;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ARUN
 */
class Calculator extends JFrame {
    Calculator(){
    
        setTitle("Calculator");
        setSize(400,300);
        setResizable(false);
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(d.width/2-200,d.height/2-150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initcomponents();
    }
    
    
    
    private void initcomponents() {
        JButton okbtn=new JButton("OK");
        JButton cancelbtn=new JButton("CANCEL");
        JButton clrbtn=new JButton("CLEAR");
        JPanel btnpanel=new JPanel();
        btnpanel.add(okbtn);
        btnpanel.add(cancelbtn);
        btnpanel.add(clrbtn);
        //FlowLayout f=new FlowLayout();
        //f.setAlignment(2);
        add(btnpanel,BorderLayout.SOUTH);
        
       JTextField txt=new JTextField(25);
       JPanel ptxt=new JPanel();
       ptxt.add(txt);
       add(ptxt,BorderLayout.NORTH);
       //add(ptxt,BorderLayout.BEFORE_FIRST_LINE);
        
       /*JButton one=new JButton("1");
       JButton two=new JButton("2");
       JButton three=new JButton("3");
       JPanel pnl13=new JPanel();
       pnl13.add(one);
       pnl13.add(two);
       pnl13.add(three);*/
       JPanel jp=new JPanel(new GridLayout(5,3));
       jp.add(new JButton("7"));            //("1"));
       jp.add(new JButton("8"));
       jp.add(new JButton("9"));
       jp.add(new JButton("4"));
       jp.add(new JButton("5"));
       jp.add(new JButton("6"));
       jp.add(new JButton("1"));
       jp.add(new JButton("2"));
       jp.add(new JButton("3"));
       jp.add(new JButton("+"));
       jp.add(new JButton("-"));
       jp.add(new JButton("*"));
       jp.add(new JButton("/"));
       jp.add(new JButton("%"));
       jp.add(new JButton("0"));
       //jp.setLayout((new GridLayout(4,4)));
       jp.setFont((new Font("Times new roman",Font.BOLD,26)));
       
       
       add(jp,BorderLayout.CENTER);
       
       
      /* JButton four=new JButton("4");
       JButton five=new JButton("5");
       JButton six=new JButton("6");
       JPanel pnl46=new JPanel();
       pnl46.add(four);
       pnl46.add(five);
       pnl46.add(six);
       add(pnl46,BorderLayout.AFTER_LINE_ENDS);*/
      // add(pnl46,BorderLayout.BEFORE_LINE_BEGINS);
      // JPanel pnl=new JPanel();
       //pnl.add(pnl13);
       //pnl.add(pnl46);
       //add(pnl,BorderLayout.CENTER);
    }
    
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.setVisible(true);
        
    }
   } 


