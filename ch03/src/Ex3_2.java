
public class Ex3_2 {

	public static void main(String[] args) {
		int i = 5, j = 0;

		// 후위형
		// j = i++;
		j = i;
		i++;
		System.out.println("j = i++; 실행 후, i=" + i + ", j=" + j);

		i = 5;
		j = 0;
		// 전위형
		// j = ++i;
		++i;
		j = i;
		System.out.println("j = ++i; 실행 후, i=" + i + ", j=" + j);

	}

}
