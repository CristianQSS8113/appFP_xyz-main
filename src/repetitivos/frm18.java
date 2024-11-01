package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class frm18 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtRpta;
	String texto;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm18 frame = new frm18();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm18() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 200, 150);
		setLayout(null);
		setLocationRelativeTo(null);

		txtRpta = new JTextField();
		txtRpta.setBounds( 20, 50, 150, 30);
		txtRpta.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtRpta);

		texto = "omar";
		txtRpta.setText( toUpperCase() );

	}

	protected String toUpperCase() {
		if ( texto == null || texto.isEmpty() ) return "";

		char letra;
		String rpta = "";
		for ( int i=0; i < texto.length(); i++ ) {
			letra = texto.charAt(i);
			letra -= letra >= 'a' && letra <= 'z' ? 32 : 0;
			rpta += letra;
		}

		return rpta;
	}

}