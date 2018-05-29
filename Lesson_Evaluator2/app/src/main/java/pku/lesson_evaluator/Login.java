package pku.lesson_evaluator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        View view=View.inflate(this,R.layout.toolbar,null);
        android.support.v7.widget.Toolbar toolbar=view.findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
