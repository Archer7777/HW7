public class Main {
    public static void main(String[] args) {
        //todo Тут увольняем айтишников
        for (int itCount = 0; itCount < 100; itCount+=2) {
            if (itCount == 0) {
                continue;
            }
            System.out.println("Уволен айтишник с id " + itCount);
        }
    }
}
