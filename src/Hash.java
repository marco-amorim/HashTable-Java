public class Hash {

	int operator;
	List[] array;

	public Hash(int operator) {
		this.operator = operator;
		array = new List[operator];
		for (int i = 0; i < operator; i++) {
			array[i] = new List();
		}
	}

	public void insert(Computer pc) {
		int index = pc.model % operator;
		array[index].insert(pc);

	}

	public void removePerValue(int model) {
		int index = model % operator;
		if (array[index].remove(model)) {
			System.out.println("O elemento " + model + " foi excluido com sucesso! \n");
		} else {
			System.out.println("O elemento nao existe! \n");
		}
	}

	public void removeStart(int model) {
		int index = model % operator;
		if (array[index].removeStart(model)) {
			System.out.println("Foi removido o primeiro elemento \n");
		} else {
			System.out.println("O elemento nao existe! \n");
		}
	}

	public void checkIfElementExist(int model) {
		int index = model % operator;
		if (array[model % operator].checkIfElementExist(model)) {
			System.out.println("O elemento existe e esta no indice => " + index + "\n");
		} else {
			System.out.println("O elemento nao existe na hash! \n");
		}
	}

	public Computer search(int model) {
		return array[model % operator].search(model);
	}

	public String toString() {
		String out = "";
		for (int i = 0; i < operator; i++) {
			out += "" + i + ": ";
			out += array[i % operator] + "\n";
		}
		return out;
	}

}
