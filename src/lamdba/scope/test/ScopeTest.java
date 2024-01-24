package lamdba.scope.test;


public class ScopeTest {
	

	public static void main(String[] args) {
		ScopeTest test = new ScopeTest();
		Printer lambdaPrinter = test.getLambdaPrinter();
		Printer lambdaAnonymousPrinter = test.getAnonyMousLambdaPrinter();
		
		lambdaPrinter.print("Lambda expresion");
		lambdaAnonymousPrinter.print("Anonymous class");

	}
	
	public Printer getLambdaPrinter() {
		System.out.println(this.getClass());
		
		return msg -> {
			System.out.println(msg +":" + this.getClass());
		} ;
	}
	
	
	public Printer getAnonyMousLambdaPrinter() {
		System.out.println(this.getClass());
		
		return  new Printer() {
			public void print(String msg) {
				System.out.println(msg +":" + this.getClass());
			}
		};
	}

}
