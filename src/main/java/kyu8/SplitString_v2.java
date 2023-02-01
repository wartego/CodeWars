package kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;
public class SplitString_v2 {

        static String toCamelCase(String s) {
            if(s.isEmpty())
                return s;
            String ws[] = s.split("[-_]");
            return ws[0] + Arrays.stream(ws)
                    .skip(1)
                    .map(wd -> Character.toUpperCase(wd.charAt(0)) + wd.substring(1))
                    .collect(Collectors.joining(""));
        }
    }

