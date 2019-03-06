
public class Losango extends Poligono{

	public Losango(int base, int altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return getAltura()*(4*getBase());
}

}