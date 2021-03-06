package com.example.david.imkproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;


/**
 * Created by David on 5/28/2017.
 */

public class Binary_converter extends Fragment {

    private EditText txtBinary;
    private EditText txtDecimal;
    private EditText txtHexa;
    private EditText txtOctal;
    private Button btnConvert;
    private Button btnClear;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.binary_converter, container, false);

        txtBinary = (EditText) view.findViewById(R.id.binary);
        txtOctal = (EditText)view.findViewById(R.id.octal);
        txtDecimal = (EditText)view.findViewById(R.id.decimal);
        txtHexa = (EditText)view.findViewById(R.id.hexa);
        btnConvert = (Button)view.findViewById(R.id.convert);
        btnClear = (Button)view.findViewById(R.id.clear);


        btnConvert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (txtBinary.length() == 0) {
                    Toast.makeText(getActivity(), "Kolom Biner harus diisi untuk memulai Konversi", Toast.LENGTH_LONG).show();
                } else {
                    try
                    {
                        String str0 = txtBinary.getText().toString();
                        int i = Integer.parseInt(str0, 2);
                        txtDecimal.setText(String.valueOf(i));
                        String str1 = Integer.toString(Integer.parseInt(str0, 2), 8);
                        txtOctal.setText(String.valueOf(str1));
                        String str2 = Integer.toString(Integer.parseInt(str0, 2), 16);
                        txtHexa.setText(String.valueOf(str2));
                        return;
                    } catch (Exception localException) {
                        while (true)
                            localException.printStackTrace();
                    }
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txtBinary.setText("");
                txtDecimal.setText("");
                txtHexa.setText("");
                txtOctal.setText("");
            }
        });
        return view;
    }
}

