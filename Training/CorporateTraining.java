//class CorporateTraining inherits class Training
public class CorporateTraining extends Training {
	private int days;
	private int cost;

	// constructor
	public CorporateTraining(int id, String subject, int fees, int days) {
		super(id, subject, fees);
		this.days = days;
	}

	// getter methods
	public void getOrderValue() {
		this.cost = getFees() * days;
	}

	public int getCost() {
		return cost;
	}

}
