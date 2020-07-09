package one;

import java.util.ArrayList;
import java.util.Scanner;

import java.io.*;

public class new1 {
	int order_id;
	String customer_name;
	String order_time;
	String food_type;
	int quantity;

	public new1(int id, String name, int Qty, String time, String food_type) {
		this.order_id = id;
		this.customer_name = name;
		this.food_type = food_type;
		this.order_time = time;
		this.quantity = Qty;

	}

	@Override
	public String toString() {
		return "new1 [order_id=" + order_id + ", customer_name=" + customer_name + ", order_time=" + order_time
				+ ", food_type=" + food_type + ", quantity=" + quantity + "]";
	}

	static void reviewfun() {
		try {
			FileWriter RW = new FileWriter(
					"C:\\Users\\Ahsan Tahseen\\Desktop\\University Tasks\\Filing task\\reviews.txt", true);
			System.out.println("Write your review");
			Scanner rs = new Scanner(System.in);
			RW.append("\r\n" + rs.nextLine());
			RW.close();

		} catch (Exception e) {
			e.getMessage();
		}
	}

	static void vieworders() {
		try {
			File order_obj = new File("C:\\Users\\Ahsan Tahseen\\Desktop\\University Tasks\\Filing task\\orders.txt");
			Scanner reader = new Scanner(order_obj);
			while (reader.hasNextLine()) {
				System.out.println(reader.nextLine());
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

	static int counter;

	static void countorders() {
		try {
			int counter = 0;
			File count_order_obj = new File(
					"C:\\Users\\Ahsan Tahseen\\Desktop\\University Tasks\\Filing task\\orders.txt");
			Scanner reader1 = new Scanner(count_order_obj);
			while (reader1.hasNext()) {
				counter++;
				reader1.nextLine();
			}
			System.out.println("THERE ARE " + counter + "ORDERS");
		} catch (Exception e) {
			e.getMessage();
		}
	}

	static void view_chineesefood() {
		File file = new File("C:\\Users\\Ahsan Tahseen\\Desktop\\University Tasks\\Filing task\\orders.txt");
		Scanner in = null;
		try {
			in = new Scanner(file);
			while (in.hasNext()) {
				String line = in.nextLine();
				if (line.contains("chineese"))
					System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	static void readreviews() {
		try {
			File order_obj = new File("C:\\Users\\Ahsan Tahseen\\Desktop\\University Tasks\\Filing task\\reviews.txt");
			Scanner reader = new Scanner(order_obj);
			while (reader.hasNextLine()) {
				System.out.println(reader.nextLine());
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

	static int orders;

	public static void main(String[] args) {
		char stopper = 'n';
		char second_stopper = 'n';
		char second_stoppera = 'n';
		char seconda_stopper = 'n';
		char secondb_stopper = 'n';
		char secondc_stopper = 'n';
		char secondd_stopper = 'n';
		char seconde_stopper = 'n';

		char first_stopper = 'n';
		char firsta_stopper = 'n';
		char third_stopper = 'n';
		Scanner sc = new Scanner(System.in);
		while (stopper != 'y') {
			System.out
					.println("WELCOME TO ONLINE FOOD DELIVERY SYSTEM" + "\n PRESS A FOR ADMIN OR PRESS C FOR CUSTOMER");
			char ans = sc.next().charAt(0);
			ArrayList<new1> orders_list = new ArrayList<new1>();
			if (ans == 'c') {
				while (first_stopper != 'y') {
					System.out.println("Press 1 for Order \n Press 2 for to give reviews \n");
					int input;
					input = sc.nextInt();
					if (input == 1) {
						while (second_stopper != 'y') {

							System.out.println("How many orders you want?");
							orders = sc.nextInt();
							for (int i = 0; i < orders; i++) {
								System.out.println("Write ID,NAME,QTY,TIME,TYPE");
								System.out.println("Enter Order ID:");
								int order_id = sc.nextInt();
								System.out.println("Enter Customer Name:");
								String cst_name = sc.next() + sc.nextLine();
								System.out.println("Enter Order Food type:");
								String food_type = sc.next() + sc.nextLine();
								System.out.println("Enter Order Qty:");
								int order_qty = sc.nextInt();
								System.out.println("Enter Order Time");
								String order_time = sc.next() + sc.nextLine();

								new1 n = new new1(order_id, cst_name,order_qty, order_time, food_type);
								orders_list.add(n);
							}
							for (new1 n : orders_list) {
								try {
									FileWriter FW = new FileWriter(
											"C:\\Users\\Ahsan Tahseen\\Desktop\\University Tasks\\Filing task\\orders.txt",
											true);

									FW.append("\r\n" + n.toString());
									FW.close();
								} catch (Exception e) {
									e.getMessage();
								}

							}
							System.out.println("WANT TO END THE ORDER MENU??");
							second_stopper = sc.next().charAt(0);

						}

					}

					else if (input == 2) {
						System.out.println("WELCOME TO THE REVIEW PANEL");
						while (second_stoppera != 'y') {
							reviewfun();
							System.out.println("WANT TO END THE REVIEW MENU??");
							second_stoppera = sc.next().charAt(0);

						}
					} else {
						System.out.println("Error Wrong Input");
						continue;
					}
					System.out.println("WANT TO END THE CUSTOMER MENU?");
					first_stopper = sc.next().charAt(0);

				}
			} else if (ans == 'a') {
				while (firsta_stopper != 'y') {
					System.out.println(
							"PRESS 1 TO VIEW ALL ORDERS \n PRESS 2 TO COUNT ALL ORDERS \n PRESS 3 TO VIEW RECORDS OF CHINESE FOOD \n Press 4 to Read Reviews");
					int input;
					input = sc.nextInt();
					if (input == 1) {
						vieworders();
						System.out.println("Do you want to exit this option?");
						seconda_stopper = sc.next().charAt(0);
					}

					else if (input == 2) {
						while (secondb_stopper != 'y') {
							countorders();
							System.out.println("Do you want to exit this option?");
							secondb_stopper = sc.next().charAt(0);
						}
					} else if (input == 3) {
						while (secondc_stopper != 'y') {
							view_chineesefood();
							System.out.println("Do you want to exit this option?");
							secondc_stopper = sc.next().charAt(0);
						}
					} else if (input == 4) {
						while (secondd_stopper != 'y') {
							readreviews();
							System.out.println("Do you want to exit this option?");
							secondd_stopper = sc.next().charAt(0);
						}
					} else {
						System.out.println("Wrong Option");
						continue;
					}

					System.out.println("Do you want to close Admin Panel?");
					firsta_stopper = sc.next().charAt(0);
				}
			} else {
				System.out.println("Wrong Char enter again");
				continue;
			}

			System.out.println("Do you want to end application?");
			stopper = sc.next().charAt(0);

		}
	}
}