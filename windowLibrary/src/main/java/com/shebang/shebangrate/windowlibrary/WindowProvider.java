package com.shebang.shebangrate.windowlibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WindowProvider {

    public static List<WindowBox> parse(String windowName){
        List<WindowBox> list = new ArrayList<>();
        Random r = new Random();
        // random number of item but at least 5
        Integer number = r.nextInt(10) + 5;
        for (int i = 0; i < number; i++) {
            // create sample data
            String s = String.valueOf(r.nextInt(1000));
            WindowBox windowBox = new WindowBox("Summary " + s, "Description " + s);
            list.add(windowBox);
        }
        return list;
    }

}
