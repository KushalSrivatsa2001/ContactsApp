package com.example.contactsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final List<ContactModel> family = new ArrayList<>();
        family.add(new ContactModel("Rohan","roh12@og.in","9865324782",R.drawable.contact));
        family.add(new ContactModel("Nagaraj","nagraj87@og.in","9242463879",R.drawable.contact));
        family.add(new ContactModel("Keshava","keshava124@og.in","8765418937",R.drawable.contact));
        family.add(new ContactModel("Indu","indur@og.in","7985632154",R.drawable.contact));
        family.add(new ContactModel("Krishna","Krish765@og.in","8845536214",R.drawable.contact));
        family.add(new ContactModel("Anand","anand431@og.in","9985564724",R.drawable.contact));
        family.add(new ContactModel("Gururaj","guru673@og.in","8547132564",R.drawable.contact));
        family.add(new ContactModel("Asha","Asha1234@og.in","9345478460",R.drawable.contact));


        RecyclerView family_recyclerView = findViewById(R.id.RecyclerView1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        family_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter = new ContactAdapter(this,family,R.color.family_color);
        family_recyclerView.setAdapter(contactAdapter);
    }


}