package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringConvention {

    public static String stringConvention(String str_input) {
        ArrayList<String> list = new ArrayList<>();
        String[] str_input_2 = str_input.split("\\s");
        for (String str : str_input_2) {
            String start_str = str.substring(0, 1).toUpperCase();
            String remaining_str = str.substring(1);
            str = start_str.concat(remaining_str);

            list.add(str);
        }
        return list.stream().map(Object::toString)
                .collect(Collectors.joining(" "));
    }
}
