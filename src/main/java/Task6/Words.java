package Task6;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        String readfile = "";


        System.out.println("Введите абсолютный или относительный путь к файлу (не забудьте указать формат .txt)");
        String filepath = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            while ((str = br.readLine()) != null) {
                readfile += str;
            }
        } catch (IOException exc) {
            System.out.println("Ошибка чтения: " + exc.getMessage());
        }

        Pattern p1 = Pattern.compile("[^a-zA-Zа-яА-Я_0-9]");
        Matcher m1 = p1.matcher(readfile);
        readfile = m1.replaceAll(" ");
        Pattern p2 = Pattern.compile("\\s+");
        Matcher m2 = p2.matcher(readfile);
        readfile = m2.replaceAll(" ");
        LinkedList<String> wordsList = new LinkedList<String>();
        Pattern p3 = Pattern.compile("\\s");
        String[] words = p3.split(readfile);
        for (int i = 0; i < words.length; i++)
            wordsList.add(words[i]);
        Collections.sort(wordsList);

        System.out.println("Отсортированный список:");
        for (String word : wordsList) {
            System.out.print(word + " ");
        }
        System.out.print("\n\n");


        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        Integer am;
        for (String word : wordsList) {
            am = hm.get(word);
            hm.put(word, am == null ? 1 : am + 1);
        }
        System.out.println("Статистика по словам: ");
        for (Map.Entry item : hm.entrySet()) {
            System.out.println(item);
        }


        ArrayList<Integer> Counts = new ArrayList<>(hm.values());
        ArrayList<String> Words = new ArrayList<>(hm.keySet());
        System.out.println(Counts);
        System.out.println(Words);
        int maxCount = Collections.max(Counts);
        int index = Counts.indexOf(maxCount);
        String maxWord = Words.get(index);

        System.out.print("\n");
        System.out.println("Самое частое слово - " + maxWord + ". Встречается " + maxCount + " раза");
    }
}
