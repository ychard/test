//冒泡排序
public class MaoPaoSort 
{
	//打印数组
	static void printArray(int[] arr)
	{
		System.out.print("[");
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("]");
	}
	//交换数组中的元素
	static void swap(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}	
	//将数组进行升序排列
	static void p(int[] arr)
	{
		for(int j=1;j<=arr.length-1;j++)//数组长度 n-1 轮比较
		{
			for(int i=1;i<=arr.length-j;i++)
			{
				if(arr[i-1]>arr[i])
				{
					//交换顺序
					swap(arr,i-1,i);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int[] nums=new int[]{2,5,1,6,3};
		MaoPaoSort.printArray(nums);//打印没排序之前的数组
		MaoPaoSort.p(nums);
		MaoPaoSort.printArray(nums);
	}
}





