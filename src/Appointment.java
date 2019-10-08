public class Appointment {
    private int appointID;
    private boolean isAvailable;
    private String status;
    private String time;
    private Lecturer lec;

    public Appointment(int appointID, String time) {
        this.appointID = appointID;
        this.time = time;
        this.isAvailable=true;
        this.status="Pending";
    }

    public int getAppointID() {
        return appointID;
    }

    public void setAppointID(int appointID) {
        this.appointID = appointID;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Lecturer getLec() {
        return lec;
    }

    public void setLec(Lecturer lec) {
        this.lec = lec;
    }
}
