package domaine;

public class PointF {

	private double f;
	
	private double yRe;
	
	private double yIm;
	
	private double yMod;

	public double getF() {
		return f;
	}

	public void setF(double f) {
		this.f = f;
	}

	public double getyRe() {
		return yRe;
	}

	public void setyRe(double yRe) {
		this.yRe = yRe;
	}

	public double getyIm() {
		return yIm;
	}

	public void setyIm(double yIm) {
		this.yIm = yIm;
	}

	public double getyMod() {
		return yMod;
	}

	public void setyMod(double yMod) {
		this.yMod = yMod;
	}

	public PointF(double f, double yRe, double yIm, double yMod) {
		super();
		this.f = f;
		this.yRe = yRe;
		this.yIm = yIm;
		this.yMod = yMod;
	}

	public PointF() {
		super();
	}

	
	
}
