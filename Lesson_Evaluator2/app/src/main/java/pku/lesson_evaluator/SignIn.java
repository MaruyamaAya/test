package pku.lesson_evaluator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        View view=View.inflate(this,R.layout.toolbar,null);
        android.support.v7.widget.Toolbar toolbar=view.findViewById(R.id.toolbar);
        toolbar.setTitle("注册");
        setSupportActionBar(toolbar);
    }
}