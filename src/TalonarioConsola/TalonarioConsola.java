package TalonarioConsola;

import TalonarioConsola.model.Talonario;
import TalonarioConsola.service.TalonarioServiceImpl;

public class TalonarioConsola extends TalonarioServiceImpl{
	
	public static void main(String [] args) {
		//TODO Auto-generated method stub
		
		System.out.println("hola");
		
		Talonario talonario= new Talonario();
		talonario.setId(1);
		talonario.setCarnet("$$100624");
		talonario.setDescripcion("Matricula, Cuota 1");
		talonario.setFecha("10-01-2026");
		talonario.setEstado("A");
		
		talonario.guardar(talonario);
		
		boolean r = talonario.guardar(talonario);
		
		if(r)
			System.out.println("registro guardado correctamente");
		else
			System.out.println("error al guardar");
	}
}