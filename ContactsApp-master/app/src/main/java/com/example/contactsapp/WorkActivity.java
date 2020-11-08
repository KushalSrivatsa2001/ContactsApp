package com.example.contactsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WorkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        final List<ContactModel> work = new ArrayList<>();
        work.add(new ContactModel("Ramesh","ramesh564@og.in","8796321540",R.drawable.contact));
        work.add(new ContactModel("Akshay","akshay124@og.in","9654321589",R.drawable.contact));
        work.add(new ContactModel("Param","param9865@og.in","7654312587",R.drawable.contact));
        work.add(new ContactModel("Preethi","preethi@og.in","6361458896",R.drawable.contact));
        work.add(new ContactModel("Keerthan","keerthan04@og.in","8286242546",R.drawable.contact));
        work.add(new ContactModel("Ananya","Ananya675@og.in","9865231580",R.drawable.contact));
        work.add(new ContactModel("Tejashwini","teju25@og.in","8282482546",R.drawable.contact));
        work.add(new ContactModel("Vishwas","vishwas23@og.in","7863254580",R.drawable.contact));


        RecyclerView work_recyclerView = findViewById(R.id.RecyclerView3);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        work_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter = new ContactAdapter(this,work,R.color.work_color);
        work_recyclerView.setAdapter(contactAdapter);

    }




}