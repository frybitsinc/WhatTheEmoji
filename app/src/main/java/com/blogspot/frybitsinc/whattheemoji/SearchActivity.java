package com.blogspot.frybitsinc.whattheemoji;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {
    private Button btn_emoji_search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        btn_emoji_search = (Button) findViewById(R.id.btn_emoji_search);
        btn_emoji_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //parse emoji to code point
            }
        });
    }
}
