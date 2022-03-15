import java.util.*;
class stack{
	static final int size =10;
	int tos;
	int stk[] = new int[size];

	stack(){
		tos=-1;
	}

	void push(int ele){
		if(tos==size-1){
			System.out.println("Overflow");
			return;
		}
		tos+=1;
		stk[tos]=ele;
	}
	
	int pop(){
		if(tos==-1){
			System.out.println("Underflow");
			return -1;
		}
		return stk[tos--];
	}

	void display(int n){
		if(tos==size-1){
			System.out.println("No elements, stack is empty");
			return;
		}
		System.out.println("Elements of stack are");
		for(tos=0;tos<n;tos++)
			System.out.println(stk[tos]);
	}
}

class stk_oprn{
	public static void main(String args[]){
		stack s1 = new stack();
		int n,i,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements to push:");
		n=sc.nextInt();
		
		System.out.println("Enter the element to push");
		for(i=0;i<n;i++){
		if(n==10)
			break;
		k=sc.nextInt();
		s1.push(k);
		}
		
		s1.display(n);

		for(i=0;i<n;i++)
			System.out.println(s1.pop());
	}
}
