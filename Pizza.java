package HW3_Nadav_Shaoulian;


public abstract  class Pizza implements Product{
	
	public String name;
	public int calories;
	
	public Pizza(String name, int calories) {
		this.name = name;
		this.calories = calories;
	}
//gives you pizza`s name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	
	
}
