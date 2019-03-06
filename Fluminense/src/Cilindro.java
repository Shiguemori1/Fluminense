
public class Cilindro extends NaoPoliedro  {

	public Cilindro(int raio, int altura) {
		super(raio, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	double volume() {
		
		return 3.14*getAltura()*(getRaio()^3);
	}

	
}
