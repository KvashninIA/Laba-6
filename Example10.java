package Lr6;

//Напишите программу со статическим методом, аргументом которому передается
//произвольное количество целочисленных аргументов. Результатом метод возвращает
//массив из двух элементов: это значения наибольшего и наименьшего значений среди
//аргументов, переданных методу
public class Example10 {
    public static int[] findMinMax(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("Необходимо передать хотя бы одно значение");
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] values = {5, 10, 2, 8, 15};

        int[] minMax = findMinMax(values);

        System.out.println("Наименьшее значение: " + minMax[0]);
        System.out.println("Наибольшее значение: " + minMax[1]);
    }
}