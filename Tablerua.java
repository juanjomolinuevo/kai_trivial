
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Tablerua extends JFrame implements ActionListener {

	private JPanel PanelNagusia;
	private JPanel PanelTxikia;
	
	
	public Tablerua() {
		
		
		
		this.setContentPane(PanelNagusia);
	}
	
	

	public void actionPerformed(ActionEvent e) {
		
	}

	public static void main(String[] args) {
		Tablerua t = new Tablerua();
		t.setVisible(true);
	}
	
}