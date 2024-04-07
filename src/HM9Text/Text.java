package HM9Text;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    public static void main(String[] args) {

        //Создать файл с текстом, прочитать,
        //подсчитать в тексте количество знаков препинания и слов.
        try (
                BufferedReader br = new BufferedReader(new FileReader("resources/text.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                int wordsCount = countOfWords(line);
                int marksCount = countOfPunctuationMarks(line);
                System.out.println("Words count = " + wordsCount);
                System.out.println("Punctuation marks count = " + countOfPunctuationMarks(line));
            }
        } catch (
                IOException e) {
            System.out.println("Exception with theory14.message " + e.getMessage() + " occurred");
        }
    }

    public static int countOfWords(String line) {
        String stringPattern = "\\s";
        String value = line;
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(value);
        int count = 1;
        while (matcher.find()) {
            count++;
        }
        return count;

    }

    public static int countOfPunctuationMarks(String line) {
        String stringPattern = "[.,]";
        String value = line;
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(value);
        int count1 = 0;
        while (matcher.find()) {
            count1++;
        }
        return count1;

    }

}

