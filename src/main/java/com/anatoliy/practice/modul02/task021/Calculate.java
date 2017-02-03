package com.anatoliy.practice.modul02.task021;


public class Calculate {
    public static void main(String[] args) {
        int[] arrayInt = {2, 5, 70, 81, 33, -20, -7, 9, 124, 0};
        double[] arrayDouble = {10.1, -22.4, 0.0, 1249.2, -255.0, 20.1, 93.21, 147.2, -102.012, 133.47};
        Calculate calculate = new Calculate();
        calculate.max(arrayDouble);
        calculate.modulus(arrayDouble);
    }

    public void sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = +array[i];
        }
        System.out.println("Сумма масива = " + sum);
    }

    public void sum(double[] array) {
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum = +array[i];
        }
        System.out.println("Сумма масива = " + sum);
    }

    public void min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        System.out.println("Минимум масива = " + min);
    }

    public void min(double[] array) {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        System.out.println("Минимум масива = " + min);
    }

    public void max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        System.out.println("Максимум масива = " + max);
    }

    public void max(double[] array) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        System.out.println("Максимум масива = " + max);
    }

    public void maxPositive(int[] array) {
        int maxPos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0)
                continue;
            if (maxPos < array[i])
                maxPos = array[i];
        }
        System.out.println("Максимальное положительное число масива = " + maxPos);
    }

    public void maxPositive(double[] array) {
        double maxPos = 0.0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0)
                continue;
            if (maxPos < array[i])
                maxPos = array[i];
        }
        System.out.println("Максимальное положительное число масива = " + maxPos);
    }

    public void multiplication(int[] array) {
        int mult = 1;
        for (int i = 0; i < array.length; i++) {
            mult = mult * array[i];
        }
        System.out.println("Произведение всех чисел масива = " + mult);
    }

    public void multiplication(double[] array) {
        double mult = 1.0;
        for (int i = 0; i < array.length; i++) {
            mult = mult * array[i];
        }
        System.out.println("Произведение всех чисел масива = " + mult);
    }

    public void modulus(int[] array) {
        System.out.println("Абсолютное значение первого элемента = " + Math.abs(array[0]));
        System.out.println("Абсолютное значение последнего элемента = " + Math.abs(array[array.length - 1]));
    }

    public void modulus(double[] array) {
        System.out.println("Абсолютное значение первого элемента = " + Math.abs(array[0]));
        System.out.println("Абсолютное значение последнего элемента = " + Math.abs(array[array.length - 1]));
    }

    public void secondLargest(int[] array) {
        int max = Integer.MIN_VALUE;
        int maxSecond = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != max) {
                if (maxSecond < array[i])
                    maxSecond = array[i];
            } else continue;
        }
        System.out.println("Второе наибольшее число = " + maxSecond);
    }

    public void secondLargest(double[] array) {
        double max = Double.MIN_VALUE;
        double maxSecond = Double.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != max) {
                if (maxSecond < array[i])
                    maxSecond = array[i];
            } else continue;
        }
        System.out.println("Второе наибольшее число = " + maxSecond);
    }
}
