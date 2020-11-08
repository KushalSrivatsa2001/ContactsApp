package com.example.contactsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FriendsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        final List<ContactModel> friends = new ArrayList<>();
        friends.add(new ContactModel("Vasudeva","vasudev246@oog.in","9342478896",R.drawable.contact));
        friends.add(new ContactModel("Charles","Charles4889@og.in","8765942315",R.drawable.contact));
        friends.add(new ContactModel("Hriday","hriday03@og.in","9900388654",R.drawable.contact));
        friends.add(new ContactModel("Pranav","rao261@og.in","8142654782",R.drawable.contact));
        friends.add(new ContactModel("Rakesh","rusteze@og.in","8971236547",R.drawable.contact));
        friends.add(new ContactModel("Nagsharan","sharan231@og.in","8147654832",R.drawable.contact));
        friends.add(new ContactModel("Tejas","teju21@og.in","8974632150",R.drawable.contact));
        friends.add(new ContactModel("Harshith","harshithk79@og.in","7896532145",R.drawable.contact));
        friends.add(new ContactModel("Arjun","arjuna765@og.in","8564789650",R.drawable.contact));

        RecyclerView friends_recyclerView = findViewById(R.id.RecyclerView2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        friends_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter = new ContactAdapter(this,friends,R.color.friends_color);
        friends_recyclerView.setAdapter(contactAdapter);
    }
}