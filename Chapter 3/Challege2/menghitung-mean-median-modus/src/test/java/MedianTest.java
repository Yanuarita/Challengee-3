import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MediannTest {

    
   @Test
   public void testMediann() {
      List<Integer> numbers = new ArrayList<Integer>();
      numbers.add(1);
      numbers.add(2);
      numbers.add(3);
      numbers.add(4);
      numbers.add(5);

      // Using lambda expression to calculate median of numbers
      Collections.sort(numbers);
      int size = numbers.size();
      double median = size % 2 == 0 ? (numbers.get(size/2) + numbers.get(size/2 - 1))/2.0 : numbers.get(size/2);

      assertEquals(3.0, median, 0.001);
   }
}

