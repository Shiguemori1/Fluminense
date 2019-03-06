
public class Circulo extends Poligono {

	public Circulo(int base) {
		super(base, base);
		// TODO Auto-generated constructor stub
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	double area() {
		return 3.14*(getBase()^2);
	}


}
