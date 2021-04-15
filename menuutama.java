import greenfoot.*;

public class menuutama extends menu
{
    public menuutama()
    {
        prepare(); 
    }
     private void prepare()
    {
        Start start = new Start();
        addObject(start,266,260);
        start.setLocation(267,267);
    }
}
