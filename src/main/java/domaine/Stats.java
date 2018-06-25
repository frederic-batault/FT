package domaine;

public class Stats {

	private int n;
	
	private double pasT;
	
	private double rangeT;
	
	private double pasF;
	
	private double rangeF;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getPasT() {
		return pasT;
	}

	public void setPasT(double pasT) {
		this.pasT = pasT;
	}

	public double getRangeT() {
		return rangeT;
	}

	public void setRangeT(double rangeT) {
		this.rangeT = rangeT;
	}

	public double getPasF() {
		return pasF;
	}

	public void setPasF(double pasF) {
		this.pasF = pasF;
	}

	public double getRangeF() {
		return rangeF;
	}

	public void setRangeF(double rangeF) {
		this.rangeF = rangeF;
	}

	public Stats(int n, double pasT, double rangeT, double pasF, double rangeF) {
		super();
		this.n = n;
		this.pasT = pasT;
		this.rangeT = rangeT;
		this.pasF = pasF;
		this.rangeF = rangeF;
	}

	public Stats() {
		super();
	}
	
	
}
