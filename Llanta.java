public class Llanta{
  private int tipoLlanta;




	/**
	* Default Llanta constructor
    @param tipoLlanta
    simple = 1
    deportiva= 2
    off-road = 3
    oruga de tanqe = 4
	*/
	public Llanta(int tipoLlanta) {
		this.tipoLlanta = tipoLlanta;
	}

	/**
	* Returns value of tipoLlanta
	* @return
	*/
	public int getTipoLlanta() {
		return tipoLlanta;
	}

	/**
	* Sets new value of tipoLlanta
	* @param
	*/
	public void setTipoLlanta(int tipoLlanta) {
		this.tipoLlanta = tipoLlanta;
	}



	/**
	* Create string representation of Llanta for printing
	* @return
	*/

	public String toString() {
    String s = "Llantas: \n";
    switch (tipoLlanta) {
      case 1:
      s+= "          Simples\n";
      break;

      case 2:
      s+="          Deportivas\n";
      break;

      case 3:
      s+="          Off-Road\n";
      break;

      case 4:
      s+="          Oruga de tanque\n";
      break;
    }

    return s;

  }
}
