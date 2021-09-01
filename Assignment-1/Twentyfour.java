// 24. write a program to check a given number is Armstrong number or not.
 
 class Twentyfour{
	 public static void main(String[] k){
		 int n=153,temp,Armstrong=0;
		 int original=n;
		 while(n>0){
		  temp=n%10;
		  temp=temp*temp*temp;
		  Armstrong=Armstrong+temp;
		  n=n/10;
		 }
		  if(Armstrong==original){
			  System.out.println("given number is armstrong number ");
		  }
		  else{
			  System.out.println("given number is not armstrong number ");
		  }
		 
	 }
 }
		 