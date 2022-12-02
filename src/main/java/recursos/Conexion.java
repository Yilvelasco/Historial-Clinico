/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursos;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
	private String bd, usr, pass;
	public Connection conexion;

	public Conexion(String bd, String usr, String pass) {

		this.bd = bd;
		this.usr = usr;
		this.pass = pass;

		try {

			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + bd, usr, pass);

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Error de conexion con la base de datos" + ex);

		}

	}

	public Connection getConexion() {
		return conexion;
	}

	public Connection CerrarConexion() throws SQLException {
		conexion.close();
		conexion = null;
		return conexion;
	}
}
