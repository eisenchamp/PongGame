import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Ball extends Rectangle{

    Random random;
    int xVelocity;
    int yVelocity;
    int initSpeed = 2;

    Ball(int x, int y, int width, int height){
        super(x, y, width, height);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if (randomXDirection == 0){
            randomXDirection--;
        }
        setXDirection(randomXDirection * initSpeed);

        int randomYDirection = random.nextInt(2);
        if (randomYDirection == 0){
            randomYDirection--;
        }
        setYDirection(randomXDirection * initSpeed);
    }

    public void setXDirection(int xDirection){
        xVelocity = xDirection;
    }

    public void setYDirection(int yDirection){
        yVelocity = yDirection;
    }

    public void move(){
        x = x + xVelocity;
        y = y + yVelocity;
    }

    public void draw(Graphics g){
        g.setColor(Color.red);
        g.fillOval(x, y, width, height);
    }
}
