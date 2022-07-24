package Lesson1;

public class Lesson1 {
    public static void main(String[] args) {   //задача 1
        String number = "234";
        int number2 = Integer.parseInt(number);
        String text = "some_text";
        int lenght = text.length();
        System.out.println(number2 + lenght);


        int a = 3;
        int b = 5;
        int number1 = (int) Math.pow(a + b, 2);
        System.out.println(number1);

        int[] massive1 = new int[]{1, 2, 5, 7, 10};
        int[] massive2 = new int[]{2, 3, 2, 17, 15};
        int[] massive3 = new int[massive1.length + massive2.length + (massive1.length + massive2.length) / 2];

        int count = 0;
        int count1 = 0;
        for (int i = 0; i < massive1.length; i++) {
            massive3[i] = massive1[i];
            count++;
            count1++;
        }
        for (int q = 0; q < massive2.length; q++) {
            massive3[count++] = massive2[q];
            count1++;
        }
        for (int k = 0; k < (massive1.length + massive2.length) / 2; k++)
            massive3[count1++] = massive1[k] * massive2[k];

        for (int p = 0; p < massive3.length; p++) {
            System.out.print(massive3[p] + "\t");

        }


        String textA = "Hello word!";
        String textR = textA.replace("l", "r");
        String textB = textR.toUpperCase().substring(0,8);
        System.out.println();
        System.out.println(textB);


    }
}

