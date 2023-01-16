public class Main {
//    Напишите код, с помощью которого можно разделить строку на части.
//    Код должен работать для строк любого размера и любого содержания. Размер частей вы устанавливаете самостоятельно.
    public static void main(String[] args) {
        String s1 = "8965, 585, 578, ";
        String[] array = s1.split(", ");
        for (String s : array) {
            System.out.println(s);
        }
    }
}

