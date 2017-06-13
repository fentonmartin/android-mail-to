package fen.code.androidmailto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button buttonSend;
    EditText editEmail, editSubject, editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSend = (Button) findViewById(R.id.button_send);
        editEmail = (EditText) findViewById(R.id.edit_email);
        editSubject = (EditText) findViewById(R.id.edit_subject);
        editText = (EditText) findViewById(R.id.edit_text);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
