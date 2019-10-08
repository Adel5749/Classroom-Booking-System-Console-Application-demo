public class Day {
    private String date;
    private Appointment[] apps=new Appointment[10];

    public Day(String date) {
        this.date = date;
        this.apps[0]=new Appointment(1,"8-9");
        this.apps[1]=new Appointment(1,"9-10");
        this.apps[2]=new Appointment(1,"10-11");
        this.apps[3]=new Appointment(1,"11-12");
        this.apps[4]=new Appointment(1,"12-1");
        this.apps[5]=new Appointment(1,"1-2");
        this.apps[6]=new Appointment(1,"2-3");
        this.apps[7]=new Appointment(1,"3-4");
        this.apps[8]=new Appointment(1,"4-5");
        this.apps[9]=new Appointment(1,"5-6");
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Appointment[] getApps() {
        return apps;
    }

    public void setApps(Appointment[] apps) {
        this.apps = apps;
    }

}
