package var;

public class Worker {

    //Biến static
    public static String LEVEL = "MASTER";

    //Biến toàn cục
    private String fullName;

    //Biến cục bộ
    public Integer sumHour(int workingDay) {
        int sumHour = workingDay * 8;
        return sumHour;
    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        System.out.println(Worker.LEVEL);
    }
}
