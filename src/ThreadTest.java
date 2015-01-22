
public class ThreadTest {

	public static void main(String[] args) {
		Bag b = new Bag(10);
		PrinterThread first = new PrinterThread("firstthread", b);
		PrinterThread second = new PrinterThread("secondthread", b);
		PrinterThread third = new PrinterThread("thirdthread", b);
		first.start();
		try{
			Thread.sleep(10);
		} catch (InterruptedException e){
			System.out.println("Sleep interrupted: " + e.getMessage());
		}
		second.start();
		try{
			Thread.sleep(10);
		} catch (InterruptedException e){
			System.out.println("Sleep interrupted: " + e.getMessage());
		}
		third.start();
	}
}
