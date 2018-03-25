package com.example.android.inclassassignment04_yanranw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t = (TextView) findViewById(R.id.input_text);
        output = (TextView) findViewById(R.id.output);
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast t = Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT);
        t.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
        t.show();
    }


    public void copy(View view) {
        output.setText(t.getText());
        output.setTextSize(12);
    }

    public void doubleIt(View view) {
        String a;
        a = output.getText().toString();
        output.setText(a + a);
    }

    public void up(View view) {
        int n = (int) output.getTextSize();
        output.setTextSize(n + 1);
    }

    public void down(View view) {
        int n = (int) output.getTextSize();
        output.setTextSize(n - 1);
        if (n <= 1) {
            output.setTextSize(1);
        } else {
            output.setTextSize(n - 1);
        }

    }
}
