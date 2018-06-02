package pku.lesson_evaluator;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class ClassAdapter extends RecyclerView.Adapter<ClassAdapter.ViewHolder>{
    
    private List<Class_item> mClassList;
    
    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView className;
        TextView classTeacher;
        TextView classScore;
        Button courseDetail;
        Button score;
        Button talking;
        mViewHolderClicks mListener;
        
        public ViewHolder(View itemView,mViewHolderClicks listener) {
            super(itemView);
            mListener=listener;
            className=itemView.findViewById(R.id.class_name);
            classTeacher=itemView.findViewById(R.id.class_teacher);
            classScore=itemView.findViewById(R.id.class_score);
            courseDetail=itemView.findViewById(R.id.course_detail);
            score=itemView.findViewById(R.id.score);
            talking=itemView.findViewById(R.id.talking);
            courseDetail.setOnClickListener(this);
            score.setOnClickListener(this);
            talking.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.course_detail:
                    //按照特定方式锁定
                    mListener.onCourseDetailClick(className.getText().toString()+"/"+classTeacher.getText().toString());
                    break;
                case R.id.score:
                    mListener.onScoreClick(className.getText().toString()+"/"+classTeacher.getText().toString());
                    break;
                case R.id.talking:
                    mListener.onTalkingClick(className.getText().toString()+"/"+classTeacher.getText().toString());
                    break;
                default:
                    break;
            }
        }
    }

    public ClassAdapter(List<Class_item> class_items){
        mClassList=class_items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.class_item,parent,false);
        ViewHolder holder=new ViewHolder(view, new mViewHolderClicks() {
            @Override
            public void onCourseDetailClick(String uid) {

            }

            @Override
            public void onScoreClick(String uid) {

            }

            @Override
            public void onTalkingClick(String uid) {

            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Class_item classItem=mClassList.get(position);
        holder.className.setText(classItem.getClassName());
        holder.classTeacher.setText(classItem.getClassTeacher());
        holder.classScore.setText(classItem.getClassScore());
    }

    @Override
    public int getItemCount() {
        return mClassList.size();
    }

    private interface mViewHolderClicks{
        public void onCourseDetailClick(String uid);
        public void onScoreClick(String uid);
        public void onTalkingClick(String uid);
    }
}
