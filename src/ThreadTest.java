
public class ThreadTest {

	public static void main(String[] args) {
		PrinterThread first = new PrinterThread("first thread");
		first.start();
	}
}
