package TalonarioConsola.service;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import TalonarioConsola.Conexion.ConexionMySQL;
import TalonarioConsola.model.Talonario;


public class TalonarioServiceImpl implements ITalonarioService {
	
	
	
	@Override
	public boolean guardar(Talonario talonario) {
		boolean hecho = false;
		ConexionMySQL conexion = new ConexionMySQL();
		Connection con = null;
		PreparedStatement ps;
		String sql = "INSERT INTO ESTUDIANTE (carnet ,descripcion , fecha, estado ) values(?,?,?,?)";
		try {
			con = conexion.getConexion();
			ps = con.prepareStatement(sql);
			ps.setString(1, talonario.getCarnet());
			ps.setString(1, talonario.getDescripcion());
			ps.setString(1, talonario.getFecha());
			ps.setString(1, talonario.getEstado);
			ps.execute();
			hecho = true;
			
		}catch (SQLException e) {
				System.out.println(e);
				
		}finally {
			try {
				con.close();
			}catch (SQLException e) {
				//TODO Auto-generated catch block 
				e.printStackTrace();
				
			}
		}
		 
		return hecho;
	}

	

	@Override
	public Talonario recuperarI(Talonario talonario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Talonario modificar(Talonario talonario) {
		return talonario;
		// TODO Auto-generated method stub
		
	
		
	}

	@Override
	public boolean eliminar(Talonario talonario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Talonario> recuperarTalonarios() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
