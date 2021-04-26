import greenfoot.*;

public class Start extends Actor
{
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
       {
           getImage().scale((int)Math.round(getImage().getWidth()*0.9),(int)Math.round(getImage().getHeight()*0.9));
       }
       if(Greenfoot.mousePressed(this))
       {
           Greenfoot.delay(5);
           Greenfoot.setWorld(new Latar());
           Greenfoot.playSound("2.mp3");
       }
    }    
}
