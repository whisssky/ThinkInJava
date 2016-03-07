package excption.p253;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[3];
		int i=8;
		while(true)
		{
			try {
				a[i] = 5;
				System.out.println("a是"+a[i]);
				break;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("发生错误！");
				i--;
				e.printStackTrace(System.out);
			}
			finally{
				System.out.println("是否排除？");
			}
		}
		System.out.println("成功排除！");
	}

}
