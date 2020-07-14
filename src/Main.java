public class Main {

	public static void main(String[] args) {
		
		Hash hash = new Hash(25);
		hash.insert(new Computer(38, "i9-9900k", "GTX 1660 SUPER"));
		hash.insert(new Computer(25, "i7-7700k", "GTX 1660 Ti"));
		hash.insert(new Computer(13, "i5-9400", "GTX 1060"));
		hash.insert(new Computer(44, "i5-4460", "RTX 2060"));
		hash.insert(new Computer(88, "i7-7700k", "RX 5700"));
		hash.insert(new Computer(12, "i7-7700k", "GTX 1660 SUPER 6"));

		hash.insert(new Computer(17, "i9-9900k", "GTX 1660 SUPER"));
		hash.insert(new Computer(33, "i7-7700k", "GTX 1660 Ti"));
		hash.insert(new Computer(35, "i5-9400", "GTX 1060"));
		hash.insert(new Computer(62, "i5-4460", "RTX 2060"));
		hash.insert(new Computer(78, "i7-7700k", "RX 5700"));
		hash.insert(new Computer(23, "i7-7700k", "GTX 1660 SUPER 6"));

		hash.insert(new Computer(71, "i9-9900k", "GTX 1660 SUPER"));
		hash.insert(new Computer(102, "i7-7700k", "GTX 1660 Ti"));
		hash.insert(new Computer(94, "i5-9400", "GTX 1060"));
		hash.insert(new Computer(91, "i5-4460", "RTX 2060"));
		hash.insert(new Computer(84, "i7-7700k", "RX 5700"));
		hash.insert(new Computer(55, "i7-7700k", "GTX 1660 SUPER 6"));

		hash.insert(new Computer(44, "i9-9900k", "GTX 1660 SUPER"));
		hash.insert(new Computer(125, "i7-7700k", "GTX 1660 Ti"));
		hash.insert(new Computer(152, "i5-9400", "GTX 1060"));
		hash.insert(new Computer(81, "i5-4460", "RTX 2060"));
		hash.insert(new Computer(95, "i7-7700k", "RX 5700"));
		hash.insert(new Computer(21, "i7-7700k", "GTX 1660 SUPER 6"));
		hash.insert(new Computer(31, "i9-9900k", "GTX 1660 SUPER"));

		System.out.println(hash);

		hash.removePerValue(71);

		System.out.println(hash);

		hash.checkIfElementExist(31);

	}

}
