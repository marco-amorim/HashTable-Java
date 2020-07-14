public class Computer {
	int model;
	String cpu;
	String gpu;

	public Computer(int model, String cpu, String gpu) {
		this.model = model;
		this.cpu = cpu;
		this.gpu = gpu;
	}

	public Computer() {

	}

	public String toString() {
		return "{" + model + ", " + cpu + ", " + gpu + "}";
	}

}
