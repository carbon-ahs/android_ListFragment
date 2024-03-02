package com.axiagroups.listfragment.data;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.axiagroups.listfragment.R;

import java.util.List;

public class CourseArrayAdaptor extends ArrayAdapter<Course> {
    private Context context;
    private List<Course> courses;
    public CourseArrayAdaptor(@NonNull Context context, int resource, List<Course> courses) {
        super(context, resource, courses);
        this.courses = courses;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);
        Course course = courses.get(position);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.course_listitem, null);

        ImageView imageView = (ImageView) view.findViewById(R.id.courseImage);
        imageView.setImageResource(course.getImageResourceId(context));

        TextView textView = view.findViewById(R.id.courseNameTV);
        textView.setText(course.getCourseName());

        return view;
    }
}
