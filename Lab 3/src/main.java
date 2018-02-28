import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.net.IDN;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;


public class main {
	
	public static void main(String[] args) throws IOException {
	JTabbedPane tabbedPane = new JTabbedPane();
	
	JEditorPane ep = new JEditorPane(); 
	JEditorPane browserPane = new JEditorPane();
	browserPane.setEditable(false);
	
	JPanel FullPanel = new JPanel();
	browserPane.setEditable(false);
	FullPanel.setLayout(null);
	
	JEditorPane browserPane2 = new JEditorPane();
	browserPane2.setEditable(false);
	browserPane2.setBounds(5,25,1190,850);
	FullPanel.add(browserPane2);
	
	JButton button = new JButton("GO!");
	button.setBounds(450,300,250,40);
	JButton button2 = new JButton("Go Back <--");
	button2.setActionCommand("back");
	button2.setBounds(50,50,100,50);
	
	JTextField textArea = new JTextField();
	textArea.setBounds(450,200,250,30);	
	
	try {
		  browserPane.setPage("http://google.com");
		}catch (IOException e) {
			System.out.println("error loading page");
		}    
	 
	ActionListener al = new ActionListener() {       
        public void actionPerformed(ActionEvent e) {         
             try {           
                  String url = e.getActionCommand().toLowerCase();           
                  if (url.startsWith("http://"))             
                       url = url.substring(7);           
                  ep.setPage("http://" + IDN.toASCII(url));         
             } catch (Exception e1) {           
                  e1.printStackTrace();
                 JOptionPane.showInputDialog(textArea, "Browser problem: " + e1.getMessage(), 0);         
             }       
        }     
   };    
	button2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			actionBack();
		}

		private void actionBack() {
			// TODO Auto-generated method stub
			
		}
});
	JFrame browserWindow = new JFrame("Isaac's Web Browser");
	tabbedPane.addTab("Tab 1", null,browserPane,
			"Does nothing");
	tabbedPane.addTab("Tab 2", null, browserPane2,
			"Does nothing");
	browserPane2.getActions();
	browserPane2.setBackground(Color.LIGHT_GRAY);
	browserPane2.add(textArea);
	browserPane2.add(button);
	browserPane2.add(button2);
	browserWindow.add(tabbedPane);
    browserWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	browserWindow.setSize(1200,900);
	browserWindow.setVisible(true);}
}

