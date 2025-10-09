public class MySwingMVCApp {
	public static void main(String[] args) {
		Model m = new Model("Sylvain", "Saurel");
		View v = new View("MVC with SSaurel");
		Controller c = new Controller(m, v);
		c.initController();

		String productFile = "products.txt";
		CashRegister cashRegister = new CashRegister(productFile);


		c.setCashRegister(cashRegister, v);
		Scanner scanner = new Scanner(c);

		System.out.println("Application started!");
	}
}