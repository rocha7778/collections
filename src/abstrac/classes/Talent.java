package abstrac.classes;

class Programmer {
	protected void code() {
		System.out.println("Protected method");
	}
}

public class Talent extends Programmer {

	protected void code() {
		System.out.println("Extended method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Programmer p = new Programmer();
		p.code();

	}

}
