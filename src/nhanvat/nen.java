/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanvat;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Dell
 */
public class nen extends JFrame  {
    private String pathImage;
    private int x,y;
    public int getX()
    {
        return x;
    }
    public void setX(int x)
    {
        this.x=x;
    }
    
    public int getY()
    {
        return y;
    }
    public void setY(int y)
    {
        this.y=y;
    }
   public nen(int x,int y)
   {
       this.pathImage="C:\\Users\\Dell\\Desktop\\Bai-tap-lon-2\\images\\nen.jpg" ;
       this.x=x;
       this.y=y;
       this.setBounds(x,y,60,60);
   }
     public String getPathImage(){
       return pathImage;
   }

    private void setIcon(ImageIcon imageIcon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
