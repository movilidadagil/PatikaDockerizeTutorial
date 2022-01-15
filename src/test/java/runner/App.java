package runner;

import org.junit.runner.JUnitCore;

public class App {

    public static void main(String[] args){
        JUnitCore.main(RunCuke.class.getCanonicalName());
    }
}
