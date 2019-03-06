
public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(int lado) {
		super(lado, lado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaDiagonal() {
		return 0;
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return 4*getBase();
	}

}
