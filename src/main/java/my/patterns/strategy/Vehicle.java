package my.patterns.strategy;

public class Vehicle {
	private GoAlgorithm goAlgorithm;
	
	public void go(){
		goAlgorithm.go();
	}

	public void setGoAlgorithm(GoAlgorithm goAlgorithm) {
		this.goAlgorithm = goAlgorithm;
	}
	
}
