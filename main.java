import java.util.*;

class Student{
	String usn;
	String name;
	int cred[] = new int[4];
	int marks[] = new int[4];
	int cred_gained[] = new int[4];
	

	Student(String usn,String name,int cred[],int marks[]){
		this.usn=usn;
		this.name=name;
		this.cred=cred;
		this.marks=marks;
	}

	static char getGrade(int marks){
		//char grade = new char[4];
		if(marks>=90)
			return 'S';
		if(marks>=80)
			return 'A';
		if(marks>=70)
			return 'B';
		if(marks>=60)
			return 'C';
		if(marks>=50)
			return 'D';
		if(marks>=40)
			return 'E';
		else
			return 'F';
	}

	static float getSGPA(int tot, int gained){
		return (float)(tot/gained)*10;
	}

	static int getcred(char symbol){
		if(symbol=='S')
			return 10;
		if(symbol=='A')
			return 9;
		if(symbol=='B')
			return 8;
		if(symbol=='C')
			return 7;
		if(symbol=='D')
			return 6;
		if(symbol=='E')
			return 4;
		else
			return 0;
	}

	
}

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String usn; String name;
		int cred[] = new int[4];
		int cred_gained[] =new int[4];
		int marks[] = new int[4];
		char grade[] = new char[4];
		int sub,tot_cred=0,gained=0;
		System.out.println("How many subjects are there?");
		sub = sc.nextInt();
		System.out.println("Enter student details:\n");
		System.out.println("Name:");
		name = sc.next();
		System.out.println("USN:");
		usn = sc.next();
		for(int i=0;i<sub;i++){
			System.out.println("Marks in subject "+(i+1));
			marks[i] = sc.nextInt();
			System.out.println("Credits for subject "+(i+1));
			cred[i] = sc.nextInt();
		}

		Student mystu = new Student(usn,name,cred,marks);
		
		for(int i=0;i<sub;i++){
			grade[i] = Student.getGrade(marks[i]);
			tot_cred=tot_cred+cred[i];
			cred_gained[i] = Student.getcred(grade[i]);
			gained = gained+cred_gained[i];
		}
		
		System.out.println(grade);
		System.out.println("\n"+ Student.getSGPA(tot_cred,gained));
		
	}
}
