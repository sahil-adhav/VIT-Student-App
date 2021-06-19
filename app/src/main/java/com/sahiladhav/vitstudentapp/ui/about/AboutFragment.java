package com.sahiladhav.vitstudentapp.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.sahiladhav.vitstudentapp.R;

import java.util.ArrayList;
import java.util.List;


public class AboutFragment extends Fragment {

    private ViewPager viewPager;
    private BranchAdapter adapter;
    private DebtAdapter adapterr;
    private List<BranchModel> list;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_about, container, false);

        list = new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_comp, "Computer Science", "Vishwakarma Institute of Technology started undergraduate course in Computer Engineering in 1991 and postgraduate course in 2001. The Doctoral Program in Computer Engineering has been introduced from the academic year 2011.\n\nFEES : 179000 INR/-"));
        list.add(new BranchModel(R.drawable.ic_mech, "Mechanical Engineering", "Vishwakarma Institute of Technology started undergraduate course in Mechanical Engineering in 1986 and postgraduate course in 1998. The Doctoral Program in Mechanical Engineering has been introduced from the academic year 2007.\n\nFEES : 149000 INR/-"));
        list.add(new BranchModel(R.drawable.ic_mech, "Electrical Engineering", "Vishwakarma Institute of Technology started undergraduate course in Electronics Engineering in 1985. Department of Electronics Engineering is one of the best and oldest department of Vishwakarma Institute of Technology.\n\nFEES : 179000 INR/-"));
        list.add(new BranchModel(R.drawable.ic_mech, "Instrumentation Engineering", "Vishwakarma Institute of Technology started undergraduate course in Instrumentation Engineering in 1992 and postgraduate course in 2004. The Doctoral Program in Instrumentation Engineering has been introduced from the academic year 2010.\n\nFEES : 129000 INR/-"));
        list.add(new BranchModel(R.drawable.ic_mech, "Chemical Engineering", "Vishwakarma Institute of Technology started undergraduate course in Chemical Engineering in 1999 and postgraduate course in 2009. The Doctoral Program in Chemical Engineering has been introduced from the academic year 2004.\n\n FEES : 119000 INR/-"));
        list.add(new BranchModel(R.drawable.ic_mech, "Production Engineering", "Vishwakarma Institute of Technology started undergraduate course in Industrial Engineering in 1984, Production Engineering in 1999 and postgraduate course in Industrial Engineering in 2004.\n\nFEES : 119000 INR/-"));
        list.add(new BranchModel(R.drawable.ic_mech, "Artificial Intelligence and Data Science", "Vishwakarma Institute of Technology started undergraduate course in Artificial Intelligence and Data Science (AI&DS) in 2020. \n\nFEES : 199000 INR/-"));

        adapter = new BranchAdapter(getContext(), list);

        viewPager = view.findViewById(R.id.viewPager);

        viewPager.setAdapter(adapter);

        list = new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_comp, "DEPARTMENT OF MECHANICAL ENGINEERING", "UG Program Intake - 240 (Second Shift: 60)\n\nPG program Intake - Heat Power Engineering : 18\nDesign Engineering : 25\n\nResearch Program - Ph.D. (Mechanical Engineering)"));
        list.add(new BranchModel(R.drawable.ic_mech, "DEPARTMENT OF COMPUTER ENGINEERING", "UG Program Intake - 240 (Second shift:60)\n\nPG program Intake - 25\n\nResearch Program - Ph.D. (Computer Engineering)"));
        list.add(new BranchModel(R.drawable.ic_mech, "DEPARTMENT OF ELECTRONICS ENGINEERING", "UG Program Intake - 120 (Second Shift – 60)\n\nPG program Intake - 18\n\nResearch Program - Ph.D"));
        list.add(new BranchModel(R.drawable.ic_mech, "DEPARTMENT OF INSTRUMENTATION ENGINEERING", "UG Program Intake - 180\n\nPG program Intake - 18\n\nResearch Program - Ph.D. (Instrumentation and Control Engineering)"));
        list.add(new BranchModel(R.drawable.ic_mech, "DEPARTMENT OF CHEMICAL ENGINEERING", "UG Program Intake - 60\n\nPG program Intake - 18\n\nResearch Program - Ph.D"));
        list.add(new BranchModel(R.drawable.ic_mech, "DEPARTMENT OF INDUSTRIAL & PRODUCTION ENGINEERING", "UG Program Intake - : Industrial: 60, Production:60\n\nPG program Intake - 18\n\nResearch Program - Ph.D. (Industrial Engineering)"));
        list.add(new BranchModel(R.drawable.ic_mech, "DEPARTMENT OF INFORMATION TECHNOLOGY", "UG Program Intake - 60\n\nPG Program Intake - 60"));

        adapterr = new DebtAdapter(getContext(), list);

        viewPager = view.findViewById(R.id.viewPager2);

        viewPager.setAdapter(adapterr);

        list = new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_comp, "IEEE", "The IEEE is Institute of Electrical and Electronics Engineers.  IEEE at VIT aims at educational and technical advancement of electrical and electronic engineering, telecommunications, computer engineering and allied disciplines. "));
        list.add(new BranchModel(R.drawable.ic_mech, "SAE", "SAE, the Society of Automotive Engineers in VIT lays principal emphasis on automotive, aerospace, and commercial vehicles. The SAE team of VIT, Pune has many national awards to its credit."));
        list.add(new BranchModel(R.drawable.ic_mech, "The Robotics Forum", "The Robotics Forum is a group of dedicated individuals, right from First Year to Final Year, undergraduates to Professors and HODs working passionately in the field of Robotics to take the college to new heights in this field."));
        //list.add(new BranchModel(R.drawable.ic_mech, "", ""));
        //list.add(new BranchModel(R.drawable.ic_mech, "", ""));
        //list.add(new BranchModel(R.drawable.ic_mech, "", ""));
        //list.add(new BranchModel(R.drawable.ic_mech, "", ""));

        adapterr = new DebtAdapter(getContext(), list);

        viewPager = view.findViewById(R.id.viewPager3);

        viewPager.setAdapter(adapterr);



        ImageView imageView = view.findViewById(R.id.college_image);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/vishwakarma-institute.appspot.com/o/gallery%2F%5BB%40daa815fjpg?alt=media&token=1808b26c-9396-4e84-aedf-870047b27c50")
                .into(imageView);


        return  view;
    }
}