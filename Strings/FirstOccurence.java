import java.util.*;
public class FirstOccurence {
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s= sc.nextLine();
		int len= s.length();
		System.out.println("Enter the character to be searched ");
		String userinput = sc.nextLine();
		System.out.println("Enter the character to replace ");
		String replace= sc.nextLine();
		if(s.contains(userinput)) {
			System.out.println(input.replaceFirst(userinput,replace));
		}else {
			System.out.println("Character not found");
		}
	}
}
