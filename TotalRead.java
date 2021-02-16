package HW3_Nadav_Shaoulian;

public class TotalRead extends Thread {

	private String strToSearch;
	private String[] fileNames;
	private Thread[] threads;
	private int totalSum = 0;
	private int counter;

	public TotalRead(String strToSearch, int size) {
		this.threads = new Thread[size];
		this.fileNames = new String[size];
		this.strToSearch = strToSearch;
		this.counter = size;
	}
//add file name to array
	public void addFileName(String fileName, int place) {
		this.fileNames[place] = fileName;
	}

	public int getTotalSum() {
		return totalSum;
	}

	@Override
	public void run() {
//makes the threads one by one by the order input
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new Read(strToSearch, fileNames[i], this));
			threads[i].start();
		}

	}
//updates all sums
	public synchronized void update(int countInFile) {
		if (countInFile != -1)
			this.totalSum += countInFile;
		this.counter--;
		notifyAll();
	}
//print total sum only after every threads finish
	public synchronized void printTotalSum() {

		while (counter > 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				System.out.println("Print Board Exception: " + e.getMessage());
			}
		}
		System.out.println(this);
	}

	@Override
	public String toString() {
		String str = "Total number of times the word '" + strToSearch + "' appears in articles is " + totalSum;
		return str;
	}

}
