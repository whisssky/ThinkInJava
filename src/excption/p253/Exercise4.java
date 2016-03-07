package excption.p253;

public class Exercise4 {
	public static void main(String[] args) {
		try {
			throw new MyException("产生异常");
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println("捕获异常");
			e.ShowMsg();
			e.printStackTrace();
		}
	}
}

class MyException extends Exception{
	private String msg;
	public MyException(){}
	public MyException(String msg){
		super(msg);
		this.msg = msg;
	}
	public void ShowMsg(){
		System.out.println("错误信息是"+msg);
	}
	
	
}
