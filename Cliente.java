public class Cliente{
  private String nombre;
  private int dinero;

	/**
	* Default empty Cliente constructor
	*/
	public Cliente() {
		super();
	}

	/**
	* Default Cliente constructor
	*/
	public Cliente(String nombre, int dinero) {
		super();
		this.nombre = nombre;
		this.dinero = dinero;
	}



	/**
	* Returns value of nombre
	* @return
	*/
	public String getNombre() {
		return nombre;
	}

	/**
	* Sets new value of nombre
	* @param
	*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	* Returns value of dinero
	* @return
	*/
	public int getDinero() {
		return dinero;
	}

	/**
	* Sets new value of dinero
	* @param
	*/
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

  public void cobrarAuto(Auto auto){

    System.out.println("          Precio final del auto "+"$" +auto.getCoste()+ "                  ");
    if(auto.getCoste()<=dinero ){
      setDinero(getDinero()-auto.getCoste());
      System.out.println("Felicidades, " + nombre + " el auto es tuyo");
      System.out.println("Te sobro $" + dinero );
    }else{
      System.out.println("Lo siento, " + nombre + " ,el pago fue rechazado por fondos insuficientes");
    }
  }
}
