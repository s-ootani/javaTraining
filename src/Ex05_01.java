
public class Ex05_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int i;
		for(i = 0; i < 5; i++){
			System.out.println("i = " + i);
			switch (i){
			case 0:
				System.out.println("おはようございます");
				break;
			case 1:
				System.out.println("こんにちは");
			case 2:
				System.out.println("こんばんわ");
				break;
			case 3:
			case 4:
				break;
			default:
				break;
			}

		}

	}

}
