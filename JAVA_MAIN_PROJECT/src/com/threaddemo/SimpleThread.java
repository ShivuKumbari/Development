package com.threaddemo;

class One extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {

			/*
			 * try { Thread.sleep(1); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
			/*
			 * try { Thread.currentThread().join(); } catch
			 * (InterruptedException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); }
			 */

			System.out.println("Thread : " + currentThread().getName() + " " + i);
		}
	}
}

class Two extends Thread {

	public void run() {
		for (int i = 90; i < 100; i++) {

			/*
			 * try { Thread.sleep(200); } catch (InterruptedException e) { //
			 * TODO Auto-generated catch block e.printStackTrace(); }
			 */

			System.out.println("Thread : " + currentThread().getName() + " " + i);
		}
	}
}

public class SimpleThread {
	public static void main(String[] args) throws InterruptedException {
		One one = new One();
		Two two = new Two();
		System.out.println("asdasd");
		Thread t = new Thread(one);
		t.setName("One");
		Thread t2 = new Thread(two);

		t2.setName("two");
		t.start();
		t2.join();
		t2.start();

	}
}
