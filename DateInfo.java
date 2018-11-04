public class DateInfo extends Info{

    private String dateBegin;
    private String dateEnd;

    public DateInfo(String dateRange){
        dateBegin = dateRange;
        dateEnd   = dateRange;
    }

    public boolean contains(ActivityEntry activityEntry){
        return false;
    }


    public void show(){
        System.out.println("Data inicial do registro: " + dateBegin);
        System.out.println("Data final do registro:   " + dateEnd);
    }

    
    
}
