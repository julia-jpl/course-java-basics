public class TimeTest {
    public static void main(String[] args) {
        Time time1 = new Time(3,5,6);
        Time time2 = new Time(678);
        time1.setHours(5);
        time1.getHours();
        time1.setMinutes(35);
        time1.getMinutes();
        time1.setSeconds(45);
        time1.getSeconds();
        System.out.println(time1.getHours());
        System.out.println(time1.getMinutes());
        System.out.println(time1.getSeconds());
        time2.getSeconds();
        System.out.println(time2.getSeconds());
        System.out.println(time1.getTotalSeconds());
        System.out.println(time2.getTotalSeconds());
    }
}
