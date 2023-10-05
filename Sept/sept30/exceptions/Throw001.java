package Sept.sept30.exceptions;

import java.io.FileInputStream;

public class Throw001 {

    public static void main(String[] args) {

        class Throw01 {

            public static void main(String[] args) throws Exception {

                String path = "C:/dog.txt";
                FileInputStream f = new FileInputStream(path);
            }
        }

    }

}

/* We can handle exception by two ways.

1. By try-catch block.

2. By Adding 'throws' in main method.

 */