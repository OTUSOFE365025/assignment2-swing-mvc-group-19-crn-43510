// This window emulates the scanning of an item. Every time the buttom is pressed
// it will send a notification of a UPC code

import java.awt.BorderLayout;
import java.io.File;
import java.util.*;

import javax.swing.*;

public class Scanner {
	private JFrame frame;
	private JPanel scannerPanel;
	private JButton scanButton;
	private List<String> upc = new ArrayList<>();
	private Random r = new Random();
	private Controller c;

	public Scanner(Controller controller) {
		this.c = controller;
		load("products.txt");

		frame = new JFrame("Scanner");
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(100, 100);
		frame.setLocation(300, 50);
		frame.setVisible(true);

		scanButton = new JButton("Scan");
		scannerPanel = new JPanel();
		scannerPanel.add(scanButton);
		frame.getContentPane().add(scannerPanel);

		scanButton.addActionListener(e -> scanProd());
	}

	private void load(String filename) {
		try (java.util.Scanner sc = new java.util.Scanner(new File(filename))) {
			while (sc.hasNext()) {
				upc.add(sc.next());
				sc.next();
				sc.nextDouble();
			}
		} catch (Exception e) {
			System.out.println("Error loading UPCs: " + e.getMessage());
		}
	}

	private void scanProd() {
		if (upc.isEmpty()) return;
		String upc = this.upc.get(r.nextInt(this.upc.size()));
		System.out.println("Scanned: " + upc);
		c.handleScan(upc);
	}
}