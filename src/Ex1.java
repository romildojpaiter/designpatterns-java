import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex1 {	
	
	public static void main(String[] args) {		
//		int []i = {1, 2, 3};		
//		// int i = 3;
//		for (Integer j : i) {
//			System.out.println(j instanceof Object);	
//		}
		
		/*int a[] = { 1,2,053,4};
		int b[][] = { {1,2,4} , {2,2,1},{0,43,2} };
		
		System.out.print(a[3]==b[0][2] );
		System.out.println((a[2] + " " + b[2][1]));
		System.out.println(" " + (a[2]==b[2][1]));
		
		System.out.println(011);*/
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.println(sdf.parse("08/02/2017"));
			Date parse = sdf.parse("08/02/2017");
			System.out.println(parse.toString());
			System.out.println(parse.toString().equals("Wed Feb 08 00:00:00 AMST 2017"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(sdf.format(new Date()).equals("16/11/2016"));
	}

}
