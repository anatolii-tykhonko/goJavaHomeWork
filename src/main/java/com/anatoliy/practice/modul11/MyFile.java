package com.anatoliy.practice.modul11;

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by anaatolii on 31.08.17.
 */
public class MyFile {
    private File firstFile;

    public MyFile( ){
        firstFile = new File("/Users/anaatolii/IdeaProjects/GoJavaHomework/src/main/java/com/anatoliy/practice/modul11/text.txt");
    }

    public File getFirstFile() {
        return firstFile;
    }

    public void setFirstFile(File firstFile) {
        this.firstFile = firstFile;
    }
    public String replacer(Map<String, String> map) throws IOException {
        String oldWord = "";
        String newWord = "";
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            oldWord = pair.getKey();
            newWord = pair.getValue();
        }
        Scanner scanner = new Scanner(new FileReader("/Users/anaatolii/IdeaProjects/GoJavaHomework/src/main/java/com/anatoliy/practice/modul11/text.txt"));
        String allText = "";
        String oneWord;
        while (scanner.hasNext()) {
            oneWord = scanner.next();

            if (oneWord.equals(oldWord)) {
                oneWord = newWord;
            }
            allText = allText + oneWord + " ";
        }
        return allText;
    }

    public File fileContentReplacer(Map<String, String> map) throws IOException {
        String oldWord = "";
        String newWord = "";
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            oldWord = pair.getKey();
            newWord = pair.getValue();
        }
        Scanner scanner = new Scanner(new FileReader("/Users/anaatolii/IdeaProjects/GoJavaHomework/src/main/java/com/anatoliy/practice/modul11/text.txt"));
        String allText = "";
        String oneWord;
        while (scanner.hasNext()) {
            oneWord = scanner.next();

            if (oneWord.equals(oldWord)) {
                oneWord = newWord;
            }
            allText = allText + oneWord + " ";
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(firstFile));
        writer.write(allText);
        writer.flush();
        return firstFile;
    }

    public File fileContentMerger(Map<String, String> map) throws IOException{
        String oldWord = "";
        String newWord = "";
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            oldWord = pair.getKey();
            newWord = pair.getValue();
        }
        Scanner scanner = new Scanner(new FileReader("/Users/anaatolii/IdeaProjects/GoJavaHomework/src/main/java/com/anatoliy/practice/modul11/text.txt"));
        String allText = "";
        String oneWord;
        while (scanner.hasNext()) {
            oneWord = scanner.next();

            if (oneWord.equals(oldWord)) {
                oneWord = newWord;
            }
            allText = allText + oneWord + " ";
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(firstFile, true));
        writer.write(allText);
        writer.flush();
        return firstFile;
    }

    /*
    public int checkWord(String word) throws IOException {
        int calculateWord = 0;
        Scanner scanner = new Scanner(new FileReader("/Users/anaatolii/IdeaProjects/GoJavaHomework/src/main/java/com/anatoliy/practice/modul11/text.txt"));
        while (scanner.hasNext()) {
            if (scanner.next().equals(word)) {
                calculateWord++;
            }
        }
        return calculateWord;
    }
    */

    public int checkWord(String word) throws IOException {
        int calculateWord = 0;
        try(Scanner scanner = new Scanner(new FileReader("/Users/anaatolii/IdeaProjects/GoJavaHomework/src/main/java/com/anatoliy/practice/modul11/text.txt"))) {
            while (scanner.hasNext()) {
                if (scanner.next().equals(word)) {
                    calculateWord++;
                }
            }
        }
        return calculateWord;
    }

}
