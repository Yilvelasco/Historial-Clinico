package vista;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controlador.ActulPacienteController;

public class ActulJInternalFrame extends JInternalFrame {
	public JEditorPane textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	
	private final ActulPacienteController pacienteControlador;

	public ActulJInternalFrame() {
		initComponents();
		pacienteControlador = new ActulPacienteController(this);
		btnActualizar.addActionListener(pacienteControlador);

	}

	

	/**
	 * Create the frame.
	 */
	private void initComponents() {
		setTitle("Actualizar Paciente");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(1, 11, 49, 18);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
		getContentPane().add(lblNewLabel);

		textField = new JEditorPane();
		textField.setBounds(60, 11, 229, 18);
		getContentPane().add(textField);

		JLabel label = new JLabel("");
		label.setBounds(92, 68, 144, 67);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("");
		label_1.setBounds(289, 68, 144, 67);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("");
		label_2.setBounds(214, 135, 144, 67);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("");
		label_3.setBounds(289, 135, 144, 67);
		getContentPane().add(label_3);

		JLabel label_4 = new JLabel("");
		label_4.setBounds(145, 202, 144, 67);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("");
		label_5.setBounds(289, 202, 144, 67);
		getContentPane().add(label_5);

		textField_1 = new JTextField();
		textField_1.setBounds(118, 60, 219, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(118, 98, 219, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(118, 146, 219, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);

		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(335, 220, 89, 23);
		getContentPane().add(btnActualizar);

		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(26, 63, 56, 14);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Apellidos");
		lblNewLabel_2.setBounds(26, 101, 56, 14);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Correo");
		lblNewLabel_3.setBounds(26, 149, 65, 14);
		getContentPane().add(lblNewLabel_3);

	}
	public JButton btnActualizar;
}
