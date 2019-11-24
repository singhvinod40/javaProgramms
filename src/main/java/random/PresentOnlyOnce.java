package random;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PresentOnlyOnce {
        public static void main(String[] args) {

            int[] array1 = {1, 1, 2, 2, 3, 4, 4, 5, 5};

            presentOnlyOnceNUmber(array1);

        }

        private static void presentOnlyOnceNUmber(int[] array1) {

            List<Integer>list= Arrays.stream(array1).boxed().collect(Collectors.toList());





        }
    }