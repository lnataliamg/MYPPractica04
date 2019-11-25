public class Arma{
  private int tipoArma;


	/**
	* Default Arma constructor
  * @param tipoArma
  * arpones = 1
  * lanzallamas = 2
  * lanzas = 3
  * sierra = 4
  * metralleta = 5
	*/
	public Arma(int tipoArma) {
		this.tipoArma = tipoArma;
	}



	/**
	* Returns value of tipoArma
	* @return
	*/
	public int getTipoArma() {
		return tipoArma;
	}

	/**
	* Sets new value of tipoArma
	* @param
	*/
	public void setTipoArma(int tipoArma) {
		this.tipoArma = tipoArma;
	}



	/**
	* Create string representation of Arma for printing
	* @return
	*/
	@Override
	public String toString() {
    String s = "Armas: \n";
    switch (tipoArma) {
      case 1:
      s+= "          Arpones\n";
      break;

      case 2:
      s+="          Lanzallamas\n";
      break;

      case 3:
      s+="          Lanzas\n";
      break;

      case 4:
      s+="          Sierra\n";
      break;

      case 5:
      s+="          Metralleta\n";
      break;

      case 0:
      s+="          Sin armas\n";
    }

    return s;

  }

}
