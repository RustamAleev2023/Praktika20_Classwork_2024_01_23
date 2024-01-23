import task1.Array;

public class Main {
    public static void main(String[] args) {
        task1();
    }
    //Задание1
    // Создайте шаблонный класс Array, который пред-
    //ставляет собой массив, позволяющий хранить объекты
    //заданного типа. Необходимо реализовать:
    //■ заполнение массива с клавиатуры;
    //■ заполнение массива случайными числами;
    //■ отображение массива;
    //■ поиск максимального значения;
    //■ поиск минимального значения;
    //■ подсчет среднеарифметического значения;
    //■ сортировка массива по возрастанию;
    //■ сортировка массива по убыванию;
    //■ поиск значения в массиве, используя бинарный поиск;
    //■ замена значения в массиве на новое значение.
    public static void task1(){
        Array array = new Array();
        array.fillFromKeyboard();
        array.print();
        array = new Array();
        array.fillArrayWithRandomNumbers();
        array.print();
        System.out.println(array.max());
        System.out.println(array.min());
        System.out.println(array.avg());
        array.sortUp();
        array.print();
        array.sortDown();
        array.print();
        Array array1 = new Array();
        array1.fillFromKeyboard();
        array1.print();
        System.out.println(array1.binarySearch(3));
        array1.replace(1,6);
        array1.print();


    }
}