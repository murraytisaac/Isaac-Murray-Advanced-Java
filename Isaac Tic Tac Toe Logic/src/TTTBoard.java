import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class TTTBoard extends JPanel{
	int value=0;
	int titleFontSize = 24;
	ArrayList<DrawX> xList = new ArrayList<DrawX>();
	ArrayList<DrawO> oList = new ArrayList<DrawO>();
	public TTTBoard() {
		setSize(322,422);
		setBackground(Color.WHITE);
		Mouse j = new Mouse();
		addMouseListener(j);
	}
	public void paintComponent(Graphics g) {
		g.drawLine(10, 110, 300, 110);
		g.drawLine(10, 195, 300, 195);
		g.drawLine(90, 60, 90, 250);
		g.drawLine(220, 60, 220, 250);
		g.setFont(new Font("Comic Sans MS",Font.BOLD,titleFontSize));
		g.drawString("Isaac's Tic Tac Toe",30,((50 - titleFontSize)/2 + titleFontSize));
		g.drawString("Instructions:",75,300);
		g.setFont(new Font("Times New Roman",Font.BOLD,18));
		g.drawString("Alternate Player 1: X Player 2: Y",35, 330);
		g.drawString("First one to get 3 in  row wins", 45, 348);
		for (TTTBoard.DrawX thisX : xList) {
			g.drawString("X", thisX.xCoord, thisX.yCoord);
		}
		
		for (TTTBoard.DrawO thisO : oList) {
			g.drawString("O", thisO.xCoord, thisO.yCoord);
		}
		
	}
	class Mouse implements MouseListener{

		public void mouseClicked(MouseEvent e) {
			 value++;
		        if (value % 2 == 1) {
		        	System.out.println(e.getX() + " " + e.getY());
					DrawX X = new DrawX(e.getX()-10, e.getY()+10);
					xList.add(X);
					repaint();
		        }
		        if (value % 2 == 0) {
		        	System.out.println(e.getX() + " " + e.getY());
					DrawO O = new DrawO(e.getX()-10, e.getY()+10);
					oList.add(O);
					repaint();
		        }
		}

		public void mouseEntered(MouseEvent arg0) {
			
		}

		public void mouseExited(MouseEvent arg0) {
			
		}

		public void mousePressed(MouseEvent arg0) {
			
		}

		public void mouseReleased(MouseEvent arg0) {
			
		}
		
	}
	
	class DrawX {
		int xCoord = 200;
		int yCoord = 200;
		
		public DrawX(int xCoord, int yCoord){
			this.xCoord = xCoord;
			this.yCoord = yCoord;
		}
	}
	class DrawO {
		int xCoord = 200;
		int yCoord = 200;
		
		public DrawO(int xCoord, int yCoord){
			this.xCoord = xCoord;
			this.yCoord = yCoord;
		}
	}
}