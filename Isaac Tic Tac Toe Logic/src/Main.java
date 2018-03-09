import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		//SwingUtilities.invokeLater(new Runnable);
		createAndShowGUI();
	}
	private static void createAndShowGUI()
	{
		
		JFrame frame = new JFrame("Tic Tac Toe Board");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(322, 422);
		frame.setVisible(true);
		
		TTTBoard board = new TTTBoard();
		frame.add(board);
	}
}