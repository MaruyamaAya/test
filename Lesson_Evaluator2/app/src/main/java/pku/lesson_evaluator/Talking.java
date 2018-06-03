package pku.lesson_evaluator;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class Talking extends AppCompatActivity implements View.OnClickListener{

    private List<Talking_item> talkingItemList=new ArrayList<>();
    private EditText addWord;
    private Button sendWord;
    private String uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talking);
        android.support.v7.widget.Toolbar toolbar=findViewById(R.id.toolbar);
        toolbar.setTitle("课程讨论板");
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        getUid();
        initTalking();
        RecyclerView recyclerView=findViewById(R.id.talking_recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        TalkingAdapter adapter=new TalkingAdapter(talkingItemList);
        recyclerView.setAdapter(adapter);
        addWord=findViewById(R.id.add_word);
        sendWord=findViewById(R.id.send_word);
        sendWord.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.send_word:

        }
    }

    private void initTalking(){

    }

    private void getUid(){
        Intent intent=getIntent();
        //获得uid
    }
}
