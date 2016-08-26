package pl.com.bernas.sonar.stash.test.lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by kirkor on 8/26/2016.
 */
public class DummyService {
    /**
     * Default constructor
     */
    public DummyService() throws FileNotFoundException {
        // lets make some sonar errors
        if(true == true) {
            System.out.println("Foo bar");
        }

        new FileInputStream("/");
    }
}
