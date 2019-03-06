
public class Piramede extends Poliedro {

	public Piramede(int altura, int base, int largura) {
		super(altura, base, largura);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	double volume() {
		
		return (0.33)*getAltura()*getLargura()*getBase();
	}
}
