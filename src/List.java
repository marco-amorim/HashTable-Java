public class List {

	Node start;
	int size;

	public void insert(Computer pc) {
		Node node = new Node();
		node.data = pc;
		node.next = start;
		node.previous = null;
		if (start != null) {
			start.previous = node;
		}
		start = node;
		size++;
	}

	public Computer search(int model) {
		Node node = start;

		while (node != null) {
			if (node.data.model == model) {
				return node.data;
			}
			node = node.next;
		}

		return null;
	}

	public boolean remove(int model) {
		Node local = start;

		while (local != null) {
			if (local.data.model == model) {

				if (local.previous == null) {
					removeStart(model);
					size--;
					return true;
				}

				if (local.previous != null) {
					local.previous.next = local.next;
					size--;
					return true;
				}

				if (local.next != null) {
					local.next.previous = local.previous;
					size--;
					return true;
				}

			}
			local = local.next;
		}

		return false;
	}

	public boolean removeStart(int model) {
		Node node = start;

		if (node == null) {
			return false;
		} else {

			while (node != null) {
				if (node.data.model == model) {
					start = start.next;
					size--;
				} else {
					return false;
				}
				node = node.next;
			}
			return true;
		}

	}

	public boolean checkIfElementExist(int model) {
		Node node = start;

		while (node != null) {
			if (node.data.model == model) {
				return true;
			}
			node = node.next;
		}

		return false;

	}

	public String toString() {
		String out = "";
		Node node = start;
		while (node != null) {
			out += node.data + " ";
			node = node.next;
		}
		return out;
	}

}
