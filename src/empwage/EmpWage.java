package empwage;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("welcome to emplyoee wage");
		// TODO Auto-generated method stub
		int employeePresent = 1;
		int wagePerHour = 20;
		int numberOfHours = 8; 
		int isPresent =(int) Math.floor(Math.random() * 10 )%2;
		if (isPresent == employeePresent) {
			System.out.println("emplyoee is presennt");
			System.out.println("emplyoee earn =" +numberOfHours*wagePerHour);
			}else {
				System.out.println("not present");
				System.out.println("emplyoee earn = 0");			
	}
	}
	

}
