public class main
{
    public static void main(String[] args)
    {
        Tester tester1 = new Tester("Константин", "Сереков", 2);
        tester1.printInfo();
        System.out.println();
        Tester tester2 = new Tester("Женя", "Рак", 5, "A1");
        double salary2 = tester2.printInfo(25.0);
        System.out.println("Зарплата Жени: " + salary2);
        System.out.println();
        Tester tester3 = new Tester("Ваня", "Рябов", 5, "С2", 2500.0);
        tester3.promote();
        boolean goodTester = Tester.printInfo(tester2);
        System.out.println("Женя лучше Вани? " + goodTester);

    }

}
