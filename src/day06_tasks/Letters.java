package day06_tasks;

public class Letters {
    //Task:
    //add main method
    //define a character. print me the
    //next four characters on new lines
    //Note: Each characters has a number
    //assigned to eat. So, if you declare a
    //character and use increment it will take the
    //next letter in the alphabet
    public static void main(String[] args) {
      char apple = 'A';
      char banana = 'B';
      char cerry = 'C';
      char dragonfruit = 'D';
      apple=++apple;
        System.out.println("Apple "+ apple++);
        dragonfruit=--dragonfruit;
        System.out.println("Dragon Fruit " + dragonfruit);
        banana=++banana;
        System.out.println("Banana " +banana);
        cerry=--cerry;
        System.out.println("Cerry "+cerry);





    }




}
