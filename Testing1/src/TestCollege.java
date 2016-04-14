
public class TestCollege {

	public static void main(String[] args){
		System.out.println(College.Collegename + " College student details.");
		
		College compdep = new Computer();
		compdep.StudentDetails();
		compdep.StudentResult();
		
		College mechdep = new Mechanical();
		mechdep.StudentDetails();
		mechdep.StudentResult();
	}
}
