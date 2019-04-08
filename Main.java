	private void botonConectarActionPerformed(java.awt.event.ActionEvent evt) {                                              
		Connection laConexion = getConnection();
		PreparedStatement ps;
		ResultSet rs;

		try {
			ps = laConexion.prepareStatement("select * from personas");
			rs = ps.executeQuery();

			if (rs.next()) {
				JOptionPane.showMessageDialog(null, "nombre" +rs.getString("nombre"));
				///String.valueOf(rs.getDate("fecha_nacimiento"));   
			}
			else {
				///No hay registros
			}
			laConexion.close();

		} catch (Exception e) {
			// Todo se derrumbo
		}

	}
