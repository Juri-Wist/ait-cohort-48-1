package classwork_44.io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ByInputAppl {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fin = new FileInputStream("./dest/data1.txt");

        try {
            System.out.println("Available: " + fin.available());
            int x = fin.read();
            System.out.println(x);
            System.out.println("Available: " + fin.available());

            // считать до конца файла
           // Option 1
          /*  while (x != -1) {
                System.out.println(x);
                x = fin.read();
            }
*/
            // Option 2
           /* int l = fin.available();
            System.out.println(l);

            for (int i = 0; i < l; i++) {
                int y =fin.read();
                System.out.println(y);

            }

            */
            int l = fin.read();
            byte[] arr = new byte[l];
            fin.read(arr);
            System.out.println(Arrays.toString(arr));

            for (byte b : arr) {
                System.out.println(b + " ");
            }
            System.out.println();



        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
