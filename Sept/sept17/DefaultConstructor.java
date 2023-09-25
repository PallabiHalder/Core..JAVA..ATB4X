package Sept.sept17;

public class DefaultConstructor {   // Runner class

    public static void main(String[] args) {

        DateData d = new DateData();

         d.printDate(); //it will take value from default Constructor.



    }
}

class DateData {
    int day,month, year;


    DateData(){
        day = 25;
        month = 8;
        year = 2022;
    }

    public void printDate(){
        System.out.println("Date is "+day+month+year);


    }
}
