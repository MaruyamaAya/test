package pku.lesson_evaluator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Class extends AppCompatActivity {

    //用于识别
    private String uid;
    TextView courseName;
    TextView Teacher;
    TextView courseId;
    TextView englishName;
    TextView advancedPlacement;
    TextView chineseIntroduction;
    TextView englishIntroduction;
    TextView college;
    TextView field;
    TextView isArtPe;
    TextView platformClassNature;
    TextView platformClassType;
    TextView language;
    TextView textbook;
    TextView reference;
    TextView syllabus;
    TextView evaluation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);
        courseName=findViewById(R.id.course_name);
        Teacher=findViewById(R.id.teacher);
        courseId=findViewById(R.id.course_id);
        englishName=findViewById(R.id.english_name);
        advancedPlacement=findViewById(R.id.advanced_placement);
        chineseIntroduction=findViewById(R.id.chinese_introduction);
        englishIntroduction=findViewById(R.id.english_introduction);
        college=findViewById(R.id.college);
        field=findViewById(R.id.field);
        isArtPe=findViewById(R.id.is_art_pe);
        platformClassNature=findViewById(R.id.platform_class_nature);
        platformClassType=findViewById(R.id.platform_class_type);
        language=findViewById(R.id.language);
        textbook=findViewById(R.id.textbook);
        reference=findViewById(R.id.reference);
        syllabus=findViewById(R.id.syllabus);
        evaluation=findViewById(R.id.evaluation);
        getUid();
        getContentText();
    }

    private void getUid(){

    }

    private void getContentText(){

    }
}
