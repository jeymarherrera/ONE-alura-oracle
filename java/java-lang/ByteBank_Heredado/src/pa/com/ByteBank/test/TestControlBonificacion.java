package pa.com.ByteBank.test;
import pa.com.ByteBank.modelo.*;

public class TestControlBonificacion {

	public static void main(String[] args) {
		Funcionario funcionario = new Contador(); 
        funcionario.setSalario(2000);
        
        Gerente gerente = new Gerente(); 
        //gerente.setSalario(10000);
        
        Contador contador = new Contador();
        contador.setSalario(5000);
       ControlBonificacion controlBonificacion = new ControlBonificacion();
        
        controlBonificacion.registrarSalario(funcionario);
        controlBonificacion.registrarSalario(gerente);
        controlBonificacion.registrarSalario(contador);
       
	}
}
