package observer.base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;

public class AppCompositeBase extends JDialog {
	private JButton okButton = new JButton("Ok");
	
	public AppCompositeBase() {
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.setSize(150,100);
		this.add(okButton);
		
		okButton.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent evento) {
				System.out.println("Click! "  + ((JComponent)evento.getSource()).getName() + " " + new Date().toLocaleString());
			}
		});
		
		okButton.addActionListener(evento -> System.out.println("Click novo! " + new Date().toLocaleString()));

	}
	
	public static void main(String[] args) {
		AppCompositeBase app = new AppCompositeBase();
		app.setVisible(true);
	}

}
