
public class Ex06_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		mark:
		for(int i = 2; i <= 100; i++){
			if(i == 2 || i == 3){
				System.out.print(i + " ");
				continue;
			}
			if(i % 2 == 0){
				continue;
			}

			for(int j = 2; j <= i / 2; j++){
				if(i % j == 0){
					continue mark;
				}
			}
				System.out.print(i + " ");
		}
	}

}
