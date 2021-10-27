import java.util.ArrayList;

public class Phonebook {
    public ArrayList<Item> items=new ArrayList<Item>();
    public class Item{
        private String surname;
        private String phoneNumber;

        public String getSurname() {
            return surname;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Item(String surname, String phoneNumber) {
            this.surname = surname;
            this.phoneNumber = phoneNumber;
        }
    }

    public void add(String surname,String number){
        Item item = new Item(surname,number);
        items.add(item);
    }

    public void get(String s){
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getSurname().equals(s)){
                System.out.println(items.get(i).getSurname()+" :"+items.get(i).getPhoneNumber());
            }
        }
    }
}
