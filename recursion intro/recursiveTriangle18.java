import javax.swing.JApplet;
import java.awt.*;

public class recursiveTriangle18 extends JApplet
{
   private final int APPLET_WIDTH = 800;
   private final int APPLET_HEIGHT = 800;

/*
   //x is accross and y is down
   point 1 - Right  A x[0],y[0] (720,600)
   point 2 - Left   B x[1],y[1]
   point 3 - Top    C x[2],y[2]
   point 4 draws back to point 1 to complete triangle

*/  private int[] xPos = {400, 720,  80, 400};
    private int[] yPos = { 40, 600, 600,  40};


   //-----------------------------------------------------------------
   //  Sets up the basic applet environment.
   //-----------------------------------------------------------------
   public void init()
   {
      setBackground (Color.white);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }

   //-----------------------------------------------------------------
   //  Draws a rocket using polygons and polylines.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {

        page.setColor (Color.green);
        page.drawPolyline (xPos, yPos, xPos.length);

        Triangle(xPos,yPos,page);

   }//end of paint

   public void Triangle(int[] xPos, int[] yPos, Graphics page)
   {
       //Find the distance between 2 points ex. - x,y & x1,y1
       int distance = (int)Math.sqrt(((xPos[0]-xPos[1])*(xPos[0]-xPos[1]))+((yPos[0]-yPos[1])*(yPos[0]-yPos[1])));


        //if the segment/distance is 300 or so, good length to stop
       if (distance< 9)
            return;


       //find the mid points of each line segment
       //make the x and y array (3 points + first point to finish triangle)
       int[] xNew = {(xPos[0]+xPos[1])/2, (xPos[1]+xPos[2])/2, (xPos[2]+xPos[3])/2, (xPos[0]+xPos[1])/2};
       int[] yNew = {(yPos[0]+yPos[1])/2, (yPos[1]+yPos[2])/2, (yPos[2]+yPos[3])/2, (yPos[0]+yPos[1])/2};


       //draw the Triangle
       page.drawPolyline (xNew, yNew, xNew.length);


       //create x,y Array using the midpoints you calculated
       int [] x1 = {xPos[0], (xPos[2]+xPos[3])/2,(xPos[0]+xPos[1])/2, xPos[0]};
       int [] y1 = {yPos[0], (yPos[2]+yPos[3])/2,(yPos[0]+yPos[1])/2, yPos[0]};

       int [] x2 = {(xPos[0]+xPos[1])/2, xPos[1], (xPos[1]+xPos[2])/2, (xPos[0]+xPos[1])/2};
       int [] y2 = {(yPos[0]+yPos[1])/2, yPos[1], (yPos[1]+yPos[2])/2, (yPos[0]+yPos[1])/2};

       int [] x3 = {(xPos[1]+xPos[2])/2, (xPos[2]+xPos[3])/2, xPos[2],(xPos[1]+xPos[2])/2};
       int [] y3 = {(yPos[1]+yPos[2])/2, (yPos[2]+yPos[3])/2, yPos[2],(yPos[1]+yPos[2])/2};


       // Recursive calls for each section of triangle
       Triangle(x1,y1,page);
       Triangle(x2,y2,page);
       Triangle(x3,y3,page);






   }//end of Triangle
}
