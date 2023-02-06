package kyu8;

public class Test {
    public static String abbrevName(String name) {
        String[] split = name.split(" ");
        return split[0].substring(0,1).toUpperCase()+ "." + split[1].substring(0,1).toUpperCase();
    }
}
