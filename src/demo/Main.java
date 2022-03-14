package demo;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

/**
 * @author Xc165543337
 * @date 2022.3.14
 */

public class Main {

    private static final Random RANDOM = new Random();

    public static int random()
    {
        return RANDOM.nextInt(2);
    }

    public static @NotNull
    String yiyandingzhen()
    {
        return random() == 1 ? "鉴定为真" : "鉴定为假" ;
    }

    public static void main(String[] args)
    {
        System.out.println("疑验丁真" + "\n" + yiyandingzhen());
    }
}
