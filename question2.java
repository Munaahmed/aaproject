import java.util.Arrays;

public class Triangle {
    public static int[] chooseTriangle(int[] lines) {
        Arrays.sort(lines);
        for (int i = lines.length - 1; i > 1; i--) {
            if (lines[i-2] + lines[i-1] > lines[i]) {
                return new int[] {lines[i-2], lines[i-1], lines[i]};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] lines = {3, 4, 5, 6, 7, 8, 9};
        int[] triangle = chooseTriangle(lines);
        if (triangle != null) {
            System.out.println(Arrays.toString(triangle));
        } else {
            System.out.println("No triangle can be formed");
        }
    }
}
