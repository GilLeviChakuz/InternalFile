package com.example.user.internalfile;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InputStream is = openFileInput(read.txt);
        InputStreamReader=new BufferedReader(tmp);
        String str;
        StringBuffer buffer=new StringBuffer();
        while ((str=reader.readLine())!=null){
            buffer.append(str+"\n");

        }
        is.close();
    }
    openFileOutput(read, Context.MODE_PRIVATE);
    OutputStreamWriter osw=new OutputStreamWriter(fos);
    BufferedWriter bw= new BufferedWriter(osw);
    bw.write(st);
    bw.close();
}
