public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

    }
}
// Не до конца понял почему cost берет данные из переменной price?
// переменная miles дает команду выполнить функцию service.calculate к переменной price,
// следовательно за основу берутся данные из price, а т к в методе входные данные это переменная cost
// след-но данные из price = входные данные cost, верно ли я рассуждаю?