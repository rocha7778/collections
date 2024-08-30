package abstrac.classes;

class Base {
	public void foo() {
		System.out.println("Base");
	}
}

class Derived extends Base {
	public void foo() {
		System.out.println("Derived");
	}
}

public class Main {


	public static void main(String args[]) {
		Base b = new Derived();
		b.foo();
		Integer.parseInt("1");
		
	}

}
