public class Main {
    public static void main(String[] args) {

        int check = 100; // Начальный баланс
        int payment = 1000; // Сумма пополнения
        int bonus; // кол-во бонусных рублей
        int balanc; // Итоговый баланс

        if (payment > 999) { bonus = (payment / 100);
            }
        else { bonus = ( 0 );
        }

        balanc = (bonus + payment + check);
        System.out.println("Поздравляем Вы получили:");
        System.out.println(bonus + " бонусных рублей");
        System.out.println("Ваш баланс:");
        System.out.println(balanc + "  рублей");

    }
}
