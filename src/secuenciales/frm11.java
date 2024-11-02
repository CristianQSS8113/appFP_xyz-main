package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm11 extends JFrame {
	private static final long serialVersionUID = 1L;
    JTextField txtNumero1, txtNumero2, txtResultado1, txtResultado2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {   
					frm11 frame = new frm11();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    public frm11() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 300);
        setLayout(null);
		setLocationRelativeTo(null);

        JLabel lblNumero1 = new JLabel("Numero :");
        lblNumero1.setBounds(50, 30, 80, 30 );
        getContentPane().add(lblNumero1);

        JLabel lblNumero2 = new JLabel("Numero 2 :");
        lblNumero2.setBounds(50, 70, 80, 30);
        getContentPane().add(lblNumero2);

        JLabel lblResultado1 = new JLabel("Numero 1 intercambiado:");
        lblResultado1.setBounds(50, 110, 150, 30);
        getContentPane().add(lblResultado1);

        JLabel lblResultado2 = new JLabel("Numero 2 intercambiado:");
        lblResultado2.setBounds(50, 150, 150, 30);
        getContentPane().add(lblResultado2);

        txtNumero1 = new JTextField();
        txtNumero1.setBounds(150, 30, 100, 30);
        txtNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero1);

        txtNumero2 = new JTextField();
        txtNumero2.setBounds(150, 70, 100, 30);
        txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero2);

        txtResultado1 = new JTextField();
        txtResultado1.setBounds(200, 110, 50, 30);
        txtResultado1.setFocusable(false);
        txtResultado1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResultado1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado1);

        txtResultado2 = new JTextField();
        txtResultado2.setBounds(200, 150, 50, 30);
        txtResultado2.setFocusable(false);
        txtResultado2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResultado2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado2);

        JButton btnIntercambiar = new JButton("Intercambiar");
        btnIntercambiar.setBounds(80, 200, 140, 30);
        btnIntercambiar.setMnemonic('i');
        getContentPane().add(btnIntercambiar);

        btnIntercambiar.addActionListener(e -> btnIntercambiar_actionPerformed());
    }

    protected void btnIntercambiar_actionPerformed() {
        int numero1 = Integer.parseInt(txtNumero1.getText());
        int numero2 = Integer.parseInt(txtNumero2.getText());

        int primera1 = numero1 / 100;
        int segunda1 = (numero1 / 10) % 10;
        int tercera1 = numero1 % 10;

        int primera2 = numero2 / 100;
        int segunda2 = (numero2 / 10) % 10;
        int tercera2 = numero2 % 10;

        int nuevoNumero1 = tercera2 * 100 + segunda1 * 10 + primera2;
        int nuevoNumero2 = tercera1 * 100 + segunda2 * 10 + primera1;

        txtResultado1.setText(String.valueOf(nuevoNumero1));
        txtResultado2.setText(String.valueOf(nuevoNumero2));
    }
}