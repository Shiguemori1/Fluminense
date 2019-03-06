import java.util.ArrayList;


public class Geometria2 {

	public static void main(String[] args) {
		Cubo cu1 = new Cubo(2, 2, 2);
		Piramede p1 = new Piramede(1, 1, 1);
		Cilindro ci1 = new Cilindro(2, 2);
		Esfera e1 = new Esfera(2);

		
		ArrayList<TresD> a = new ArrayList();
		
		a.add(cu1);
		a.add(p1);
		a.add(ci1);
		a.add(e1);
		for (TresD TresD: a) {
			
			System.out.println("Volume: " + TresD.volume());
		}
	}

}
