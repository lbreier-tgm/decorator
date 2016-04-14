
public class Milk extends CondimentDecorator {

	public Milk(Beverage b) {
		super(b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return meinGetraenk.cost() + 0.20;
	}
	
	public String getDesription(){
		return meinGetraenk.getDescription() + "mit Milch";
	}

}
