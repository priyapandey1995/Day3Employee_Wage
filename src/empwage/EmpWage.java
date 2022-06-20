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
		switch (isPresent)
		{
			case 0:
				System.out.println("Emplyoee is absent");
				System.out.println("Emplyoee wage is 0");
				break;
			
			case 1:
				System.out.println("Emplyoee is present");
				System.out.println("Emplyoee Salary is" +wagePerHour*numberOfHours);
				break;
			
			case 2:
				System.out.println("Emplyoee is working as part-Time");
				System.out.println("Working hour is" + partTime*wagePerHour);
				break;
			
			default:
				System.out.println("invalid entry");
				break;
		}
		}
	

}
