import java.io.*;
public class CmdLineArgsDemoV3 extends Object {
    public static void main(String[] args ){
        CmdLineArgsDemoV3 Obj=new CmdLineArgsDemoV3();
    if(args.length!=2) {
        System.out.println("Invaild numbers of arguments \n You need to pass two integers");
    }
    else {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = x+y;
        System.out.println("The class name is : " + Obj.getClass());
        System.out.println(" Sum of " + x + " and " + y + " is " + z);
    }
    }   
}
