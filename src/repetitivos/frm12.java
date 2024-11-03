package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class frm12 extends JFrame {
	private static final long serialVersionUID = 1L;
	JLabel lblResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm12 frame = new frm12();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 300);
		setLayout(null);
		setLocationRelativeTo(null);

		lblResultado = new JLabel("<html>Números del 1 al 100:<br></html>");
		lblResultado.setBounds(50, 30, 300, 200);
		getContentPane().add(lblResultado);

		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(100, 220, 100, 30);
		btnMostrar.setMnemonic('m');
		getContentPane().add(btnMostrar);

		btnMostrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnMostrar_actionPerformed();	
			}
		});
	}

	protected void btnMostrar_actionPerformed() {
		StringBuilder resultado = new StringBuilder("<html>Números del 1 al 100:<br>");

		// Generar los números de 1 a 100 en 10 filas
		for (int i = 1; i <= 100; i++) {
			resultado.append(i).append(" ");
			if (i % 10 == 0) {
				resultado.append("<br>");
			}
		}
		resultado.append("</html>");

		lblResultado.setText(resultado.toString());
	}
}
