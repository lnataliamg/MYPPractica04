public class Auto{
  private int ataque = 0;
  private int defensa = 5;
  private int velocidad = 120; //km/h
  private int coste = 800000;
  private Llanta llantas;
  private Motor motor;
  private Carroceria carroceria;
  private Blindaje blindaje;
  private Arma arma;

  public Auto(){
  }



	/**
	* Returns value of ataque
	* @return
	*/
	public int getAtaque() {
		return ataque;
	}

	/**
	* Sets new value of ataque
	* @param
	*/
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	/**
	* Returns value of defensa
	* @return
	*/
	public int getDefensa() {
		return defensa;
	}

	/**
	* Sets new value of defensa
	* @param
	*/
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	/**
	* Returns value of velocidad
	* @return
	*/
	public int getVelocidad() {
		return velocidad;
	}

	/**
	* Sets new value of velocidad
	* @param
	*/
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	/**
	* Returns value of coste
	* @return
	*/
	public int getCoste() {
		return coste;
	}

	/**
	* Sets new value of coste
	* @param
	*/
	public void setCoste(int coste) {
		this.coste = coste;
	}

	/**
	* Returns value of llantas
	* @return
	*/
	public Llanta getLlantas() {
		return llantas;
	}

	/**
	* Sets new value of llantas
	* @param
	*/
	public void setLlantas(Llanta llantas) {
    int tipoLlanta = llantas.getTipoLlanta();
    switch (tipoLlanta) {
      case 1: //simple
        this.setCoste(getCoste() + 4000);
        break;
      case 2: //deportiva
        this.setCoste(getCoste() + 8000);
        this.setVelocidad(getVelocidad() + 150);
        break;
      case 3: //off-road
        this.setCoste(getCoste() + 8000);
        this.setDefensa(getDefensa() + 7);
        this.setAtaque(getAtaque() + 5);
        break;
      case 4: //oruga de tanque
        this.setCoste(getCoste() + 15000);
        this.setVelocidad(getVelocidad() - 10);
        this.setDefensa(getDefensa() + 20);
        this.setAtaque(getAtaque() + 10);
        break;
    }
    this.llantas = llantas;
	}

	/**
	* Returns value of motor
	* @return
	*/
	public Motor getMotor() {
		return motor;
	}

	/**
	* Sets new value of motor
	* @param
	*/
	public void setMotor(Motor motor) {
    int tipoMotor = motor.getTipoMotor();

    switch (tipoMotor) {
      case 1: //simple
        this.setCoste(getCoste() + 10000);
        break;
      case 2: //deportivo
        this.setCoste(getCoste() + 30000);
        this.setVelocidad(getVelocidad() + 100);
        break;
      case 3: //diesel
        this.setCoste(getCoste() + 40000);
        break;

    }
    this.motor = motor;
	}

	/**
	* Returns value of carroceria
	* @return
	*/
	public Carroceria getCarroceria() {
		return carroceria;
	}

	/**
	* Sets new value of carroceria
	* @param
	*/
	public void setCarroceria(Carroceria carroceria) {
    int tipoCarroceria = carroceria.getTipoCarroceria();
    switch (tipoCarroceria) {
      case 1: //casual
        this.setCoste(getCoste() + 10000);
        break;
      case 2: //deportiva
        this.setCoste(getCoste() + 50000);
        this.setVelocidad(getVelocidad() + 100);
        this.setDefensa(getDefensa()-10);
        break;
      case 3: //camion
        this.setCoste(getCoste() + 75000);
        this.setVelocidad(getVelocidad()-30);
        this.setDefensa(getDefensa() + 100);
        this.setAtaque(getAtaque() + 10);
        break;

    }
    this.carroceria = carroceria;
	}

	/**
	* Returns value of blindaje
	* @return
	*/
	public Blindaje getBlindaje() {
		return blindaje;
	}

	/**
	* Sets new value of blindaje
	* @param
	*/
	public void setBlindaje(Blindaje blindaje) {
    int tipoBlindaje = blindaje.getTipoBlindaje();
    switch (tipoBlindaje) {
      case 1: //simple
        this.setCoste(getCoste() + 15000);
        this.setDefensa(getDefensa()+ 10);
        this.setAtaque(getAtaque() + 10);
        break;
      case 2: //reforzado
        this.setCoste(getCoste() + 50000);
        this.setVelocidad(getVelocidad() - 10);
        this.setDefensa(getDefensa()+100);
        this.setAtaque(getAtaque() + 10);
        break;
      case 3: //tanque
        this.setCoste(getCoste() + 100000);
        this.setVelocidad(getVelocidad()-30);
        this.setDefensa(getDefensa() + 500);
        this.setAtaque(getAtaque() + 20);
        break;

    }

    this.blindaje = blindaje;
	}


	/**
	* Returns value of arma
	* @return
	*/
	public Arma getArma() {
		return arma;
	}

	/**
	* Sets new value of arma
	* @param
	*/
	public void setArma(Arma arma) {
    int tipoArma = arma.getTipoArma();
    switch (tipoArma) {
      case 1: //arpones
        this.setCoste(getCoste() + 8000);
        this.setAtaque(getAtaque() + 50);
        this.setDefensa(getDefensa()+ 10);
        break;
      case 2: //lanzallamas
        this.setCoste(getCoste() + 35000);
        this.setAtaque(getAtaque() + 200);
        this.setDefensa(getDefensa()+ 30);
        break;
      case 3: //lanzas
        this.setCoste(getCoste() + 5000);
        this.setAtaque(getAtaque() + 40);
        this.setDefensa(getDefensa()+ 10);
        break;

      case 4: // sierra
      this.setCoste(getCoste() + 20000);
      this.setAtaque(getAtaque() + 100);
      this.setDefensa(getDefensa()+ 30);
        break;

      case 5: //metralleta
      this.setCoste(getCoste() + 60000);
      this.setAtaque(getAtaque() + 900);
      this.setDefensa(getDefensa()+ 20);
        break;

      case 0: //nada
        break;

    }
    this.arma = arma;
	}
	/**
	* Create string representation of Auto for printing
	* @return
	*/
	@Override
	public String toString() {
    String st = "Este auto tiene las siguientes caracteristicas: \n\n";
    st+= getLlantas().toString() + "\n";

    st+= getMotor().toString() + "\n";
    st+= getCarroceria().toString()+"\n";
    st+= getBlindaje().toString()+"\n";
    st+= getArma().toString()+"\n";
    st+= "         -Costo $" + coste + "\n";
    st+= "         -Ataque " + ataque+ " pts\n";
    st+= "         -Defensa " + defensa + " pts\n";
    st+= "         -Velocidad " + velocidad +  " km/h\n";

    return st;
	}
}
