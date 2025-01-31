package srctest;

public class Consumer extends Thread {

	private Company c;

	Consumer(Company c) {
		this.c = c;
	}

	public void run() {
		while (true) {
			try {
				this.c.consume_item();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
