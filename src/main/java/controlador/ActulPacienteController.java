package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import modelo.Paciente;
import vista.ActulJInternalFrame;

public class ActulPacienteController implements ActionListener {
	ActulJInternalFrame pacienteVista;

	PacienteJpaController gestorpacienteModelo;

	public ActulPacienteController(ActulJInternalFrame pacienteVista) {
		this.pacienteVista = pacienteVista;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("historial-clinico");
		gestorpacienteModelo = new PacienteJpaController(emf);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource().equals(pacienteVista.btnActualizar)) {
			
			int identificacion = Integer.parseInt(pacienteVista.textField.getText());
			Paciente p= gestorpacienteModelo.findPaciente(identificacion);
			
			if (p != null) {
				String nombre = pacienteVista.textField_1.getText();
				String apellidos = pacienteVista.textField_2.getText();
				String correo = pacienteVista.textField_3.getText();
				p.setNPaciente(nombre);
				p.setAPaciente(apellidos);
				p.setCorreoPaciente(correo);
				try {
					gestorpacienteModelo.edit(p);
					JOptionPane.showMessageDialog(null, "Paciente Actualizado");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else {
				JOptionPane.showMessageDialog(null, "Paciente No Encotrado");
			}

		}

	}
}
