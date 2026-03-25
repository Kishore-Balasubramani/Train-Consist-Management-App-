import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.*;
public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("====================================\n");


        Set<String> trainConsist = new LinkedHashSet<>();


        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");


        System.out.println("Final Train Formation\n"+trainConsist);

        System.out.println("\nNote\nLinkedHashSet preserves insertion order and removes duplicates automatically");



        System.out.println("\nUC5 formation setup completed...");
    }
}
