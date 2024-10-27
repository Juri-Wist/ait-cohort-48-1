package homework_44;

// Задание 1.
// В классе CompareFileAppl реализовать логику сравнения двух файлов в методе main.
// Имена файлов принимать через массив args. Два файла считаем одинаковыми, если у них одинаковая длина, и на тех же позициях стоят те же байты.
// Результат должен быть выведен на консоль в виде сообщения.

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class CompareFileAppl {

    public static void main(String[] args) {

        // Если количество аргументов не равен 2, выводим сообщение
        if (args.length != 2) {
            System.out.println("Wrong number of arguments!");
        }

        String file1 = args[0];
        String file2 = args[1];

        // Проверяем, одинаковы ли файлы
        try {
            boolean filesIdentical = compareFiles(file1, file2);
            if (filesIdentical) {
                System.out.println("Files are identical");
            } else {
                System.out.println("Files are not identical");
            }
        } catch (IOException e) {
            System.out.println("Error reading files: ");

        }


    }

    // Метод сравнивает два файла
    private static boolean compareFiles(String file1, String file2) throws IOException {

        try (FileInputStream fin1 = new FileInputStream(file1);
             FileInputStream fin2 = new FileInputStream(file2)) {

           //читаем длину каждого файла
           int l1 = fin1.read();
           int l2 = fin2.read();

           // сравнение длилы
            if (l1 != l2){
                System.out.println("Files have different lengths");
                return false;
            }

            // создаём массивы байтов
            byte[] arr1 = new byte[l1];
            byte[] arr2 = new byte[l2];

            // читаем читаем содержимое
            fin1.read(arr1);
            fin2.read(arr2);

            // сравнение содержимого
            if(!Arrays.equals(arr1, arr2)){
                System.out.println("Files have different bytes");
                return false;
            }
            // Если длины и содержимое совпадают
            return true;



        }

    }
}




