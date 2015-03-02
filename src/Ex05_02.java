
public class Ex05_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		for(int i = 0; i < 10; i++){
			if(i == 2 || i == 5 || i == 7){
				continue;
			}
			System.out.println("i = " + i);
			if(i == 8){
				break;
			}
		}
	}

}
