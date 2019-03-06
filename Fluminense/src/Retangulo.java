
public class Retangulo extends Poligono implements Diagonal{

	public Retangulo(int base, int altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaDiagonal() {
		return 0;
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return getBase()*2+getAltura()*2;
	}


}
