public class Java14_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		TestThread tt1 = new TestThread("スレッド1");
		TestThread tt2 = new TestThread("スレッド2");

		tt1.start();
		tt2.start();

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("メイン実行中");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			System.out.println("メイン終了");
		}
	}
}

class TestThread extends Thread {

	private String name;

	TestThread(String name) {
		this.name = name;
	}

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(name + "実行中");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			System.out.println(name + "終了");
		}
	}
}
