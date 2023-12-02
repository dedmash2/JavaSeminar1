public class Task4 {
    public static void main(String[] args) {
        int[] bool = new int[]{1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1};
        int count = 0;
        int maxCount = 0;
        for (int j : bool) {
            if (j == 1) count++;
            else {
                if (count > maxCount) maxCount = count;
                count = 0;
            }
        }
        if (count > maxCount) maxCount = count;
        System.out.println(maxCount);
    }

}
