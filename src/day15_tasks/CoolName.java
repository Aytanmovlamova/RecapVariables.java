package day15_tasks;

public class CoolName {
    public static void main(String[] args) {

        //   		Declare a variable name. You will check if it is a cool name.
        //        		-If the name begins with an ‘a’ or a ‘z’ print “Your name is cool”
        //        		-If the name ends with 'm' print "Almost cool"
        //        		-Otherwise print “Sorry not a cool name”
        String name= "Aytan";
        name=name.toLowerCase();
        if (name.startsWith("a")||name.startsWith("z")){
            System.out.println("Your name is cool");


        } else if (name.endsWith("m")) {

        }else{
            System.out.println("sorry not a cool name");
        }


    }
}
