package assochistorica;

public class Sou {

	public Empleat myEmpleat;
	public Data myData;
	public Diners myDiners;

	public Sou(Empleat myEmpleat, Diners myDiners, Data myData) {
		this.myEmpleat = myEmpleat;
		this.myData = myData;
		this.myDiners = myDiners;
	}

	public String toString() {
		return this.myEmpleat + ": " + this.myDiners + " - " + this.myData;

	}
}
