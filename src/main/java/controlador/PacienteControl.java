/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import controlador.exceptions.PreexistingEntityException;
import modelo.Paciente;
import vista.RegPacienteInternalFrame;

public class PacienteControl implements ActionListener {

	RegPacienteInternalFrame pacienteVista;
	Paciente pacienteModelo;
	PacienteJpaController gestorpacienteModelo;

	public PacienteControl(RegPacienteInternalFrame pacienteVista) {
		this.pacienteVista = pacienteVista;
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("ProyectoPacienteJPA");
		gestorpacienteModelo = new PacienteJpaController(emf);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(pacienteVista.btn_registrar)) {

			int identificacion = Integer.parseInt(pacienteVista.txt_identificacion.getText());
			String nombres = pacienteVista.txt_nombres.getText();
			String apellidos = pacienteVista.txt_apellidos.getText();
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			String fecha_nacimiento = formato.format(pacienteVista.fecha_nacimiento.getDate());
			String celular = pacienteVista.int_celular.getText();
			String direccion = pacienteVista.txt_direccion.getText();
			String correo = pacienteVista.txt_correo.getText();

			char genero = '-';

			if (pacienteVista.rdb_masculino.isSelected()) {
				genero = 'M';
			}

			if (pacienteVista.rdb_femenino.isSelected()) {
				genero = 'F';
			}
			pacienteModelo = new Paciente(identificacion, nombres, apellidos, genero, fecha_nacimiento, celular,
					direccion, correo);
			try {
				gestorpacienteModelo.create(pacienteModelo);
				JOptionPane.showMessageDialog(null, "Paciente Registrado");
			} catch (PreexistingEntityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.setSource(pacienteVista.btn_nuevo);
		}

		if (e.getSource().equals(pacienteVista.btn_nuevo)) {
			pacienteVista.txt_identificacion.setText("");
			pacienteVista.txt_nombres.setText("");
			pacienteVista.txt_apellidos.setText("");
			pacienteVista.int_celular.setText("");
			pacienteVista.txt_direccion.setText("");
			pacienteVista.txt_correo.setText("");
			pacienteVista.fecha_nacimiento.setDate(null);
			pacienteVista.rdb_masculino.setSelected(false);
			pacienteVista.rdb_femenino.setSelected(false);
			pacienteVista.txt_identificacion.requestFocus();
		}
	}
}
