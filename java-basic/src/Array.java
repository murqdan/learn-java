public class Array {
    public static void main(String[] args) {
        String[] name;
        name = new String[3];

        name[0] = "Soekarno";
        name[1] = "Soeharto";
        name[2] = "Habibie";

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

        String[] fruit = new String[3];

        String[] programmingLanguage = new String[]{
          "Java", "Python", "Ruby"
        };

        String[] color = {
          "Red", "Green", "Blue"
        };

        System.out.println(fruit.length);
        System.out.println(programmingLanguage.length);
        System.out.println(color.length);

        String[][] members = {
                {"Eko", "Gunawan"},
                {"Painem", "Tukimin"},
                {"Bambang"}
        };

        System.out.println(members[1][1]);
        System.out.println(members[2][0]);
    }
}
