package practice.reverseArray;

public class ReverseArray {

    public static String[] reverse(String[] strings) {
        //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
        for(int i = 0; i < strings.length / 2; i++) {
            String word = strings[i];
            strings[i] = strings[strings.length - i - 1];
            strings[strings.length - i - 1] = word;
        }
        return strings;
    }

}