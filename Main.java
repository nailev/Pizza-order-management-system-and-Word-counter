//author : Nadav Shaoulian
// ID : 311235584

package HW3_Nadav_Shaoulian;


import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Q1();//starts question number one
		Q2();//starts question number two
	}

	public static void Q1() {
		Scanner s = new Scanner(System.in);
		System.out.println("Question 1:\n");
		System.out.println("Enter the searched word:");
		String searchWord = s.next();
		String temp;
		int n = 0;
		boolean ifGood = false;
		while (!ifGood) {
			try {
				System.out.println("Enter number of articles:");
				temp = s.next();
				n = Integer.parseInt(temp);
				if (n < 0) {
					System.out.println("Number must be greater then 0! try again!");
				} else {
					ifGood = true;
				}
			} catch (Exception e) {
				System.out.println("Number must be and Integer! try again!");
			}
		}
		TotalRead tr = new TotalRead(searchWord, n);
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter name of article no %d:\n", i);
			tr.addFileName(s.next(), i);
		}
		s.close();
		tr.start();
		tr.printTotalSum();
		System.out.println("\n------------ Finished Question 1 ------------\n");
	}

	public static void Q2() {
		System.out.println("Ouestion 2:\n");
		Product personalPizza = new PersonalPizza("Personal Pizza", 20);
		Product familyPizza = new FamilyPizza("Family Pizza", 40);
		Product hugePizza = new HugePizza("Huge Pizza", 80);
		Product personalWithTomatoesBulgarit = new TomatoesPizza(
				new BulgaritChessePizza
				(new PersonalPizza("Personal", 35)));
		Product familyWithMushroomsTomatoes = new MushroomsPizza
				(new TomatoesPizza(new FamilyPizza("Familiy", 65)));
		Product hugeWithOlivesMushrooms = new OlivesPizza
				(new MushroomsPizza(new HugePizza("Huge", 100)));
		System.out.printf("%s : %.1f\n", ((PersonalPizza) personalPizza).getName(),
				((PersonalPizza) personalPizza).getTotal());
		System.out.printf("%s : %.1f\n", ((FamilyPizza) familyPizza).getName(), ((FamilyPizza) familyPizza).getTotal());
		System.out.printf("%s : %.1f\n", ((HugePizza) hugePizza).getName(), ((HugePizza) hugePizza).getTotal());
		System.out.println("Personal Pizza With Tomatoes and Bulgarit: " + personalWithTomatoesBulgarit.getTotal());
		System.out.println("Familiy Pizza With Mushrooms and Tomatoes: " + familyWithMushroomsTomatoes.getTotal());
		System.out.println("Huge Pizza With Olives and Mushrooms: " + hugeWithOlivesMushrooms.getTotal());
	}

}

