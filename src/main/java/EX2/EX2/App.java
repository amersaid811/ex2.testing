package EX2.EX2;

/**
 * Hello world!
 *
 */
public class App 
{
	public static String Grades(int grade) {
		if ((grade>0 ) & (grade<50)) 
			return "F";
		if ((grade>49 ) & (grade<60))
			return "E";
		if ((grade>59 ) & (grade<70))
			return "D";
		if ((grade>69 ) & (grade<80))
			return "C";
		if ((grade>79 ) & (grade<90))
			return "B";
		if ((grade>89 ) & (grade<=100))
			return "A";
		else {
			return "ERROR 404 ERROR";
		}
	}
}
