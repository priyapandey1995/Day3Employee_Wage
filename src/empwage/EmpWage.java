package empwage;
public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage");
		// TODO Auto-generated method stub
		int employeePresent = 1;
		int employeePartTime = 2;
		int wagePerHour = 20;
		int numberOfHours = 8;
    emp_wage_calculation_limit_100hrs_in_a_month
		int numberOfHoursForPartTime = 4;
		int workingDayInAMonth = 20;
		int isPresent = (int) Math.floor(Math.random() * 3);
		switch (isPresent) {
		case 0:
			System.out.println("Employee is Present");
			System.out.println("Employee earn = " + numberOfHours * wagePerHour);
			int totalHourPerMonth = 1;
			while (totalHourPerMonth <= 100) {
				totalHourPerMonth++; }
				System.out.println("Employee earn in a month =" + totalHourPerMonth * wagePerHour);
			break;
		case 1:
			System.out.println("Employee is doing Part Time");
			System.out.println("Employee earn = " + numberOfHoursForPartTime * wagePerHour);
			System.out
					.println("Employee earn per Month =" + numberOfHoursForPartTime * wagePerHour * workingDayInAMonth);

			break;
		case 2:
			System.out.println("Employee is not Present");
			System.out.println("Employee earn = 0");
			System.out.println("Employee earn = 0");
			break;
		int partTime = 4;
		int isPresent =(int) Math.floor(Math.random() * 10 )%3;
		if (isPresent == 0) {
			System.out.println("emplyoee is absent");
			System.out.println("emplyoee earn = 0");
			}
		else if (isPresent == 1){
				System.out.println(" Emplyoee is present");
				System.out.println("emplyoee earn =" +numberOfHours*wagePerHour);			
				  }
		else 
		{
			
			System.out.println("emplyoee working as a part time");
		    System.out.println("emplyoee earn=" + partTime*numberOfHours);
 main
		}
	}
}