import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        String[] strings = {"winter","book","bed","breakfast","book","winter","cold","ice","bed","paper","car","bottle","cold"};
        HashMap<String,Integer> hashMap = new HashMap();
        for (String s :strings) {
            int count=0;
            for (String s1:strings) {
                if (s.equals(s1)) {
                    count++;
                }
                hashMap.put(s, count);
            }
        }
        for (Map.Entry<String,Integer>pair:hashMap.entrySet()){
            System.out.println("Слово "+pair.getKey()+" повторялось "+pair.getValue()+" раз");
        }


        Phonebook phonebook = new Phonebook();
        phonebook.add("Анд","7894521232");
        phonebook.add("Код","7894524532");
        phonebook.add("Шнд","7894521232");
        phonebook.add("Анд","7894521232");
        phonebook.add("Алд","7891233232");
        phonebook.add("Аое","7894521232");
        phonebook.get("Анд");

    }
}
