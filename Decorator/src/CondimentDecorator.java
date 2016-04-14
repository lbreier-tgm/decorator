
public abstract class CondimentDecorator extends Beverage {
	protected Beverage meinGetraenk;

	public CondimentDecorator(Beverage b){
		this.meinGetraenk = b;
	}
}
