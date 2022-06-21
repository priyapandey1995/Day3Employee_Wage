package empwage;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("welcome to emplyoee wage");
		// TODO Auto-generated method stub
		int employeePresent = 1;
		int wagePerHour = 20;
		int empHours = 8;
		int partTime = 4;
		int isPresent =(int) Math.floor(Math.random() * 10 )%3;
		switch (isPresent)
		{
			case 0:
				System.out.println("Emplyoee is absent");
				break;
			
			case 1:
				System.out.println("Emplyoee is present");
				empHours=8;
				break;
			
			case 2:
				System.out.println("Emplyoee is working as part-Time");
				partTime=4
				break;
			
			default:
				System.out.println("invalid entry");
				break;
		}
		}
	

}
