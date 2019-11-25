public abstract class BuilderAuto{
  protected Auto auto;


	/**
	* Default empty BuilderAuto constructor
	*/
	public BuilderAuto() {
		super();
	}

	/**
	* Default BuilderAuto constructor
	*/
	public BuilderAuto(Auto auto) {
		super();
		this.auto = auto;
	}

  public Auto getAuto(){
    return auto;
  }

  public void crearAuto(){
    auto = new Auto();
  }

  public abstract void construirLlantas();
  public abstract void construirMotor();
  public abstract void construirCarroceria();
  public abstract void construirBlindaje();
  public abstract void construirArmas();
}
