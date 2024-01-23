package task1;

import java.util.*;

public class Array {
    private List array;

    public Array() {
        this.array = new ArrayList<>();
    }

    public void fillFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пять элементов массива.");
        for (int i = 0; i < 5; i++) {
            Object o = scanner.nextInt();
            array.add(o);
        }
        scanner.close();
    }

    public void fillArrayWithRandomNumbers() {
        for (int i = 0; i < 10; i++) {
            array.add((int) (Math.random() * 100));
        }
    }

    public void print() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 0; i < array.size(); i++) {
            joiner.add(array.get(i).toString());
        }
        System.out.println(joiner.toString());
    }

    public int max() {
        int result = (int) array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (result < (int) array.get(i)) {
                result = (int) array.get(i);
            }
        }
        return result;
    }

    public int min() {
        int result = (int) array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (result > (int) array.get(i)) {
                result = (int) array.get(i);
            }
        }
        return result;
    }

    public double avg() {
        int sum = 0;
        for (int i = 1; i < array.size(); i++) {
            sum += (int) array.get(i);
        }
        return (double) sum / array.size();
    }

    public void sortUp() {
        Collections.sort(array);
    }

    public void sortDown() {
        Collections.reverse(array);
    }

    public int binarySearch(int num) {
        Collections.sort(array);
        int first = 0;
        int last = array.size() - 1;
        int mid = (first + last) / 2;
        int result = -1;
        while (first <= last) {
            if ((int)array.get(mid) < num) {
                first = mid + 1;
            } else if ((int)array.get(mid) == num) {
                result = mid;
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            result = -1;
        }
        return result;
    }

    public void replace(int num, int newValue){
        int index = array.indexOf(num);
        array.set(index, newValue);
    }

}
