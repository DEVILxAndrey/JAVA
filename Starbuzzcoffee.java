
public class Starbuzzcoffee {

	 public static void main(String[] argv) {
		
		Beverage coffee1 = new Houseblend();
		System.out.println(coffee1.getDescription() + "$" +
		coffee1.cost() + "руб.");
		System.out.println("---------------------\n");

		Beverage coffee2 = new Decaf();
		coffee2 = new Mocha(coffee2);
		coffee2 = new Mocha(coffee2);
		coffee2 = new Milk(coffee2);
		System.out.println(coffee2.getDescription() + "$" +
		coffee2.cost() + "руб.");
		System.out.println("---------------------\n");    
	}
}

		Beverage Coffee3 = new DarkRpast();
		beverage3 = new  Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new whip(beverage3);
		System.out.println(beverage3.getDescription() + "$" +
		Coffee3.cost() + "руб."); 	
		System.out.println("---------------------\n");	