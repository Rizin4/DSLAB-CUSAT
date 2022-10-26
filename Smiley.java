import java.awt.*;
import java.applet.*;
public class Smiley extends Applet{

public void paint(Graphics g)
{
    g.setColor(Color.yellow);//bg yellow
    g.fillOval(100,30,100,100);//circle
    g.setColor(Color.black);//set eye color black
    g.fillOval(50,10,50,50);//eye
    g.fillOval(50,20,50,50);//eye
    g.drawArc(60,125,80,40,180,180);//smile
}
<html>
<applet code="Smiley.class" width=200 height=200>
</applet>
</html>
