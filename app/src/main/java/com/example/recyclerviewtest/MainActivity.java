package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<MailModel> mailModels = new ArrayList<>();
    int[] image = {R.drawable.baseline_account_balance_24, R.drawable.baseline_account_circle_24,R.drawable.baseline_anchor_24,
            R.drawable.baseline_attachment_24,R.drawable.baseline_class_24,R.drawable.baseline_cloud_upload_24,R.drawable.baseline_co_present_24,
            R.drawable.baseline_contact_emergency_24,R.drawable.baseline_duo_24, R.drawable.ic_baseline_announcement_24};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.mRecycleView);
        Mail_Adapter adapter = new Mail_Adapter(this, mailModels);
        onCreateMailRow();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    public void onCreateMailRow(){
        String[] mailHeader = getResources().getStringArray(R.array.mailHeader);
        String[] mailInfo = getResources().getStringArray(R.array.mailInfo);
        for(int i = 0; i<mailHeader.length; i++){
            mailModels.add(new MailModel(mailHeader[i], mailInfo[i],image[i]));
        }
    }
}