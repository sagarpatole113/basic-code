
import java.util.Scanner;

public class Employee {
   
    String emp_name; int emp_id;  float salary;  
        int total;  
      void input(){
         Scanner s = new Scanner(System.in);
         System.out.println("Enter Employee ID :");
         emp_id = s.nextInt();
         System.out.println("Enter Employee Name :");
         emp_name = s.next();
         System.out.println("Enter Employee Salary :");
         salary = s.nextInt();
     }
      void max(){
         System.out.println("Maximum salary employee name :"+emp_name);
     }
      void min(){
         System.out.println("Minimum salary employee name :"+emp_name);
     }
    
     public static void main(String[] args) {
         
      Employee e[] = new Employee[5];
      float salary[]=new float[5];
          int i;
         for ( i = 0; i < 5; i++) {
             e[i] = new Employee();
             e[i].input(); 
             salary[i]=e[i].salary;
         }
             float max=salary[0];
             float min=salary[0];
		float arr[]=new float[5];
		int j=0;
                int m=0;
		for(int k=0;k<i;k++)

		{
			if(max<salary[k])

			{
			       	max=salary[k];
                                arr[j]=max;
				j=k;
			}
                }
                float arr2[]=new float[5];
                        for(int n=0;n<i;n++)
		{
			if(min>salary[n])

			{
			       	min=salary[n];      
				arr[m]=max;
				m=n;
			}

		}
		e[j].max();
                e[m].min();
                 
	}
     }