package myappsapps.com.registeractivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText et_name, et_email, et_phone, et_password, et_cpassword;
    String name, phone, password, cpassword, email;
    Button regButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_name = (EditText) findViewById(R.id.et1);
        et_email = (EditText) findViewById(R.id.et2);
        et_password = (EditText) findViewById(R.id.et3);
        et_cpassword = (EditText) findViewById(R.id.et4);
        et_phone = (EditText) findViewById(R.id.et5);
        regButton = (Button) findViewById(R.id.button);
        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });

    }

    public void register() {
        initialize();
        if (!validate()) {

            Toast.makeText(getApplicationContext(), "Sign up failed", Toast.LENGTH_LONG).show();
        } else {
            onSignupSuccess();
        }
    }

    public void onSignupSuccess() {

        //TODO next coding...

    }

    public boolean validate() {
        boolean valid = true;
        if (name.isEmpty() || name.length() > 20) {
            et_name.setError("Please enter valid name");
            valid = false;
        }
        if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            et_email.setError("Please enter valid email");
            valid = false;
        }
        if (password.isEmpty()) {

            et_password.setError("Please enter valid password");
            valid = false;

        }
        if (cpassword.isEmpty()) {
            et_cpassword.setError("Please enter valid confirm password");
            valid = false;
        }

        if (phone.isEmpty()) {

            et_phone.setError("Please enter valid phone number");
            valid = false;
        }
        return valid;
    }

    private void initialize() {
        name = et_name.getText().toString().trim();
        email = et_email.getText().toString().trim();
        password = et_password.getText().toString().trim();
        cpassword = et_cpassword.getText().toString().trim();
        phone = et_phone.getText().toString().trim();
    }


}
