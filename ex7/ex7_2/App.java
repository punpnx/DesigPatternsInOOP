// Composite design pattern, root = CEO

public class App {
    public static void main(String[] args) {
        Department ceo = new Department("Settha", "CEO", 500000);
        Department kamphaka = new Department("Kamphaka", "Head Sales", 300000);
        Department wiroj = new Department("Wiroj", "Sales", 150000);
        Department weeranan = new Department("Weeranan", "Sales", 100000);
        Department ungInk = new Department("UngInk", "Head Marketing", 300000);
        Department oak = new Department("Oak", "Marketing", 200000);
        Department aem = new Department("Aem", "Marketing", 250000);

        kamphaka.addSubordinate(wiroj);
        kamphaka.addSubordinate(weeranan);
        ungInk.addSubordinate(oak);
        ungInk.addSubordinate(aem);
        ceo.addSubordinate(kamphaka);
        ceo.addSubordinate(ungInk);

        ceo.printAllEmployee();
    }
}
