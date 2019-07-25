import java.util.ArrayList;
import java.util.Scanner;

public class writeTask {
	
	ArrayList<String> arrTask = new ArrayList<String>();
	
	boolean askAgain = false;
	
	public void askTask() {
		tag tag = new tag();
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("What is your task?");
			String askTask = sc.nextLine();
			arrTask.add(askTask);
			
			
			System.out.println();
			System.out.println("do you want to add another task? \nif yes, press 1, otherwise press 0 please.");
			int askMore = sc.nextInt();
			
			
			if (askMore == 1) {
				askAgain = true;
			
			} 
			else if (askMore == 0) {
				askAgain = false;
				tag.taskTable(arrTask);
				
			};
			
			
		} while(askAgain);
		
	
		
}
	
	
	public ArrayList<String> getArrTask(){
		return arrTask;
	}
	
}
