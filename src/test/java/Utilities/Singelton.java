package Utilities;

public class Singelton {
    private  static String str;
    private  Singelton(){}

    public static String get(){
        if(str==null){
            System.out.println("adding value");
            str="abcdefgej";

        }
        return str;
    }
}
