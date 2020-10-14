public class AtmTest {
    public static void main(String[] args) {
        Atm atm1 = new Atm (50, 30, 3);

        System.out.println("100 x " + atm1.addBanknotes100(8));
        System.out.println("50 x " + atm1.addBanknotes50(20));
        System.out.println("20 x " + atm1.addBanknotes20(10));
        System.out.println(atm1.isPossibleIssue(125));
        System.out.println(atm1.isPossibleIssue(10000));
        System.out.println(atm1.isPossibleIssue(250));
        atm1.getOptionsCombinationBanknotes(500);
    }
}
