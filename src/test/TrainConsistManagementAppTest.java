
import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {


    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    @Test
    void testFilter_CapacityGreaterThan60() {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("General", 90)
        );


        List<Bogie> result = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());


        Assertions.assertEquals(2, result.size());


        Assertions.assertTrue(result.stream().allMatch(b -> b.capacity > 60));
    }

    @Test
    void testFilter_NoMatch() {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Low1", 20),
                new Bogie("Low2", 30)
        );

        List<Bogie> result = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        Assertions.assertTrue(result.isEmpty());
    }
}