
package empresa;

import java.awt.Color;
import java.util.Date;


 
public class Empresa {

private int numeroDeEmpleados;
private boolean asegurada;
private Date fechaDeVacaciones;
private Color colorDeUniformes;


public void contratarEmpleados(){
    this.numeroDeEmpleados +=4;
}
public void asegurarEmpresa(){
    this.asegurada =true;
}
        
public int getNumeroDeEmpleados (){
    return numeroDeEmpleados;
}

public void setNumeroDeEmpleados (int numeroDeEmpleados) {
}
    
public boolean getAsegurada (){
    return asegurada;
} 
}  
