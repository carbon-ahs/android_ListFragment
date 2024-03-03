package com.axiagroups.listfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import com.axiagroups.listfragment.data.Course;
import com.axiagroups.listfragment.data.CourseArrayAdaptor;
import com.axiagroups.listfragment.data.CourseData;

import java.util.List;

public class MyFragment extends ListFragment {
    List<Course> courses = new CourseData().courseList();
    public MyFragment(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CourseArrayAdaptor adaptor = new CourseArrayAdaptor(getActivity(),
                R.layout.course_listitem, courses);

        setListAdapter(adaptor);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.my_fragment, container,false);
        return view;
    }
}
