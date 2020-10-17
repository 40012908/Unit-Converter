package com.lnt.mynavigationdrawer;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link sharedP#newInstance} factory method to
 * create an instance of this fragment.
 */
public class sharedP extends Fragment {
    SharedPreferences sharedPreferences;
    EditText name;
    EditText email;
    Button save_d;
    Button retrive_d;
    Button clear_d;
    public static final String mypreference="mypref";
    public static final String Name="nameKey";
    public static final String Email="emailKey";


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public sharedP() {
        // Required empty public constructor
    }

    public static sharedP newInstance(String param1, String param2) {
        sharedP fragment = new sharedP();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            sharedPreferences=getActivity().getSharedPreferences(mypreference, Context.MODE_PRIVATE);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root =inflater.inflate(R.layout.fragment_shared_p, container, false);
        // Inflate the layout for this fragment
        name=(EditText)root.findViewById(R.id.name_et);
        email=(EditText)root.findViewById(R.id.emailid_et);
        save_d=(Button)root.findViewById(R.id.save);
        retrive_d=(Button)root.findViewById(R.id.retrive);
        clear_d=(Button)root.findViewById(R.id.clear);

        sharedPreferences=getActivity().getSharedPreferences(mypreference,Context.MODE_PRIVATE);
        if(sharedPreferences.contains(Name)){
            name.setText(sharedPreferences.getString(Name,""));
        }
        if(sharedPreferences.contains(Email)){
            email.setText(sharedPreferences.getString(Email,""));
        }

        save_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = name.getText().toString();
                String e = email.getText().toString();
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString(Name,n);
                editor.putString(Email,e);
                editor.commit();
            }
        });
        clear_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=(EditText)getView().findViewById(R.id.name_et);
                email=(EditText)getView().findViewById(R.id.emailid_et);
                name.setText("");
                email.setText("");
            }
        });

        retrive_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=(EditText)getView().findViewById(R.id.name_et);
                email=(EditText)getView().findViewById(R.id.emailid_et);
                sharedPreferences=getActivity().getSharedPreferences(mypreference,Context.MODE_PRIVATE);
                if(sharedPreferences.contains(Name)){
                    name.setText(sharedPreferences.getString(Name,""));
                }
                if(sharedPreferences.contains(Email)){
                    email.setText(sharedPreferences.getString(Email,""));
                }
            }
        });

        return root;

    }
}