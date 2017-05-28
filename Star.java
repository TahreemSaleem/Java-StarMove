

/* Tahreem Saleem BESE-4B  
this is my own work and is not copied from someone else*/ 
//importing libraries
import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;

class StarsPanel extends JPanel
{   //initiallizing
	int theta=0;
	int[ ] xPoints = { 55, 67, 109, 73, 83, 55, 27, 37, 1, 43 };
	int[ ] yPoints = { 0, 36, 36, 54, 96, 72, 96, 54, 36, 36 };
	GeneralPath star = new GeneralPath( );
	Color color;
	
	void init()	
	{  //initializinf color
		color=Color.red;	
	}
	{	star.moveTo( xPoints[ 0 ], yPoints[ 0 ] );
		for ( int count = 1; count < xPoints.length; count++ )
		star.lineTo( xPoints[ count ], yPoints[ count ] );
		star.closePath( );
	}
	 Color genColor()  //genertaing color method
	{
			return new Color((float)Math.random(),(float)Math.random(),(float)Math.random()); 
	}

	public void paintComponent( Graphics g ) {
		super.paintComponent( g ); 
		Graphics2D g2d = ( Graphics2D ) g;
		color=genColor(); 
		g2d.setColor(color);
 		 g2d.translate(150, 150); //translating origin
		g2d.rotate(theta); //rotating figure
		g2d.fill( star );
		theta-=25;     //decrementing angle
	try{
		Thread.sleep(100);
	}
	catch(Exception e){ }
	repaint(100);
	}	//paintComponent ends
}//class StarsPanel ends


//Frame
public class Star {  
	public static void main( String [ ] args ) {
	JFrame frame = new JFrame( "Drawing 2D Shapes" ); 
	frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	StarsPanel sp = new StarsPanel( );
	frame.add( sp ); 
	frame.setBackground( Color.WHITE );
	frame.setSize( 315, 330 ); 
	frame.setVisible( true ); 
	} // end main
} // end class Star