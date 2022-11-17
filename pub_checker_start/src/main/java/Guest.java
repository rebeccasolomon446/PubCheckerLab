public class Guest {

    private String name;
    private int age;
    private Double money;
    private String bannedOrNot;
    private int sobrietyLevel;
    private char currency;

    public Guest(String name, int age, Double money, String bannedOrNot, int sobrietyLevel, char currency) {

        this.name = name;
        this.age = age;
        this.money = money;
        this.bannedOrNot = bannedOrNot;
        this.sobrietyLevel = sobrietyLevel;
        this.currency = currency;
    }

    public Integer getAge() {
        return this.age;
    }

    public Double getMoney() {
        return this.money;

    }

    public String getBannedOrNot() {
        return this.bannedOrNot;
    }

    public int getSobrietyLevel() {
        return this.sobrietyLevel;
    }

    public char getCurrency() {
        return this.currency;
    }
}
