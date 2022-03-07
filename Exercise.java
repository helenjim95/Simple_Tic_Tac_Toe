import java.util.ArrayList;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        System.out.print("Enter cells:");
        String a = "O_OXXO_XX";
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 9; i++) {
            list.add(a.charAt(i));
        }

        System.out.println("---------");
        System.out.println("|" + " " + list.get(0) + " " + list.get(1) + " " + list.get(2) + " |");
        System.out.println("|" + " " + list.get(3) + " " + list.get(4) + " " + list.get(5) + " |");
        System.out.println("|" + " " + list.get(6) + " " + list.get(7) + " " + list.get(8) + " |");
        System.out.println("---------");
    }
    }

}
