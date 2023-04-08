package day06_tasks;

public class Pizza {

    //Task:
    //add main method
    //declare two variables and assign
    //pizza = "cheese"
    //pizza slices = 8
    //people = 4
    //calculate the slices per
    //person
    //Example output:
    //We ordered cheese pizza
    //with 8 slices, 4 people ate 2 slices each
    public static void main(String[] args) {
        String pizza = "cheese";
        byte slices = 8;
        byte people = 4;
        int slicesforPerson = slices/people;
        System.out.println("We ordered" + pizza+ " pizza with " +slices+ " slices ," +people + " people ate " +slicesforPerson+ " slices each.");



    }





}
