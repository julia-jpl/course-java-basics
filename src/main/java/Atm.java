public class Atm {
    int numberBanknotes100;
    int numberBanknotes50;
    int numberBanknotes20;

    public Atm (int numberBanknotes100, int numberBanknotes50, int numberBanknotes20) {
        this.numberBanknotes100 = numberBanknotes100;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes20 = numberBanknotes20;
    }

    public int addBanknotes100(int number) {
        return this.numberBanknotes100 += number;
    }
    public int addBanknotes50(int number) {
        return this.numberBanknotes50 += number;
    }
    public int addBanknotes20(int number) {
        return this.numberBanknotes20 += number;
    }
}
