
public abstract class NaoPoliedro extends Poliedro {

	private int raio;
	
	public NaoPoliedro (int raio, int altura) {
		super(altura, altura, altura);
		this.setRaio(raio);
	}
	
	@Override
	double volume() {
		// TODO Auto-generated method stub
		return this.getRaio()*this.getAltura();
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

}
