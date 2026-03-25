import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.*;
public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("=================================\n");

        Set <String> bogies = new HashSet<>();

        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");

        System.out.println("Bogie IDs after Insertion\n"+bogies);

        System.out.println("\nNote:\n Duplicates are automatically ignored by Hash Set");

        System.out.println("\nUC3 uniqueness validation completed...");
    }
}

