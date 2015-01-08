package assochistorica;

public class AssocHistorica {

	public static void main(String[] args) {

		Empleat Toni = new Empleat("Toni");
		Empleat Ross = new Empleat("Ross");
		Diners dosK = new Diners(2500.0, "€");
		Diners dosK1 = new Diners(3100.0, "€");
		Diners dosK2 = new Diners(2000.0, "€");
		Diners dosK3 = new Diners(5500.0, "€");
		Data d1 = new Data("031006");
		Data d2 = new Data("010109");
		Data d3 = new Data("010110");

		Sou sou = new Sou(Toni, dosK, d1);
		Toni.afegirNouSou(sou);
		sou = new Sou(Toni, dosK, d2);
		Toni.afegirNouSou(sou);
		sou = new Sou(Toni, dosK1, d3);
		Toni.afegirNouSou(sou);

		Sou sou2 = new Sou(Ross, dosK2, d1);
		Ross.afegirNouSou(sou2);
		sou2 = new Sou(Ross, dosK3, d2);
		Ross.afegirNouSou(sou2);
		sou2 = new Sou(Ross, dosK3, d3);
		Ross.afegirNouSou(sou2);

		Toni.printLlistatHistoric();

		Ross.printLlistatHistoric();

	}

}
