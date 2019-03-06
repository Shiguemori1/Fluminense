import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		Circulo c1 = new Circulo(3);
		Triangulo t1 = new Triangulo(5, 6);
		Quadrado q1 = new Quadrado(8);
		Retangulo r1 = new Retangulo(8, 9);
		Losango l1 = new Losango(2, 2);
		Quadrado qp2 = new Quadrado(8);
		Retangulo rp2 = new Retangulo(8, 9);
		
		ArrayList<DoisD> a = new ArrayList();
		ArrayList<DoisD> p = new ArrayList();
		
		a.add(c1);
		a.add(t1);
		a.add(q1);
		a.add(r1);
		a.add(l1);
		p.add(qp2);
		p.add(rp2);
		
		
		
		for (DoisD DoisD: a){
			
			System.out.println("Area: " + DoisD.area());
		}
		
		for (DoisD DoisD: p){
			
			System.out.println("Perimetro: " + DoisD.perimetro());
		}		
		
	}
}


