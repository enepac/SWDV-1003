import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        final int MAX_VALUES = 15;
        String[] stringArray = new String[MAX_VALUES];
        int count = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        // Accept input until 'zzz' is entered or the array is full
        while (count < MAX_VALUES) {
            System.out.print("Enter a word or zzz to quit >> ");
            String input = scanner.nextLine();
            
            // Check if 'zzz' is entered, then break the loop
            if (input.equals("zzz")) {
                break;
            }
            
            stringArray[count] = input;
            count++;
        }
        
        // Sort the array
        Arrays.sort(stringArray, 0, count);
        
        // Display the sorted strings
        System.out.println("Strings in order:");
        for (int i = 0; i < count; i++) {
            System.out.print(stringArray[i] + " ");
        }
        
        scanner.close();
    }
}
