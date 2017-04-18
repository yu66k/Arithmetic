
public class ArithmeticProcess {
	private static ArithmeticProcess INSTALL=new ArithmeticProcess();
	private ArithmeticProcess(){
		
	}
	public static ArithmeticProcess getInstall(){
		return INSTALL;
	}
	//冒泡排序
	public void sort1(Integer array[]){
		for(int i=0;i<array.length;i++)
			for(int j=array.length-1;j>i;j--){
				if(array[j].compareTo(array[j-1])<0){
					Integer temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
	}
}
