// 23. write a java program to print fibonacci number serier upto a given number 
     //EXAMPLE:- 0 1 1 2 3 5 8 13
	 
	 class Twentythree{
		 public static void main(String []k){
			 int N=7;
			 int X=0;
			 int Y=1;
			 int Z;
			 System.out.println(X);
			 System.out.println(Y);
			 for(int i=1;i<=N;i++){
				 Z=X+Y;
				 System.out.println(Z);
				 X=Y;
				 Y=Z;
			 }
		 }
	 }
	 
				 
			 
		 