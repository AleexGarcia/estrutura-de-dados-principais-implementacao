package stack;

import java.util.Stack;

import model.Carro;

public class Main {
	public static void main(String[] args) {
		Stack<Carro> stackCarro = new Stack<>();
		
		stackCarro.push(new Carro("Ford"));
		stackCarro.push(new Carro("Chevrolet"));
		stackCarro.push(new Carro("Fiat"));
		
		System.out.println(stackCarro);
		
		stackCarro.pop();
		
		System.out.println("Topo da pilha = " + stackCarro.peek());

		System.out.println(stackCarro);
		
		System.out.println(stackCarro.isEmpty());
	}
}
