import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Stage extends World
{
    public Stage()
    {    
        super(900, 600, 1);
        this.setBackground(new GreenfootImage("semesta.jpg"));
    }
    private void prepare()
    {
        Player player = new Player();
        addObject(player,166,503);
    }
    public void act() {
        if(Greenfoot.getRandomNumber(100)<5) {
            addObject(new Fire(), Greenfoot.getRandomNumber(getWidth()), 1);
        }
    }
}
