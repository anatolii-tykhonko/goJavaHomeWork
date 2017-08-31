package com.anatoliy.practice.modul11;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by anaatolii on 09.05.17.
 */
public class Main {

    public static void main(String[] args) {
        MyFile myFile = new MyFile();
        Map<String, String> words = new HashMap<>();
        words.put("new", "OLD");
        try {
            //тест
            System.out.println(myFile.replacer(words));
            //проверка что файл не изменился
            //BufferedReader reader1 = new BufferedReader(new FileReader(myFile.getFirstFile()));
            //System.out.println(reader1.readLine());

            //изменили файл
            /*
            BufferedReader reader = new BufferedReader(new FileReader(myFile.fileContentReplacer(words)));
            String t = reader.readLine();
            System.out.println(t);
            */

            //добавили к файлу измененый
            /*
            BufferedReader reader = new BufferedReader(new FileReader(myFile.fileContentMerger(words)));
            String t = reader.readLine();
            System.out.println(t);
            */

            //считаем количество повторений слова
            System.out.println(myFile.checkWord("Merdeka"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
