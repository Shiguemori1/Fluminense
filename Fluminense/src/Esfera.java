
public class Esfera extends NaoPoliedro {

	public Esfera(int raio) {
		super(raio, raio);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	double volume() {
		
		return (1.3)*3.14*(getRaio()^3);
	}

}
