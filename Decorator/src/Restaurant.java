public class Restaurant {
	public static void main(String[] args){
		Beverage d = new DarkRoast();
		d = new Milk(d);
		System.out.println(d.cost());
	}

}
