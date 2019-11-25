public class Motor{
  private int tipoMotor;

	/**
	* Default Motor constructor
  * @param tipoMotor
  * simple = 1
  * deportivo = 2
  * diesel = 3
	*/
	public Motor(int tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	/**
	* Returns value of tipoMotor
	* @return
	*/
	public int getTipoMotor() {
		return tipoMotor;
	}

	/**
	* Sets new value of tipoMotor
	* @param
	*/
	public void setTipoMotor(int tipoMotor) {
		this.tipoMotor = tipoMotor;
	}



	/**
	* Create string representation of Motor for printing
	* @return
	*/

	public String toString() {
    String s = "Motor: \n";
    switch (tipoMotor) {
      case 1:
      s+= "          Simple\n";
      break;

      case 2:
      s+="          Deportivo\n";
      break;

      case 3:
      s+="          Diesel\n";
      break;
    }

    return s;

  
	}
}
