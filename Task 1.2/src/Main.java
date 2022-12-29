import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //todo Тут увольняем айтишников
        int itCount = 0;
        while(itCount <= 100) {
            itCount+=2;
            System.out.println("Уволен айтишник с id " + itCount);
        }
    }
}