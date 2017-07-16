package guvi;
import java.util.Scanner;
public class Coprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
int b;
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
int max;
if(a>b){
	max=a;
}
else{
	max=b;
}
int count=0;
for(int i=2;i<=max;i++){
	if(a%i==0 && b%i==0){
		count++;
	}
	if(count==0){
		System.out.println("the number is coprime");
	}else
	{
		System.out.println("the number is not a prime");
	}
}

	}

}
