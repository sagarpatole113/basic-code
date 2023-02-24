public class HCF 
{ 
int n1=150, n2=60;  
void cal(){
while(n1!=n2)   
{  
if(n1>n2)  
n1=n1-n2;  
else  
n2=n2-n1;  
}  
}
void dis(){
    System.out.println("HCF of given number " + n1);
}
public static void main(String[] args) {
    HCF c = new HCF();
    c.cal();
    c.dis();
   }
}
