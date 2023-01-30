public class Mocha extends CondimentDecorator {
Bevarge bevarge;

public Mocha(Bevarge bevarge) {
	this.bevarge = bevarge;
}
public String getDescription() {
	return bevarge.getDescription() + ", Mocha";
} 
public double cost() {
	return .20 + bevarge.cost();
}
	}