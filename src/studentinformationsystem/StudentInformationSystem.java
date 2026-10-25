// Declare the package named studentinformationsystem
package studentinformationsystem;

// Declare a public class named StudentInformationSystem
public class StudentInformationSystem {
    
    // Declare the main method
    public static void main(String[] args) {
        
        // Display the student's name
        System.out.println("Name: MUHAMMAD FARIS BIN AMRAN");
        
        // Display the student's ID
        System.out.println("Student ID: s87053");
        
        // Store mark
        int mark1 = 40, mark2 = 50;
        
        // Calculate Total Mark
        int total = mark1 + mark2;
        
        // Display Total Mark
        System.out.println("Total Mark: " + total);
        
        // Check if the Total Mark excellent or not
        if (total >= 80){
            //Display Excelent result
            System.out.println("Result: Excelent");
        }else if (total >= 50) {
            //Display Good result
            System.out.println("Result: Good");
        }else{
            //Display result need some improvement
            System.out.println("Result: Need Some Improvement!");
        }
    }
    
}
