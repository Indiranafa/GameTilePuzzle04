import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Latar extends World
{
    public Latar()
    {
        super(540, 540, 1, false); 
        
        GreenfootImage image=new GreenfootImage(getWidth(),getHeight());
        image.setColor(Color.GREEN);
        image.fill();
        setBackground(image);
        
        int dx=128;
        int[] index=generateSort(15);
        for(int i=0;i<15;i++){
            int io=i%4;
            int jo=i/4;
            
            addObject(new box(index[i]),(int)(0.5*getWidth()-256+0.5*dx+io*dx),(int)(0.5*getHeight()-256+0.5*dx+jo*dx));
        }
    }
    public int[] generateSort(int num)
    {
        int[] result=new int[num];
        for(int i=0;i<num;i++){
            while(true){
                boolean ketemu=false;
                int a=Greenfoot.getRandomNumber(num);
                for(int j=0;j<i;j++){
                    if(a==result[j]){
                        ketemu=true;
                        break;
                    }
                }
                if(!ketemu){
                    result[i]=a;
                    break;
                }
            }
        }
        return result;
    }
    public void cekPosition()
    {
        boolean passed =true;
        List<box> boxs=getObjects(box.class);
        if(boxs!=null && boxs.size()>0){
            int dx=128;
            for(int i=0;i<boxs.size();i++){
                int io=(int)Math.round(1.0*(boxs.get(i).getX()-256+1.5*dx)/dx);
                int jo=(int)Math.round(1.0*(boxs.get(i).getY()-256+1.5*dx)/dx);
                
                int id=io+jo*4;
                int id1=boxs.get(i).getIndex();
                if(id!=id1){
                    passed =false;
                    break;
                }
            }
        }else{
            passed=false;
        } 
        if(passed){
            addObject(new Winner (),(int)(0.5*getWidth()),(int)(0.5*getHeight()));
        }
    }
}
