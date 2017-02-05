package com.anatoliy.practice.modul02.task021;


public class Calculate {
    public static void main(String[] args) {
        int[] arrayInt = {2, 5, 70, 81, 33, -20, -7, 9, 124, 0};
        double[] arrayDouble = {10.1, -22.4, 0.0, 1249.2, -255.0, 20.1, 93.21, 147.2, -102.012, 133.47};
        Calculate calculate = new Calculate();
        calculate.printSumOfArray(arrayInt);
        calculate.printSumOfArray(arrayDouble);
        calculate.printMinOfArray(arrayInt);
        calculate.printMinOfArray(arrayDouble);
        calculate.printMaxOfArray(arrayInt);
        calculate.printMaxOfArray(arrayDouble);
        calculate.printMaxPositiveOfArray(arrayInt);
        calculate.printMaxPositiveOfArray(arrayDouble);
        calculate.printMultiplicationOfArray(arrayInt);
        calculate.printMultiplicationOfArray(arrayDouble);
        calculate.printModulusFirstAndLastElementsOfArray(arrayInt);
        calculate.printModulusFirstAndLastElementsOfArray(arrayDouble);
        calculate.printSecondLargestElementOfArray(arrayInt);
        calculate.printSecondLargestElementOfArray(arrayDouble);
    }

    public void printSumOfArray(int[] array) {
        int resultSumOfArray = 0;
        for (int i = 0; i < array.length; i++) {
            resultSumOfArray = +array[i];
        }
        System.out.println("Сумма масива = " + resultSumOfArray);
    }

    public void printSumOfArray(double[] array) {
        double resultSumOfArray = 0.0;
        for (int i = 0; i < array.length; i++) {
            resultSumOfArray = +array[i];
        }
        System.out.println("Сумма масива = " + resultSumOfArray);
    }

    public void printMinOfArray(int[] array) {
        int minValueOfArray = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (minValueOfArray > array[i]) {
                minValueOfArray = array[i];
            }
        }
        System.out.println("Минимум масива = " + minValueOfArray);
    }

    public void printMinOfArray(double[] array) {
        double minValueOfArray = Double.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (minValueOfArray > array[i]) {
                minValueOfArray = array[i];
            }
        }
        System.out.println("Минимум масива = " + minValueOfArray);
    }

    public void printMaxOfArray(int[] array) {
        int maxValueOfArray = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maxValueOfArray < array[i]) {
                maxValueOfArray = array[i];
            }
        }
        System.out.println("Максимум масива = " + maxValueOfArray);
    }

    public void printMaxOfArray(double[] array) {
        double maxValueOfArray = Double.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maxValueOfArray < array[i]) {
                maxValueOfArray = array[i];
            }
        }
        System.out.println("Максимум масива = " + maxValueOfArray);
    }

    public void printMaxPositiveOfArray(int[] array) {
        int maxPositive = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                continue;
            }
            if (maxPositive < array[i]) {
                maxPositive = array[i];
            }
        }
        if(maxPositive < 0)
        {
            System.out.println("Все числа масива отрицательные");
        }
        else {
            System.out.println("Максимальное положительное число масива = " + maxPositive);
        }
    }

    public void printMaxPositiveOfArray(double[] array) {
        double maxPositive = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                continue;
            }
            if (maxPositive < array[i]) {
                maxPositive = array[i];
            }
        }
        if(maxPositive < 0)
        {
            System.out.println("Все числа масива отрицательные");
        }
        else {
            System.out.println("Максимальное положительное число масива = " + maxPositive);
        }
    }

    public void printMultiplicationOfArray(int[] array) {
        int resultMultiplicationOfArray = 1;
        for (int i = 0; i < array.length; i++) {
            resultMultiplicationOfArray = resultMultiplicationOfArray * array[i];
        }
        System.out.println("Произведение всех чисел масива = " + resultMultiplicationOfArray);
    }

    public void printMultiplicationOfArray(double[] array) {
        double resultMultiplicationOfArray = 1.0;
        for (int i = 0; i < array.length; i++) {
            resultMultiplicationOfArray = resultMultiplicationOfArray * array[i];
        }
        System.out.println("Произведение всех чисел масива = " + resultMultiplicationOfArray);
    }

    public void printModulusFirstAndLastElementsOfArray(int[] array) {
        System.out.println("Абсолютное значение первого элемента = " + Math.abs(array[0]));
        System.out.println("Абсолютное значение последнего элемента = " + Math.abs(array[array.length - 1]));
    }

    public void printModulusFirstAndLastElementsOfArray(double[] array) {
        System.out.println("Абсолютное значение первого элемента = " + Math.abs(array[0]));
        System.out.println("Абсолютное значение последнего элемента = " + Math.abs(array[array.length - 1]));
    }

    public void printSecondLargestElementOfArray(int[] array) {
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

    public void printSecondLargestElementOfArray(double[] array) {
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
}
