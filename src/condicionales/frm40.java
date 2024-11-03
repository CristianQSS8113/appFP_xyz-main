package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class frm40 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtPC1, txtPC2, txtPC3, txtEP, txtEF, txtPromedio, txtCondicion;
    JComboBox<String> comboCurso;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm40 frame = new frm40();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm40() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 450, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCurso = new JLabel("Curso:");
        lblCurso.setBounds(50, 30, 150, 30);
        getContentPane().add(lblCurso);

        comboCurso = new JComboBox<>(new String[] {"Matemática", "Física", "Química"});
        comboCurso.setBounds(200, 30, 150, 30);
        getContentPane().add(comboCurso);

        JLabel lblPC1 = new JLabel("Nota PC1:");
        lblPC1.setBounds(50, 70, 150, 30);
        getContentPane().add(lblPC1);

        JLabel lblPC2 = new JLabel("Nota PC2:");
        lblPC2.setBounds(50, 110, 150, 30);
        getContentPane().add(lblPC2);

        JLabel lblPC3 = new JLabel("Nota PC3:");
        lblPC3.setBounds(50, 150, 150, 30);
        getContentPane().add(lblPC3);

        JLabel lblEP = new JLabel("Examen Parcial:");
        lblEP.setBounds(50, 190, 150, 30);
        getContentPane().add(lblEP);

        JLabel lblEF = new JLabel("Examen Final:");
        lblEF.setBounds(50, 230, 150, 30);
        getContentPane().add(lblEF);

        JLabel lblPromedio = new JLabel("Promedio Final:");
        lblPromedio.setBounds(50, 270, 150, 30);
        getContentPane().add(lblPromedio);

        txtPC1 = new JTextField();
        txtPC1.setBounds(200, 70, 100, 30);
        txtPC1.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPC1);

        txtPC2 = new JTextField();
        txtPC2.setBounds(200, 110, 100, 30);
        txtPC2.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPC2);

        txtPC3 = new JTextField();
        txtPC3.setBounds(200, 150, 100, 30);
        txtPC3.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPC3);

        txtEP = new JTextField();
        txtEP.setBounds(200, 190, 100, 30);
        txtEP.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtEP);

        txtEF = new JTextField();
        txtEF.setBounds(200, 230, 100, 30);
        txtEF.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtEF);

        txtPromedio = new JTextField();
        txtPromedio.setBounds(200, 270, 100, 30);
        txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPromedio.setFocusable(false);
        getContentPane().add(txtPromedio);

        txtCondicion = new JTextField();
        txtCondicion.setBounds(320, 270, 100, 30);
        txtCondicion.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCondicion.setFocusable(false);
        getContentPane().add(txtCondicion);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(320, 70, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> calcularPromedio());
    }

    protected void calcularPromedio() {
        try {
            double pc1 = Double.parseDouble(txtPC1.getText());
            double pc2 = Double.parseDouble(txtPC2.getText());
            double pc3 = Double.parseDouble(txtPC3.getText());
            double ep = Double.parseDouble(txtEP.getText());
            double ef = Double.parseDouble(txtEF.getText());

            String curso = (String) comboCurso.getSelectedItem();
            double promedioFinal = 0.0;

            switch (curso) {
                case "Matemática":
                    promedioFinal = pc1 * 0.10 + pc2 * 0.20 + pc3 * 0.10 + ep * 0.30 + ef * 0.30;
                    break;
                case "Física":
                    promedioFinal = pc1 * 0.20 + pc2 * 0.20 + pc3 * 0.20 + ep * 0.20 + ef * 0.20;
                    break;
                case "Química":
                    promedioFinal = pc1 * 0.10 + pc2 * 0.30 + pc3 * 0.10 + ep * 0.25 + ef * 0.25;
                    break;
            }

            txtPromedio.setText(String.format("%.2f", promedioFinal));
            txtCondicion.setText(promedioFinal >= 13 ? "Aprobado" : "Desaprobado");

        } catch (Exception ex) {
            txtPromedio.setText("Error");
            txtCondicion.setText("Error");
        }
    }
}
