package excption.p253;


public class Exercise1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			throw new Exception("发生异常");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("执行到catch");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("执行到finally");
		}

	}

}
