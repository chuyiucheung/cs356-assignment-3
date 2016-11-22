package TrainStateDemo.Before;

import java.util.Scanner;

public class DemoDriver {
	
	public static void main(String[] args)
    {
        boolean end = false;
		TrainOp train = new TrainOp();
		 System.out.println("**TrainStateDemo - Before applying State Pattern**");
        while (!end)
        {
            System.out.println(train.getStation());
            System.out.print("Which direction do you want to go? n-north s-south q-quit (n/s/q): ");
            Scanner sc = new Scanner(System.in);
       
            while (!sc.hasNext("[nNsSqQ]")) {
            	System.out.print("Invalid direction. Please enter n, s, or q: ");
            }
            
            String dir = sc.nextLine();
            if (dir.equals("n") || dir.equals("N")) {
            	train.goNorth();
            } else if (dir.equals("s") || dir.equals("S")){
            	train.goSouth();
            } else {
            	end = true;
            }

        }
        
        System.out.println("Thank you for choosing West Coast Train Line.");
    }
}