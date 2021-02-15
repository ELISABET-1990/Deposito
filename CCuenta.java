/**
 * 
 * @author Elisabet Gómez Pavón
 * @version t.4
 * @since 11.02.21
 * 
 */
public class CCuenta {

	/** 
	 * 
	 * @param cantidad
	 * @throws Exception
	 */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterÃ©s;
    
    

    public CCuenta()
    {
    }
/**
 * 
 * @param nombre
 * @param cuenta 
 * @param saldo
 * @param tipo de interes
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
   
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**
 * 
 * @param si la cantidad es menor que cero
 * @throws Exception, que no se puede ingresar una cantidad negativa
 */
    public void retirar(double cantidad) throws Exception
  
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
      
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
       
    }
}
