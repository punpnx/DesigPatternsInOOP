public class App {
	public static void main(String[] args) {
		// เครื่องดื่มธรรมดาไม่ใส่อะไร
		Beverage plainBeverage = new PlainBeverage();
		System.out.println("You order " + plainBeverage.getDescription());
		System.out.println("The cost is " + plainBeverage.getCost());

		// เครื่องดื่ม พร้อมนมหนึ่งช้อน และนํ้าตาลสองก้อน
		Beverage decoratedBeverage = new SugarDecorator(new SugarDecorator(new MilkDecorator(plainBeverage)));
        System.out.println("You order " + decoratedBeverage.getDescription());
        System.out.println("The cost is " + decoratedBeverage.getCost());
	}
}
