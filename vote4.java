import java.util.*;
import java.io.*;

class vote4 {
    // Method to authenticate the user
    int A() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE ID : ");
        String id = sc.nextLine();  // Read user ID
        System.out.print("ENTER THE PASSWORD : ");
        String password = sc.nextLine();  // Read user password
        
        File f1 = new File("Data.txt");
        String words[] = null;
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String s;
        String search = id + password;  // Combine ID and password for search
        int count = 0;
        
        // Read the file line by line
        while ((s = br.readLine()) != null) {
            words = s.split(" ");  // Split each line into words
            for (String word : words) {
                if (word.equals(search)) {  // Check if the word matches the search string
                    count++;
                }
            }
        }
        
        br.close();  // Close the BufferedReader
        return count;  // Return the count of matching entries
    }
        
    // Method to cast a vote
    void b() throws IOException {
        Scanner s1 = new Scanner(System.in);
        System.out.println("UIT:-1");
        System.out.println("UCER:-2");
        System.out.println("UCEM:-3");
        System.out.println("UIM:-4");
        System.out.println("UIP:-5");
        System.out.println("click the number for vote");
        int c = s1.nextInt();  // Read the user's choice
        
        // Handle the user's choice and write the vote to the corresponding file
        switch (c) {
            case 1:
                File f2 = new File("UIT.txt");
                FileWriter fw = new FileWriter(f2, true);
                fw.write("1\n");  // Write vote as a new line
                fw.close();
                break;
            case 2:
                File f3 = new File("UCER.txt");
                FileWriter fe = new FileWriter(f3, true);
                fe.write("1\n");  // Write vote as a new line
                fe.close();
                break;
            case 3:
                File f4 = new File("UCEM.txt");
                FileWriter fr = new FileWriter(f4, true);
                fr.write("1\n");  // Write vote as a new line
                fr.close();
                break;
            case 4:
                File f5 = new File("UIM.txt");
                FileWriter fa = new FileWriter(f5, true);
                fa.write("1\n");  // Write vote as a new line
                fa.close();
                break;
            case 5:
                File f6 = new File("UIP.txt");
                FileWriter ft = new FileWriter(f6, true);
                ft.write("1\n");  // Write vote as a new line
                ft.close();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                return;  // Exit the method if an invalid choice is made
        }
        
        // Confirm vote submission
        System.out.println("Thank you");
        System.out.println("Your vote successfully submitted.......");
    }
    
    // Main method
    public static void main(String asd[]) throws IOException {
        vote4 jk = new vote4();
        int z = jk.A();  // Authenticate the user
        if (z != 0) {
            System.out.println("-----WELCOME TO ONLINE VOTING-----");
            jk.b();  // Cast a vote if authenticated
        } else {
            System.out.println("SOMETHING WENT WRONG");  // Authentication failed
        }
    }	
}
			
		
		
		