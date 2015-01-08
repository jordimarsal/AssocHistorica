package assochistorica;

public class Diners {
	private Double q;
	private String symbol;

	public Diners(Double q, String symbol) {
		this.setQ(q);
		this.symbol = symbol;
	}

	public Double getQ() {
		return q;
	}

	private void setQ(Double q) {
		this.q = q;
	}

	public String toString() {
		return "" + q + " " + symbol;
	}

}
