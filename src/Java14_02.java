
public class Java14_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		TestRun tr1 = new TestRun("スレッド(Run)1");
		TestRun tr2 = new TestRun("スレッド(Run)2");

		Thread t1 = new Thread(tr1);
		Thread t2 = new Thread(tr2);

		t1.start();
		t2.start();

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

class TestRun implements Runnable {

	private String name;

	TestRun(String name) {
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