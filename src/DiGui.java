//递归程序入口
//1、写一个方法  2、从已知条件入手

public class DiGui {
	// 1 1 2 3 5 ...
	public static int fac(int n){
		if(n==1){
			return 1;
		}else if(n==2){
			return 1;
		}else{
			return fac(n-1)+fac(n-2);
		}
	}
	
	//1+2+3+4+5+...
	public static int sum(int n){
		if(n==1){
			return 1;
		}else{
			return sum(n)+n;
		}
	}
	
	//阶乘
	public static int jj(int n){
		if(n==1){
			return 1;
		}else{
			return jj(n)*n;
		}
	}
}
