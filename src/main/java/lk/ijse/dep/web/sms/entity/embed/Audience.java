package lk.ijse.dep.web.sms.entity.embed;

public enum Audience {

    AFTERAL(0), UNDERGRADUATE(1), GRADUATE(3);

    private final int number;

    Audience(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}
