package codewars;

public class GhostCode {

    public static String helloName(final String name){
        if(name == null || name.equals("dump"))
            return "Hello world!";
        else
            return "Hello my name is " + name;
    }

}
