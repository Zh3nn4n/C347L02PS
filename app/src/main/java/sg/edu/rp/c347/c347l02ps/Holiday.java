package sg.edu.rp.c347.c347l02ps;

public class Holiday {
    private String holType;
    private String holName;
    private String date;

    public Holiday(String holType, String holName, String date) {
        this.holType = holType;
        this.holName = holName;
        this.date = date;
    }

    public String getHolType() {
        return holType;
    }

    public void setHolType(String holType) {
        this.holType = holType;
    }

    public String getHolName() {
        return holName;
    }

    public void setHolName(String holName) {
        this.holName = holName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
