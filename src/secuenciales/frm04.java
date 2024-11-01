package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm04 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtPies, txtPulgadas, txtMetros, txtCentimetros;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm04 frame = new frm04();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    public frm04()  {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 450);
        setLayout(null);
		setLocationRelativeTo(null);

        JLabel lblPies =new JLabel("Pies");
        lblPies.setBounds(50, 50, 80, 30);
        getContentPane().add(lblPies);

        JLabel lblPulgadas =new JLabel("Pulgadas :");
        lblPulgadas.setBounds(50, 90, 80, 30);
        getContentPane().add(lblPulgadas);

        JLabel lblMetros =new JLabel("Metros :");
        lblMetros.setBounds(50, 130, 80, 30);
        getContentPane().add(lblMetros);

        JLabel lblCentimetros =new JLabel("Centimetros :");
        lblCentimetros.setBounds(50, 170, 80, 30);
        getContentPane().add(lblCentimetros);

        txtPies = new JTextField();
		txtPies.setBounds(150, 50, 80, 30);
		txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPies.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPies);

		txtPulgadas = new JTextField();
		txtPulgadas.setBounds(150, 90, 80, 30);
		txtPulgadas.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPulgadas.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPulgadas);

		txtMetros = new JTextField();
		txtMetros.setBounds(150, 130, 80, 30);
		txtMetros.setFocusable(false);
		txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMetros.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMetros);

		txtCentimetros = new JTextField();
		txtCentimetros.setBounds(150, 170, 80, 30);
		txtCentimetros.setFocusable(false);
		txtCentimetros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCentimetros.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCentimetros);   

        JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 270, 100 ,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }
    protected void btnCalcular_actionPerformed() {
        int pies = Integer.parseInt( txtPies.getText() );
        int pulgadas = Integer.parseInt(txtPulgadas.getText());

        double metros = pies * 0.3048;
        double  centimetros = (pies * 12 +pulgadas) * 2.54;
        
        DecimalFormat df = new DecimalFormat("###.##");
		txtMetros.setText(df.format(metros) );
		txtCentimetros.setText(df.format(centimetros) );
    }

}