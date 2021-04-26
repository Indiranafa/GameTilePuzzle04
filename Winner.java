import greenfoot.*; 

public class Winner extends Actor
{
    public void addedToWorld(World Latar)
    {
        GreenfootImage image=new GreenfootImage("You Win!",100,Color.RED,null);
        setImage(image);
    }
    public void act() 
    {
        
    }    
}
