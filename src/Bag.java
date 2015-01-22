import java.util.ArrayList;


public class Bag {
	private ArrayList<String> myArray;
	private static int calls;
	private static int runs;

	public Bag(int initialSize){
		calls = 0;
		runs = 0;
		myArray = new ArrayList<String>(initialSize);
	}

	public void add(String toAdd){
		int myCall = calls;
		calls++;
		while(myCall != runs){
			try{
				Thread.sleep(1);
			} catch (InterruptedException e){
				System.out.println("Sleep interrupted: " + e.getMessage());
			}
		}
		try{
			Thread.sleep((int)(Math.random() * 500));
		} catch (InterruptedException e){
			System.out.println("Sleep interrupted: " + e.getMessage());
		}
		myArray.add(toAdd);
		runs++;
	}

	public void remove(String toRemove){
		int myCall = calls;
		calls++;
		while(myCall != runs){
			try{
				Thread.sleep(1);
			} catch (InterruptedException e){
				System.out.println("Sleep interrupted: " + e.getMessage());
			}
		}
		try{
			Thread.sleep((int)(Math.random() * 500));
		} catch (InterruptedException e){
			System.out.println("Sleep interrupted: " + e.getMessage());
		}
		myArray.remove(toRemove);
		runs++;
	}

	public String get(int index){
		int myCall = calls;
		calls++;
		while(myCall != runs){
			try{
				Thread.sleep(1);
			} catch (InterruptedException e){
				System.out.println("Sleep interrupted: " + e.getMessage());
			}
		}
		runs++;
		return myArray.get(index);
	}

	public String[] getAll(){
		int myCall = calls;
		calls++;
		while(myCall != runs){
			try{
				Thread.sleep(1);
			} catch (InterruptedException e){
				System.out.println("Sleep interrupted: " + e.getMessage());
			}
		}
		runs++;
		return myArray.toArray(new String[1]);
	}
}
