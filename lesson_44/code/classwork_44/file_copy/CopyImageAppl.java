package classwork_44.file_copy;

// написать утилиту для командной строки для копирования файла
// аргументы: файл источник и файл копия

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageAppl {
    public static void main(String[] args) {

        // проверяем, что в командной строке есть 2 аргумента - файл источник и файл копия
        if (args.length != 2) {
            System.out.println("Wrong number of arguments!");

        }

        System.out.println("Source: " + args[0]);
        System.out.println("Destination: " + args[1]);

        // первым потоком читаем байты, вторым потоком их записываем

        try (FileInputStream fin = new FileInputStream(args[0])) {
            FileOutputStream fout = new FileOutputStream(args[1]);

            int a = fin.read();
            while (a!= -1) {
                fout.write(a);
                a = fin.read();
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
