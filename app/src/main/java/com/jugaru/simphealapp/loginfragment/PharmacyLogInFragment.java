package com.jugaru.simphealapp.loginfragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.jugaru.simphealapp.MainActivity;
import com.jugaru.simphealapp.PreLogInActivity;
import com.jugaru.simphealapp.R;

public class PharmacyLogInFragment extends Fragment {

    private EditText name,password;
    private Button login;
    private TextView register;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pharmacy_log_in, container, false);
        name=(EditText)view.findViewById(R.id.username);
        password=(EditText)view.findViewById(R.id.password);
        login=(Button) view.findViewById(R.id.btn_login);
        register=(TextView) view.findViewById(R.id.register_btn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(name.getText().toString(),password.getText().toString());


            }
        });
        return view;
    }
    public void validate(String etname,String etpassword){
        if ((etname=="abc")&&(etpassword=="1234")){

            Intent intent = new Intent(getActivity(), MainActivity.class);
            startActivity(intent);

        }
        else {

            if((etname=="abc")&&(etpassword!="1234")){

                Toast.makeText(getActivity(), "incorrect password",Toast.LENGTH_SHORT).show();
            }else {

                Toast.makeText(getActivity(), "please enter the username and password",Toast.LENGTH_LONG).show();
            }
        }


    }


}