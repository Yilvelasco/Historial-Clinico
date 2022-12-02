/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import controlador.PacienteControl;


/**
 *
 * @author casa aseo
 */
public class RegPacienteInternalFrame extends javax.swing.JInternalFrame {

	/**
	 * Creates new form RegpacienteInternalFrame
	 */

    private final PacienteControl pacienteControlador;

	public RegPacienteInternalFrame() {
		initComponents();
        pacienteControlador = new PacienteControl(this);
        btn_registrar.addActionListener(pacienteControlador);
        btn_nuevo.addActionListener(pacienteControlador); 
	}

	private void initComponents() {

		buttonGroup1 = new ButtonGroup();
		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();
		jLabel4 = new JLabel();
		jLabel5 = new JLabel();
		txt_identificacion = new JTextField();
		txt_nombres = new JTextField();
		fecha_nacimiento = new JDateChooser();
		txt_apellidos = new JTextField();
		rdb_masculino = new JRadioButton();
		rdb_femenino = new JRadioButton();
		btn_registrar = new JButton();
		btn_nuevo = new JButton();
		jLabel6 = new JLabel();
		jLabel7 = new JLabel();
		jLabel8 = new JLabel();
		int_celular = new JTextField();
		txt_direccion = new JTextField();
		txt_correo = new JTextField();

		setTitle("Registro de Pacientes");
		setVisible(true);

		jLabel1.setText("Identificacion:");

		jLabel2.setText("Nombres:");

		jLabel3.setText("Apellidos:");

		jLabel4.setText("Fecha de Nacimiento:");

		jLabel5.setText("Sexo:");

		txt_identificacion.setText("");
		
		txt_identificacion.setName("IdentificacionTxt"); // NOI18N
		txt_identificacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				txt_identificacionActionPerformed(evt);
			}
		});

		txt_nombres.setText("");
		txt_nombres.setName("NombresTxt"); // NOI18N
		fecha_nacimiento.setName("fNacimientoTxt");
		txt_apellidos.setText("");
		txt_apellidos.setName("ApellidosTxt"); // NOI18N

		buttonGroup1.add(rdb_masculino);
		rdb_masculino.setText("M");

		buttonGroup1.add(rdb_femenino);
		rdb_femenino.setText("F");

		btn_registrar.setText("Registrar");
		btn_registrar.setName("RegistrarBtn"); // NOI18N

		btn_nuevo.setText("Limpiar");
		btn_nuevo.setName("NuevoBtn"); // NOI18N

		jLabel6.setText("Celular:");

		jLabel7.setText("Direccion:");

		jLabel8.setText("Correo:");

		int_celular.setText("");
		int_celular.setName("Celular"); // NOI18N

		txt_direccion.setText("");
		txt_direccion.setName("Direccion"); // NOI18N

		txt_correo.setText("");
		txt_correo.setName("Correo"); // NOI18N

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabel5)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel4)
												.addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
										.addComponent(jLabel6)))
						.addGap(13, 13, 13))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addComponent(jLabel8)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addComponent(btn_registrar).addGap(45, 45, 45)
										.addComponent(btn_nuevo))
								.addComponent(txt_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 164,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createSequentialGroup().addGap(9, 9, 9).addComponent(rdb_masculino)
										.addGap(131, 131, 131).addComponent(rdb_femenino))
								.addComponent(int_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 164,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 270,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(79, 109, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup().addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(txt_direccion, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(txt_correo, javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 270,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE,
														160, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(0, 0, Short.MAX_VALUE)))
								.addContainerGap()))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1)
						.addComponent(txt_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel2)
						.addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(21, 21, 21)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel3))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE))
				.addGap(6, 6, 6)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(rdb_masculino).addComponent(rdb_femenino))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6).addComponent(int_celular, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel7).addComponent(txt_direccion,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(0, 0, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup().addGap(100, 100, 100)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel8))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22,
										Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(btn_registrar).addComponent(btn_nuevo))))
				.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void txt_identificacionActionPerformed(ActionEvent evt) {// GEN-FIRST:event_txt_identificacionActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txt_identificacionActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	public JButton btn_nuevo;
	public JDateChooser fecha_nacimiento;
	public JButton btn_registrar;
	private ButtonGroup buttonGroup1;
	public JTextField int_celular;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	public JRadioButton rdb_femenino;
	public JRadioButton rdb_masculino;
	public JTextField txt_apellidos;
	public JTextField txt_correo;
	public JTextField txt_direccion;
	public JTextField txt_identificacion;
	public JTextField txt_nombres;
	// End of variables declaration//GEN-END:variables

}
