public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    // Перегруженные конструкторы
    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "С2", 2000.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears, englishLevel, 2000.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    // Перегруженные методы
    public void printInfo()
    {
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Стаж: " + experienceInYears);
        System.out.println("Уровень английского: " + englishLevel);
        System.out.println("Запрлата: " + salary);
    }

    public double printInfo(double ratePerHour)
    {
        return ratePerHour * 8 * 22 * experienceInYears + salary;
    }


    public void promote()
    {
        salary *= 1.2;
    }

    // Статический метод
    static boolean printInfo(Tester tester)
    {
        return tester.experienceInYears >= 3 && tester.englishLevel.equals("A1");
    }

}
