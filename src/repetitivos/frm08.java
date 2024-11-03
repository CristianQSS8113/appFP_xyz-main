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

public class frm08 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtBase, txtExponente;
	JLabel lblResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm08 frame = new frm08();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 350, 250);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblBase = new JLabel("Base (n):");
		lblBase.setBounds(50, 50, 80, 30);
		getContentPane().add(lblBase);

		JLabel lblExponente = new JLabel("Exponente (m):");
		lblExponente.setBounds(50, 90, 100, 30);
		getContentPane().add(lblExponente);

		lblResultado = new JLabel("Potencia:");
		lblResultado.setBounds(50, 130, 250, 30);
		getContentPane().add(lblResultado);

		txtBase = new JTextField();
		txtBase.setBounds(160, 50, 60, 30);
		txtBase.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBase.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBase);

		txtExponente = new JTextField();
		txtExponente.setBounds(160, 90, 60, 30);
		txtExponente.setHorizontalAlignment(SwingConstants.RIGHT);
		txtExponente.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtExponente);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 170, 100, 30);
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
		int base = Integer.parseInt(txtBase.getText());
		int exponente = Integer.parseInt(txtExponente.getText());
		long potencia = 1;

		for (int i = 1; i <= exponente; i++) {
			potencia *= base;
		}

		lblResultado.setText("Potencia: " + potencia);
	}
}
