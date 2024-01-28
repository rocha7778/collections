package collection.framework;

public class HasCodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String hola = "1";
		int h = hola.hashCode() >>> 16;
		
		System.out.println(hola.hashCode());
		System.out.println((hola.hashCode() >>> 16));
		System.out.println(hola.hashCode() ^ (h >>> 16));
		System.out.println(10 ^ 2);
		;

	}

}
