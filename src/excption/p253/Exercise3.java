package excption.p253;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		try {
			a[11] = 4;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("越界");
			e.printStackTrace();
		}

	}

}
