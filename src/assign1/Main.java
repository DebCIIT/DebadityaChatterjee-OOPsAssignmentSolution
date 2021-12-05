	package assign1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Admin_Department admin = new Admin_Department();
		Hr_Department hr = new Hr_Department();
		Tech_Department tech = new Tech_Department();
		
		System.out.println("Welcome to " + admin.departmentName() + "." );
		System.out.println("Todays Work: " + admin.getTodaysWork());
        System.out.println("Work Deadline: " + admin.getWorkDeadline());
        System.out.println(admin.isTodayAHoliday());
        System.out.println();
        
        System.out.println("Welcome to " + hr.departmentName() + ".");
        System.out.println("Activity: " + hr.doActivity());
        System.out.println("Todays Work: " + hr.getTodaysWork());
        System.out.println("Work Deadline: " + hr.getWorkDeadline());
        System.out.println(hr.isTodayAHoliday());
        System.out.println();
        
        System.out.println("Welcome to " + tech.departmentName() + ".");
        System.out.println("Todays Work: " + tech.getTodaysWork());
        System.out.println("Work Deadline: " + tech.getWorkDeadline());
        System.out.println("Tech Stack Information: " + tech.getTechStackInformation());
        System.out.println(tech.isTodayAHoliday());
        System.out.println();
	}

}
