package excption.p253;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a = null;
		try {
			Integer b = a+1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("捕获异常");
			e.printStackTrace();
		}
		
		

	}


}
