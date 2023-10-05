package Sept.sept30.exceptions;

public class SolutionOfex001 {

    public static void main(String[] args) {

        String name = null ;

        try{

            name.trim() ; // write the code block which will give you exception.

        }catch (Exception e) {

            System.out.println(e.getMessage());

        }

        System.out.println("This line I want to execute");
    }
}


/* Note : catch can be declared in 3 ways.  (Interview question)

           1. catch (Exception e)
           2. catch (Throwable e)
           3. catch (error e)

 */