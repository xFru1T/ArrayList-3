import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.print("Print the string: ");
        String str1 = scanner.nextLine();
        String[] words = str1.split(" ");
        Collections.addAll(list, words);
        Collections.sort(list, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        System.out.println("Sorted string word:");
        for (String str : list) {
            System.out.println(str);
        }
    }
}
