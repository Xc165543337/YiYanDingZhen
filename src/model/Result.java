package model;

import org.jetbrains.annotations.NotNull;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/**
 * @author Xc165543337
 * @date 2022.10.26
 */

public class Result {

    private static Random rand = null;

    private Integer result;
    public Result() {
        try {
            rand = SecureRandom.getInstanceStrong();
            result = rand.nextInt(2);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }


    public @NotNull String showResult()
    {
        return result == 1 ? "鉴定为真" : "鉴定为假" ;
    }
}
