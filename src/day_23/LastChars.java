package day_23;

public class LastChars {


    public static void main(String[] args) {
        String[][] name ={{"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"}};

        System.out.println(name[0][0].charAt(name[0][0].length()-1) + "" + name[0][1].charAt(name[0][1].length()-1)+""+ name[0][2].charAt(name[0][2].length()-1));
        System.out.println(name[1][0].charAt(name[1][0].length()-1) + "" + name[1][1].charAt(name[1][1].length()-1)+""+ name[1][2].charAt(name[1][2].length()-1)+""+name[1][3].charAt(name[1][3].length()-1));
        System.out.println(name[2][0].charAt(name[2][0].length()-1) +""+ name[2][1].charAt(name[2][1].length()-1));
    }
}
