package com.anatoliy.practice.modul06;

public final class ArraysUtils {

    private ArraysUtils(){}

    public static final void printSumOfArray(int[] array) {
        int resultSumOfArray = 0;
        for (int i = 0; i < array.length; i++) {
            resultSumOfArray += array[i];
        }
        System.out.println("Сумма масива = " + resultSumOfArray);
    }

    public static final void printSumOfArray(double[] array) {
        double resultSumOfArray = 0.0;
        for (int i = 0; i < array.length; i++) {
            resultSumOfArray += array[i];
        }
        System.out.println("Сумма масива = " + resultSumOfArray);
    }

    public static final void printMinOfArray(int[] array) {
        int minValueOfArray = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (minValueOfArray > array[i]) {
                minValueOfArray = array[i];
            }
        }
        System.out.println("Минимум масива = " + minValueOfArray);
    }

    public static final void printMinOfArray(double[] array) {
        double minValueOfArray = Double.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (minValueOfArray > array[i]) {
                minValueOfArray = array[i];
            }
        }
        System.out.println("Минимум масива = " + minValueOfArray);
    }

    public static final void printMaxOfArray(int[] array) {
        int maxValueOfArray = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maxValueOfArray < array[i]) {
                maxValueOfArray = array[i];
            }
        }
        System.out.println("Максимум масива = " + maxValueOfArray);
    }

    public static final void printMaxOfArray(double[] array) {
        double maxValueOfArray = Double.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maxValueOfArray < array[i]) {
                maxValueOfArray = array[i];
            }
        }
        System.out.println("Максимум масива = " + maxValueOfArray);
    }

    public static final void printMaxPositiveOfArray(int[] array) {
        int maxPositive = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                continue;
            }
            if (maxPositive < array[i]) {
                maxPositive = array[i];
            }
        }
        if (maxPositive < 0) {
            System.out.println("Все числа масива отрицательные");
        } else {
            System.out.println("Максимальное положительное число масива = " + maxPositive);
        }
    }

    public static final void printMaxPositiveOfArray(double[] array) {
        double maxPositive = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                continue;
            }
            if (maxPositive < array[i]) {
                maxPositive = array[i];
            }
        }
        if (maxPositive < 0) {
            System.out.println("Все числа масива отрицательные");
        } else {
            System.out.println("Максимальное положительное число масива = " + maxPositive);
        }
    }

    public static final void printMultiplicationOfArray(int[] array) {
        int resultMultiplicationOfArray = 1;
        for (int i = 0; i < array.length; i++) {
            resultMultiplicationOfArray = resultMultiplicationOfArray * array[i];
        }
        System.out.println("Произведение всех чисел масива = " + resultMultiplicationOfArray);
    }

    public static final void printMultiplicationOfArray(double[] array) {
        double resultMultiplicationOfArray = 1.0;
        for (int i = 0; i < array.length; i++) {
            resultMultiplicationOfArray = resultMultiplicationOfArray * array[i];
        }
        System.out.println("Произведение всех чисел масива = " + resultMultiplicationOfArray);
    }

    public static final void printModulusFirstAndLastElementsOfArray(int[] array) {
        System.out.println("Абсолютное значение первого элемента = " + Math.abs(array[0]));
        System.out.println("Абсолютное значение последнего элемента = " + Math.abs(array[array.length - 1]));
    }

    public static final void printModulusFirstAndLastElementsOfArray(double[] array) {
        System.out.println("Абсолютное значение первого элемента = " + Math.abs(array[0]));
        System.out.println("Абсолютное значение последнего элемента = " + Math.abs(array[array.length - 1]));
    }

    public static final void printSecondLargestElementOfArray(int[] array) {
        int maxValueOfArray = Integer.MIN_VALUE;
        int secondMaxValueOfArray = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maxValueOfArray < array[i]) {
                maxValueOfArray = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != maxValueOfArray) {
                if (secondMaxValueOfArray < array[i]) {
                    secondMaxValueOfArray = array[i];
                }
            } else continue;
        }
        System.out.println("Второе наибольшее число = " + secondMaxValueOfArray);
    }

    public static final void printSecondLargestElementOfArray(double[] array) {
        double maxValueOfArray = Double.MIN_VALUE;
        double secondMaxValueOfArray = Double.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maxValueOfArray < array[i]) {
                maxValueOfArray = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != maxValueOfArray) {
                if (secondMaxValueOfArray < array[i]) {
                    secondMaxValueOfArray = array[i];
                }
            } else continue;
        }
        System.out.println("Второе наибольшее число = " + secondMaxValueOfArray);
    }

    public static final int[] reverse(int[] array) {
        System.out.println("Возвращаем массив с обратным порядком элементов");
        int[] arrayRevers = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayRevers[array.length - 1 - i] = array[i];
        }
        return arrayRevers;
    }

    public static final int[] findEvenElements(int[] array){
        int countEvenElements= 0;
        int[] bigArrayEvenElements = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if((array[i] % 2) == 0){
                bigArrayEvenElements[countEvenElements] = array[i];
                countEvenElements++;
            }
        }
        int[] arrayEvenElements = new int[countEvenElements];
        System.arraycopy(bigArrayEvenElements,0, arrayEvenElements, 0, countEvenElements);
        System.out.println("Всего четных элементов = " + countEvenElements);
        return arrayEvenElements;

    }
}
