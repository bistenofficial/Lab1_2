import java.util.InputMismatchException;
import java.util.Scanner;

public class Change
{
        static int priceRub;
        static int pricePenny;
        static int paidRub;
        static int paidPenny;
        static int rub;
        static int penny;
        public static void main(String args[])
        {
            int ent = enter();
            if (ent==1)
            {
                enter();
            }
            else if(ent==2)
            {
                enter();
            }
            else
            {
                math();
            }
        }
        public static int enter() {
            try {
                Scanner input = new Scanner(System.in);

                System.out.println("Введите стоимость в рублях");
                priceRub = input.nextInt();
                System.out.println("Введите копейки (Проставьте 0 если в цене нет копеек)");
                pricePenny = input.nextInt();

                System.out.println("Введите сколько оплатили рублей");
                paidRub = input.nextInt();
                System.out.println("Введите сколько оплатили копеек");
                paidPenny = input.nextInt();
                if (paidRub < 0 || paidPenny < 0 || priceRub < 0 || pricePenny < 0)
                {
                    System.out.println("Вы ввели отрицательное число");
                    return 2;
                }
                else
                    return 0;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Ошибка в вводе");
                return 1;
            }
        }
        public static void math()
        {
            if (paidPenny-pricePenny<0)
            {
                penny = 100+paidPenny - pricePenny;
                paidRub = paidRub - 1;
            }
            else penny = paidPenny - pricePenny;
            rub = paidRub - priceRub;
            if(rub<0) System.out.println("Вам не хватило денег для оплаты");
            else System.out.println("Ваша сдача "+rub+" руб "+penny + " коп");
        }
}
