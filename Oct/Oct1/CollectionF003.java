package Oct.Oct1;



import java.util.List;


public class CollectionF003 {

    public static void main(String[] args) {


     //   List list = new List() ; -> As List is an interface, we can't create an object of List.

        List list =  List.of("orange","apple","banana","sugar",123,"orange") ;

        // In list element should be in order.. sequence will be same.

        // List can have different types pof elements.

        // Duplicate element is allowed in List.

        System.out.println(list);


        System.out.println("---------------------------");


        System.out.println(list.get(2));

        System.out.println(list.size());

        System.out.println(list.indexOf("apple"));

        System.out.println(list.indexOf("pallabi"));  // -1 -> If element is not present in List,
                                                      //  o/p will be '-1' everytime.

        System.out.println(list.isEmpty());  // here false


        System.out.println("--------------------");


        // Addition in List is not allowed. becoz List is static and immutable in nature.


    //    list.add("kuchi"); // not allowed.

        System.out.println(list);


        // API Automation

        List url = List.of("https://app.vwo.com","https://qa.vwo.com");

        List college = List.of("AIT","IIT");




    }


}