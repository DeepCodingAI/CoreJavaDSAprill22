package enumexample;

public class Week {

    Day day;
    public Week(){}
    public Week(Day day){
        this.day = day;
    }
    public void whatIsMyTask(Day day){
        switch (day){
            case Monday:
                System.out.println("Work on Home Work-1");
                break;
            case Tuesday:
                System.out.println("Continue on Home Work-1...");
                break;
            case Wednesday:
                System.out.println("We will have class which middle of the week at 7 pm");
                break;
            case Thursday:
                System.out.println("Work on home work-2 and Codelab");
                break;
            case Friday:
                System.out.println("Work on Home Work-2 continue and codelab");
                break;
            case Saturday:
                System.out.println("Lets prepare the materials for class on Sunday");
                break;
            case Sunday:
                System.out.println("We will have our regular Sunday class at 10 am");
                break;
            default:
                System.out.println("not a valid day");
                break;
        }
    }
}
