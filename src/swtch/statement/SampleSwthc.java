package swtch.statement;

public class SampleSwthc {

	public static String process(Object message) {
		if (message instanceof Integer) {
            return "got a number";
        } else if (message instanceof String) {
            return "got a string";
        } else {
            return "whatever";
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(process(1));
		System.out.println(process("hello"));

	}

}
