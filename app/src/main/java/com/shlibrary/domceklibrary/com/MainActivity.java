package com.shlibrary.domceklibrary.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.shebang.shebangrate.windowlibrary.WindowBox;
import com.shebang.shebangrate.windowlibrary.WindowProvider;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<WindowBox> windowBoxList = WindowProvider.parse("moje okienko");

    }
}
