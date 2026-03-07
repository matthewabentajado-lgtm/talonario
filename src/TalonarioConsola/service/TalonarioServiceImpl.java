package TalonarioConsola.service;

import java.util.LinkedList;
import java.util.List;

import TalonarioConsola.model.Talonario;


public class TalonarioServiceImpl implements ITalonarioService {
	
	//crenado lista
	List<Talonario> talonarios = null;
	
	public TalonarioServiceImpl() {
		talonarios = new LinkedList<>();
	
	
	}
	
	@Override
	public boolean guardar(Talonario talonario) {
		 
		talonarios.add(talonario);
		
		return true;
	}

	

	@Override
	public Talonario recuperarI(Talonario talonario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modificar(Talonario talonario) {
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
