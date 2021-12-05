package assign1;

public class Hr_Department extends Super_Department{

	public String departmentName() {
		return "HR Department";
				
	}
	
	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance.";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD.";
		
	}

 public String doActivity() {
	 return "Team Lunch.";
 }
}
