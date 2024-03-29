package Lr6;

//Напишите программу со статическим методом, аргументом которому передается
//целочисленный массив, а результатом возвращается среднее значение для элементов
//массива (сумма значений элементов, деленная на количество элементов в массиве)
public class Example8 {
    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            System.out.println("Массив не должен быть пустым");
        }

        int sum = 0;
        for (int value : array) {
            sum += value;
        }

        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};

        double average = calculateAverage(numbers);
        System.out.println("Среднее значение элементов массива: " + average);
    }
}
