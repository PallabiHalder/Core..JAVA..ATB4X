package Sept.sept9.DoWhile;

public class Do004 {

    public static void main(String[] args) {

        // Loop and Condition

        int i = 1;
        do {
            System.out.println("Execute me multiple times till "+i);

            // will use it to call login user
            // will use it to do something multiple times

            if( i> 2){
                break;
            }
            i++;
        } while (i < 10);
    }
}


// 'break' can be used in for,switch,while, do-while.

// cannot be used for if .

// in this code, if is under do while. so no problem.