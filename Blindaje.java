public class Blindaje{
  private int tipoBlindaje;

	/**
	* Default Blindaje constructor
  * @param tipoBlindaje
  * simple = 1
  * reforzado = 2
  * tanque = 3
	*/
	public Blindaje(int tipoBlindaje) {
		this.tipoBlindaje = tipoBlindaje;
	}

	/**
	* Returns value of tipoBlindaje
	* @return
	*/
	public int getTipoBlindaje() {
		return tipoBlindaje;
	}

	/**
	* Sets new value of tipoBlindaje
	* @param
	*/
	public void setTipoBlindaje(int tipoBlindaje) {
		this.tipoBlindaje = tipoBlindaje;
	}



	/**
	* Create string representation of Blindaje for printing
	* @return
	*/
	@Override
	public String toString() {
    String s = "Blindaje: \n";
    switch (tipoBlindaje) {
      case 1:
      s+= "          Simple\n";
      break;

      case 2:
      s+="          Reforzado\n";
      break;

      case 3:
      s+="          Tanque\n";
      break;
    }

    return s;


	}
}
