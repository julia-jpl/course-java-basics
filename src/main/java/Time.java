public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    public Time (int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public Time (int totalSeconds) {
        this.seconds = totalSeconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public int getSeconds() {
        return this.seconds;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public int getMinutes() {
        return this.minutes;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getHours() {
        return this.hours;
   }
   public int getTotalSeconds() {
        int totalSeconds = this.hours * 3600 + this.minutes * 60 + this.seconds;
        return totalSeconds;
   }

}
