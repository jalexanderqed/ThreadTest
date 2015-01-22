public class PrinterThread implements Runnable {
	private Thread t;
	private static Bag myBag;
	private String threadName;

	public void run() {
		System.out.println("Running " +  threadName );

		System.out.println(threadName + " adding this: " + threadName + "foo");
		myBag.add(threadName + "foo");
		System.out.println(threadName + " added this: " + threadName + "foo");
		
		System.out.println(threadName + " adding this: " + threadName + "bar");
		myBag.add(threadName + "bar");
		System.out.println(threadName + " added this: " + threadName + "bar");
		
		String[] strs = myBag.getAll();
		System.out.println("Current values in bag according to " + threadName + ":");
		for(int i = 0; i < strs.length; i++){
			System.out.println(strs[i]);
		}
		
		System.out.println(threadName + " removing this: " + threadName + "foo");
		myBag.remove(threadName + "foo");
		System.out.println(threadName + " removed this: " + threadName + "foo");
		
		strs = myBag.getAll();
		System.out.println("Current values in bag according to " + threadName + ":");
		for(int i = 0; i < strs.length; i++){
			System.out.println(strs[i]);
		}
		
		System.out.println("Thread " +  threadName + " exiting.");
	}

	public void start()
	{
		System.out.println("Starting " +  threadName );
		if(t == null)
		{
			t = new Thread (this, threadName);
			t.start();
		}
		else{
			t.start();
		}
	}

	public PrinterThread(String name, Bag b){
		threadName = name;
		myBag = b;
		System.out.println("Creating " +  threadName );
	}
}
