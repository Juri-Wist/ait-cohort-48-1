package classwork_44.io_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputAppl {
    public static void main(String[] args) {



   try (FileOutputStream fout = new FileOutputStream("./dest/data.txt")) {

       /*fout.write(65);
       fout.write(66);
       fout.write(67);
       fout.write(68);
*/
       // Steam<Character> alphabet =

       for (int i = 0; i < 26; i++) {
           fout.write(65 + i );
           //fout.write(32);

       }

   } catch (FileNotFoundException e) {
       e.printStackTrace();
       throw new RuntimeException(e);
   } catch (IOException e) {
       throw new RuntimeException(e);
   }


    }
}

