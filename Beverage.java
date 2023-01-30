public abstract class Beverage {
	private description = "неизвестный напиток";

	public getDescription() {
		return description;
	}

	public abstract double cost();
}

