package HomeWork;

public class lesson_3 {
    public static void main(String[] args) {


        int arr[] = {1, 0, 0, 0, 1, 1, 1, 1, 0};
        int i, x;
        for (i = 0; i < arr.length; i++) {
            x = arr[i];

            if (x == 0) {
                x = 1;
            } else if (x == 1) {
                x = 0;
            }
            System.out.println(x);
        }

        int[] empty = new int[100];

        for (int a = 0; a < empty.length; a++) {
            empty[a] = a + 1;
            System.out.println(empty[a]);
        }

        int ar[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int b = 0; b < ar.length; b++) {
            if (ar[b] < 6) {
                ar[b] = ar[b] * 2;
            }
            System.out.println(ar[b]);

        }

        int diagonal[][] = new int[4][4];
        for (int c = 0; c < diagonal.length; c++) {
            for (int d = 0; d < diagonal[0].length; d++) {
                diagonal[0][0] = 1;
                diagonal[1][1] = 1;
                diagonal[2][2] = 1;
                diagonal[3][3] = 1;

                diagonal[0][3] = 1;
                diagonal[1][2] = 1;
                diagonal[2][1] = 1;
                diagonal[3][0] = 1;

                System.out.print(diagonal[c][d]);
            }
            System.out.println("\n");
        }


        int minMax[] = {4, 6, 8, 2, 1, 8};

        int min = minMax[0];
        int max = minMax[0];

        for (int f = 0; f < minMax.length; f++) {
            if (minMax[f] < min)
                min = minMax[f];
            if (minMax[f] > max)
                max = minMax[f];
        }
        System.out.println("The smalest value is: " + min);
        System.out.println("The largest value is: " + max);


        a(5, 7);


    }


    public static int[] a(int len, int initialValue) {
        int arr[] = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.println(arr[i]);

        }
        return arr;
    }
}

