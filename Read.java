package HW3_Nadav_Shaoulian;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read implements Runnable {

	private String str;
	private String fileName;
	private TotalRead tr;
	int sum = 0;

	public Read(String str, String fileName, TotalRead total) {
		this.str = str;
		this.fileName = fileName;
		this.tr = total;
	}


	@Override
	public void run() {
		tr.update(numOfSearchWordAppear());
	}
//count the sum of the exact word
	public int numOfSearchWordAppear() {
		try {
			File f = new File(this.fileName);
			Scanner s = new Scanner(f);
			String tmp = "";
			while (s.hasNext()) {
				tmp = s.next();
				if (tmp.toLowerCase().compareTo(this.str.toLowerCase()) == 0)
					this.sum++;
			}
			System.out.printf("Word '%s' appears in %s %d times\n", str, this.fileName, this.sum);
			s.close();
		} catch (FileNotFoundException e) {
			System.out.printf("Error occurred.  Error is: %s " + "(The system cannot find the file specified)\n",
					this.fileName);
			return -1;
		}
		return sum;
	}

}
