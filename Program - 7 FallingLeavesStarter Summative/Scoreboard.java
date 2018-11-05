import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Scoreboard extends Actor
{
    private int points;
    private Font myFont = new Font("Comic Sans MS", true, false, 24);

    /**
     * Scoreboard is desing the scoreboard by the font style, the size of the font and color
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    public Scoreboard()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setFont( myFont );
        img.setColor(new Color(255,255,255));
        img.drawString("Score: " + points, 5,25);
        setImage(img);
    }
     /**
     * addToScore is adding and updating the score in the scoreboard
     * it is adding the score if the catcher catches the leaf
     * and if the player win it playes a song
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        Color fontColor = Color.WHITE; // change as desired
        img.clear();
        if(points < 10) {
            img.drawString("Score: " + points, 5,25); 
        } else {
            img.drawString("You win!!!", 5,25);
            Greenfoot.playSound("Win.wav");
            Greenfoot.stop();
        }        
    }    
}