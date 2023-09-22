package com.example.buttonclickcounter;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.os.Bundle;
public class button extends AppCompatActivity {
    TextView myTextView;
    Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        myTextView = findViewById(R.id.textView);
        myButton = findViewById(R.id.button);
        myButton.setOnClickListener(oMyButton);
    }
    View.OnClickListener oMyButton = new View.OnClickListener() {
        int counter = 0;
        @Override
        public void onClick(View view) {
        myTextView.setText(String.valueOf(++counter));
        }
    };
}