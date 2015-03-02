
public class Ex06_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		double array[][] = {{3,4},{10,10},{2.5,8.5}};
		double triangle;

		for(int i = 0; i < array.length; i++){
			triangle = array[i][0] * array[i][1] / 2.0;
			System.out.println((i + 1) + "．" + triangle + "(cm^2)");
		}

	}

}
