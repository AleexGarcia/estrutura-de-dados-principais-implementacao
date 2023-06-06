package equalsHashcode;

import java.util.ArrayList;
import java.util.List;

import model.Carro;


public class Main {
	public static void main(String[] args) {
		List<Carro> listaCarros = new ArrayList<>();
		listaCarros.add(new Carro("Ford"));
		listaCarros.add(new Carro("Chevrolet"));
		listaCarros.add(new Carro("Volkswagen"));
		
		System.out.println(listaCarros.contains(new Carro("Ford")));
		System.out.println(new Carro("Ford").hashCode());
		System.out.println(new Carro("Ford1").hashCode());
		Carro car1 = new Carro("Ford");
		Carro car2 = new Carro("Chevrolet");
		System.out.println(car1.equals(car2));
	}
}
