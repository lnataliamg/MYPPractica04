public class Carroceria{
  private int tipoCarroceria;

	/**
	* Default Carroceria constructor
  *@param tipoCarroceria
  * casual = 1
  * deportiva = 2
  * camion = 3
	*/
	public Carroceria(int tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}


	/**
	* Returns value of tipoCarroceria
	* @return
	*/
	public int getTipoCarroceria() {
		return tipoCarroceria;
	}

	/**
	* Sets new value of tipoCarroceria
	* @param
	*/
	public void setTipoCarroceria(int tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}



	/**
	* Create string representation of Carroceria for printing
	* @return
	*/
	@Override
	public String toString() {
    String s = "Carroceria: \n";
    switch (tipoCarroceria) {
      case 1:
      s+= "          Casual\n";
      break;

      case 2:
      s+="          Deportiva\n";
      break;

      case 3:
      s+="          Camion\n";
      break;
    }

    return s;

  
	}
}
