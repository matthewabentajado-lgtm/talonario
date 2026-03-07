package TalonarioConsola.service;

import java.util.List;

import TalonarioConsola.model.Talonario;

public interface ITalonarioService {
	
	
	public boolean guardar(Talonario talonario); //guardar talonario
	public Talonario recuperarI(Talonario talonario); //recuperar talonario en base al objeto dentro del objeto esta el carnet
	public List<Talonario>  recuperarTalonarios();
	public  Talonario modificar(Talonario talonario); //modificar talonario 
	public boolean eliminar(Talonario talonario); //eliminar talonario
	
	

}
