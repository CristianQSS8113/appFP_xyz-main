package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm06 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtRadio, txtAltura, txtArea, txtVolumen;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm06 frame = new frm06();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    public frm06() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 450);
        setLayout(null);
		setLocationRelativeTo(null);

        JLabel lblRadio = new JLabel("Radio(r):");
        lblRadio.setBounds(50, 50, 80, 30);
        getContentPane().add(lblRadio);

        JLabel lblAltura = new JLabel("Altura(h):");
        lblAltura.setBounds(50, 90, 80, 30);
        getContentPane().add(lblAltura);
        
        JLabel lblArea = new JLabel("Area:");
        lblArea.setBounds(50, 130, 80, 30);
        getContentPane().add(lblArea);

        JLabel lblVolumen = new JLabel("Volumen:");
        lblVolumen.setBounds(50, 170, 80, 30);
        getContentPane().add(lblVolumen);

        txtRadio = new JTextField();
        txtRadio.setBounds(150, 50, 80, 30);
        txtRadio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtRadio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtRadio);

        txtAltura = new JTextField();
        txtAltura.setBounds(150, 90, 80, 30);
        txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAltura.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAltura);

        txtArea = new JTextField();
        txtArea.setBounds(150, 130, 80, 30);
        txtArea.setFocusable(false);
        txtArea.setHorizontalAlignment(SwingConstants.RIGHT);
        txtArea.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtArea);

        txtVolumen = new JTextField();
        txtVolumen.setBounds(150, 170, 80, 30);
        txtVolumen.setFocusable(false);
        txtVolumen.setHorizontalAlignment(SwingConstants.RIGHT);
        txtVolumen.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtVolumen);

        JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 270, 100 ,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

    }
    protected void btnCalcular_actionPerformed() {
        double radio = Double.parseDouble(txtRadio.getText());
            double altura = Double.parseDouble(txtAltura.getText());
            double pi = Math.PI;

            double area = 2 * pi * radio * (radio + altura);
            double volumen = pi * Math.pow(radio, 2) * altura;

            DecimalFormat df = new DecimalFormat("###.##");
            txtArea.setText(df.format(area));
            txtVolumen.setText(df.format(volumen));
    }
}