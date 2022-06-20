package empwage;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("welcome to emplyoee wage");
		// TODO Auto-generated method stub
		int employeePresent = 1;
		int wagePerHour = 20;
		int numberOfHours = 8;
		int partTime = 4;
		int isPresent =(int) Math.floor(Math.random() * 10 )%3;
		if (isPresent == 0) {
			System.out.println("emplyoee is absent");
			System.out.println("emplyoee earn = 0");
			}
		else if (isPresent == employeePresent){
				System.out.println(" Emplyoee is present");
				System.out.println("emplyoee earn =" +numberOfHours*wagePerHour);			
				  }
		else 
		{
			
			System.out.println("emplyoee working as a part time");
		    System.out.println("emplyoee earn=" + partTime*numberOfHours);
		}
	}
	

}
