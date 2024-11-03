package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm07 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero;
	JLabel lblResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm07 frame = new frm07();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 350, 200);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNumero = new JLabel("Número (n):");
		lblNumero.setBounds(50, 30, 80, 30);
		getContentPane().add(lblNumero);

		lblResultado = new JLabel("Factorial:");
		lblResultado.setBounds(50, 90, 250, 30);
		getContentPane().add(lblResultado);

		txtNumero = new JTextField();
		txtNumero.setBounds(150, 30, 60, 30);
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 130, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();	
			}
		});
	}

	protected void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt(txtNumero.getText());
		long factorial = 1;

		for (int i = 1; i <= numero; i++) {
			factorial *= i;
		}

		lblResultado.setText("Factorial: " + factorial);
	}
}
