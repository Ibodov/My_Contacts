package ibodov.smile.contacts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutContactActivity extends AppCompatActivity {

    public static final String CONTACT_ID = "contact_id";
    public static final String CONTACT_NAME = "contact_name";
    public static final String CONTACT_NUMBER = "contact_number";
    public static final String CONTACT_EMAIL = "contact_email";

    private TextView nameTextView;
    private TextView numberTextView;
    private TextView emailTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_aboutcontact);

        nameTextView = findViewById(R.id.nameLastName);
        numberTextView = findViewById(R.id.number);
        emailTextView = findViewById(R.id.tv_email);

        Intent intent = getIntent();
        String name = intent.getStringExtra(CONTACT_NAME);
        String number = intent.getStringExtra(CONTACT_NUMBER);
        String email = intent.getStringExtra(CONTACT_EMAIL);

        nameTextView.setText(name);
        numberTextView.setText(number);
        emailTextView.setText(email);

    }



}
