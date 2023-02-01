import java.util.*;




public class NewMain {
  
    
 
  
  
   public static void main(String args[]){

	   
	   Motherclass parent=new Motherclass();
	   parent.Menu();
   }
   }
class Motherclass{      

	
	
	
	
	public void Menu() {
		
		
		int code;
		String name,employee,type;
		Scanner sc=new Scanner(System.in);
		List<info> in=new ArrayList<info>();
		Iterator<info> mor=in.iterator();
int m=6;
		
		do {
            			System.out.println("Menu");

			System.out.println("1. Add");
			System.out.println("2. View Reocrd");
			System.out.println("3. Edit Reocrd");
			System.out.println("4. Delete Reocrd");
			System.out.println("5. Report Reocrd");
			System.out.println("6. Exit");
			System.out.print("Enter Your Choice : ");
	         m=sc.nextInt();
			
			
			switch(m) {
	
			case 1:  
				
				System.out.println("Enter Barcode : ");
				code=sc.nextInt();
				System.out.println("Enter Name Of the Device : ");
				name=sc.next();
				System.out.println("Enter Employee Name : ");
				employee=sc.next();
				System.out.println("Enter Peripheral Type  :");
				type=sc.next();
						
	      
	        info n=new info(code,name,employee,type);
	        in.add(n);
				
				break;
			case 2:
			
				System.out.println("---------------------------------------------------");
				
				mor=in.iterator();
				
				while(mor.hasNext()) {
					System.out.println(mor.next().Information());				}
				System.out.println("---------------------------------------------------");
				break;
			case 3:
				
				boolean b=false;
				
				 ListIterator<info> mak=in.listIterator();
				
				System.out.println("Enter The Bar Code :");
				code=sc.nextInt();
				while(mak.hasNext()) {
					info p=mak.next();
					if(p.Code()==code) {
						
						System.out.println("Enter Barcode : ");
						code=sc.nextInt();
						System.out.println("Enter Name Of the Device : ");
						name=sc.next();
						System.out.println("Enter Employee Name : ");
						employee=sc.next();
						System.out.println("Enter Type Of Peripheral :");
						type=sc.next();
						
						mak.set(new info(code,name,employee,type));
						b=true;
						
if(!b) {						
	System.out.println("Not Found, Try Again");
}else {
	System.out.println("Success Nice One");
}
						
						
					}
				}
				
				
				
				
				
				break;
				
			case 4:
				
				mor=in.iterator();
				System.out.println("Enter The Code To Delete : ");
				code=sc.nextInt();
				 bol=false;
				while(mor.hasNext()) {
					info tt=mor.next();
					if(tt.Code()==code) {
						mor.remove();
						bol=true;
					}
				}
			
				
				if(!bol) {
					System.out.println("The Code Didn't Match, Please Try Again!!!!");
				}else {
					System.out.println("It is Deleted Successfuly!!!!!!!!!!");
				}
				
				break;
				
			case 5:
				
				while(mor.hasNext()) {
					System.out.println(mor.next().Information());
				}
				break;
				
			case 6:
				System.out.println("===========================================");
				System.out.println("Thank You Very Much!!!");
				System.out.println("===========================================");
				break;
			
			}
		}while(m!=6);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
class info{
	int code;
	String name,employee,type;
	
	
	info(int code,String name,String employee,String type){
		this.code=code;
		this.name=name;
		this.employee=employee;
		this.type=type;
	}
	
	public String Information() {
		return "BAR CODE: "+code+" "+"NAME: "+name+" "+"EMPLOYEE NAME: "+employee+" "+"PERIPHERAL TYPE : "+type;
	}
	public int Code() {
		return code;
	}
}