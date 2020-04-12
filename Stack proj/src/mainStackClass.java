
public class mainStackClass {
	public static void main(String[] args) {
		StackDS stack = new StackDS(10);
		stack.push(12);
		stack.push(23);
		stack.push(57);
		stack.push(89);
		stack.push(900);
		stack.push(200);
		stack.push(902); //most resent data or item
		// print data
		while (!stack.isEmpty()) {
			long value = stack.pop();
			System.out.println(value);
		}
	}
}
