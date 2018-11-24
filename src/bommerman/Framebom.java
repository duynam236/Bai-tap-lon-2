/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bommerman;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 
import javax.swing.*;
import javax.swing.text.html.parser.Entity;
import nhanvat.*;

public class Framebom extends JFrame  {
   
private JPanel panel=new JPanel();
private int level,hang,cot;

    public Framebom()throws FileNotFoundException
    {
        add(panel);    
        setSize(1220,1020);
        setLocation(500,10);
        
        setVisible(true);
        File file=new File("C:\\Users\\Dell\\Desktop\\Bai-tap-lon-2\\src\\bommerman\\bando.txt");
        Scanner sc=new Scanner(file);
        String s=sc.nextLine();
        String[]arr=s.split(" ");
        level=Integer.parseInt(arr[0]);
       hang=Integer.parseInt(arr[1]);
        cot =Integer.parseInt(arr[2]);
 
      String[] bando = new String[hang];
        int i = 0;
        while(sc.hasNext()){
            bando[i ++] = sc.nextLine();
        }
        panel.setLayout(null);
        for(int j = 0;j < hang;j ++)
            for(int k = 0;k < cot;k ++){
                if(bando[j].charAt(k) == '#')
                {
                    JLabel jl = new JLabel();
                    Wall _wall = new Wall(j*60,k*60);
                    jl.setIcon(new ImageIcon(_wall.getPathImage()));
                    jl.setBounds(_wall.getX(), _wall.getY(), 60, 60);
                    panel.add(jl);
                }
                else if(bando[j].charAt(k)=='*'){
                    JLabel jl=new JLabel();
                    brick _brick=new brick(j*60,k*60);
                    jl.setIcon(new ImageIcon( _brick .getPathImage()));
                    jl.setBounds(_brick.getX(), _brick.getY(), 60, 60);
                    panel.add(jl);
                }
                else if(bando[j].charAt(k)=='p')
                {
                      JLabel jl=new JLabel();
                    bomer _bomer=new bomer(j*60,k*60);
                    jl.setIcon(new ImageIcon( _bomer .getPathImage()));
                    jl.setBounds(_bomer.getX(), _bomer.getY(), 60, 60);
                    panel.add(jl);
                      JLabel jl1=new JLabel();
                    nen _nen=new nen(j*60,k*60);
                    jl1.setIcon(new ImageIcon( _nen .getPathImage()));
                    jl1.setBounds(_nen.getX(), _nen.getY(), 60, 60);
                    panel.add(jl1);
                }
                else if(bando[j].charAt(k)=='1')
                {
                     JLabel jl=new JLabel();
                    enemy _enemy=new enemy(j*60,k*60);
                    jl.setIcon(new ImageIcon( _enemy .getPathImage()));
                    jl.setBounds(_enemy.getX(), _enemy.getY(), 60, 60);
                    panel.add(jl);
                      JLabel jl1=new JLabel();
                    nen _nen=new nen(j*60,k*60);
                    jl1.setIcon(new ImageIcon( _nen .getPathImage()));
                    jl1.setBounds(_nen.getX(), _nen.getY(), 60, 60);
                    panel.add(jl1);
                }
                else if(bando[j].charAt(k)=='x')
                {
                       JLabel jl1=new JLabel();
                    brick _brick=new brick(j*60,k*60);
                    jl1.setIcon(new ImageIcon( _brick .getPathImage()));
                    jl1.setBounds(_brick.getX(), _brick.getY(), 60, 60);
                    panel.add(jl1);
                    JLabel jl=new JLabel();
                    portal _portal=new portal(j*60,k*60);
                    jl.setIcon(new ImageIcon( _portal .getPathImage()));
                    jl.setBounds(_portal.getX(), _portal.getY(), 60, 60);
                    panel.add(jl);
                   
                }
                else{
                    JLabel jl = new JLabel();
                    nen _nen=new nen(j*60,k*60);
                    jl.setIcon(new ImageIcon( _nen.getPathImage()));
                    jl.setBounds(_nen.getX(),_nen.getY(), 60, 60);
                    panel.add(jl);
                    
                }
            }
        
    }
        
}
