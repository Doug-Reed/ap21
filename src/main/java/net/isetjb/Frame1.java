/*
 * The MIT License
 *
 * Copyright 2017 Nafaa Friaa (nafaa.friaa@isetjb.rnu.tn).
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package net.isetjb;

import net.isetjb.config.I18N;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.apache.log4j.Logger;

import game.mechanics.GameStart;

import java.awt.event.*;

/**
 * Frame1 class.
 *
 * @author Nafaa Friaa (nafaa.friaa@isetjb.rnu.tn)
 */
public class Frame1 extends JInternalFrame {
  final static Logger log = Logger.getLogger(Frame1.class);

  JButton jButton1 = new JButton(" Test >> ");

  /**
   * Constructor.
   */
  public Frame1() {
    /*
    log.debug("START constructor...");
    
    setTitle(I18N.lang("frame1.title"));
    setLocation(new Random().nextInt(120) + 10, new Random().nextInt(120) + 10);
    setSize(550, 350);
    
    setClosable(true);
    setIconifiable(true);
    setMaximizable(false);
    setResizable(false);
    setDefaultCloseOperation(HIDE_ON_CLOSE);
    
    //add compnent to the frame :
    getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
    getContentPane().add(jButton1);
    
    JButton b=new JButton("Clicketh Me");//creating instance of JButton  
     b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
      
    this.add(b);//adding button in JFrame  
     b.addActionListener(new ActionListener(){  
      public void actionPerformed(ActionEvent e){  
        GameStart gs = new GameStart();
       }  
    });  
      
    this.setSize(400,500);//400 width and 500 height  
     this.setLayout(null);//using no layout managers  
    
    
    setVisible(true);
    
    log.debug("End of constructor.");
    */
    JFrame f = new JFrame();
    log.debug("Constructing frame");
    f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    setClosable(true);
    setIconifiable(true);
    setMaximizable(false);
    setResizable(false);

    int x = 5;
    int y = 5;
    JPanel panel = new JPanel();
    getContentPane().setLayout(new GridLayout(x, y));
    for (int i = 0; i < x * y; i++) {
      JButton button = new JButton(String.valueOf(i));
      button.setPreferredSize(new Dimension(100, 100));
      panel.add(button);
    }
    JPanel container = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
    panel.add(container);
   // container.add(panel);
    container.setVisible(true);
    JScrollPane scrollPane = new JScrollPane(container);
    f.getContentPane().add(scrollPane);

    f.pack();
    f.setLocationRelativeTo(null);
    f.setVisible(true);
  }
}
