package queue;

import java.util.LinkedList;
import java.util.Queue;

import model.Carro;

public class Main {
	public static void main(String[] args) {
		Queue<Carro> queueCarros = new LinkedList<>();
		queueCarros.add(new Carro("Ford"));
		queueCarros.add(new Carro("Chevrolet"));
		queueCarros.add(new Carro("Fiat"));
		queueCarros.add(new Carro("Peugeout"));

		System.out.println(queueCarros);
		System.out.println(queueCarros.offer(new Carro("Renault")));
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.peek());
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.poll());
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.size());
	}
}
