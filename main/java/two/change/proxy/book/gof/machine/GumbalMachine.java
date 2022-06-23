package two.change.proxy.book.gof.machine;

public class GumbalMachine {

    private int count;
    private String location;
    private String status;

    public GumbalMachine(String location, int count) {
        this.location = location;
        this.count = count;
        this.status = "대기 중";
    }

    public String getLocation() {
        return this.location;
    }

    public int getCount() {
        return this.count;
    }

    public String getStatus() {
        return this.status;
    }
}
