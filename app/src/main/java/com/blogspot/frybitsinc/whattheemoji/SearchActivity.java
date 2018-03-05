package com.blogspot.frybitsinc.whattheemoji;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {
    private Button btn_emoji_search;
    private EditText editText_emoji_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        editText_emoji_input = (EditText) findViewById(R.id.editText_emoji_input);
        btn_emoji_search = (Button) findViewById(R.id.btn_emoji_search);
        btn_emoji_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //parse emoji to code point
                String input = editText_emoji_input.getText().toString();
                Toast.makeText(SearchActivity.this, input, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
