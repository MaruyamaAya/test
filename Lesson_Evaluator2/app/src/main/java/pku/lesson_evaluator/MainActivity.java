package pku.lesson_evaluator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Class_item> classItemList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view=View.inflate(this,R.layout.toolbar,null);
        android.support.v7.widget.Toolbar toolbar=view.findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("project主界面");
        initClassItems();
        RecyclerView recyclerView=findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        ClassAdapter adapter =new ClassAdapter(classItemList);
        recyclerView.setAdapter(adapter);
    }

    private void initClassItems(){
        //写入初始化（需要具体数据）
    }
}
