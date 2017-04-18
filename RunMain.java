
public class RunMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Integer[] testArray = {23, 25, 12, 42, 35};  
		 //冒泡排序
		 ArithmeticProcess.getInstall().sort1(testArray);
		 for(Integer num:testArray){
			 System.out.println(num);
		 }
	}

}
