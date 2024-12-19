package com.example.myapplication;

import static com.example.myapplication.R.id.line_e;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class LawyerDetails extends AppCompatActivity {
    private String[][] LawyerDetails1=
            {
                    {"Lawyer Name : Babulal apte","PP : Indore","exp : 15yrs","Mobile No:9090909090","800"},
                    {"Lawyer Name : Hinata Jain","PP : Jabalpur","exp : 6yrs","Mobile No:09238492340","500"},
                    {"Lawyer Name : Goku Singh","PP : Seoni","exp : 10yrs","Mobile No:9090909090","600"},
                    {"Lawyer Name : Kageyama Parmar","PP : Nagpur","exp : 25yrs","Mobile No:9090909090","1000"},
                    {"Lawyer Name : Itachi Sharma","PP : Indore","exp : 1yrs","Mobile No:9090909090","350"}
            };

    private String[][] LawyerDetails2=
            {
                    {"Lawyer Name : Sakura Kapoor","PP : Bhopal","exp : 8yrs","Mobile No:0987654321","750"},

                    {"Lawyer Name : Vegeta Gupta","PP : Gwalior","exp : 12yrs","Mobile No:9876543210","900"},

                    {"Lawyer Name : Sasuke Patel","PP : Ujjain","exp : 4yrs","Mobile No:9876541230","400"},

                    {"Lawyer Name : Naruto Verma","PP : Jabalpur","exp : 20yrs","Mobile No:7654321098","1100"},

                    {"Lawyer Name : Luffy Choudhury","PP : Raipur","exp : 5yrs","Mobile No:8765432109","600"}
            };

    private String[][] LawyerDetails3=
            {
                    {"Lawyer Name : Zoro Pandey", "PP : Bhopal", "exp : 9yrs", "Mobile No:9876543210", "800"},

                    {"Lawyer Name : Bulma Sharma", "PP : Gwalior", "exp : 11yrs", "Mobile No:9876541230", "950"},

                    {"Lawyer Name : Todoroki Yadav", "PP : Ujjain", "exp : 3yrs", "Mobile No:7654321098", "450"},

                    {"Lawyer Name : Deku Singh", "PP : Jabalpur", "exp : 22yrs", "Mobile No:8765432109", "1200"},

                    {"Lawyer Name : Nami Khanna", "PP : Raipur", "exp : 7yrs", "Mobile No:9876543210", "700"},
            };
    private String[][] LawyerDetails4=
            {

                    {"Lawyer Name : L Lawliet","PP : Bhopal","exp : 14yrs","Mobile No:9876541230","1100"},

                    {"Lawyer Name : Misa Amane","PP : Gwalior","exp : 2yrs","Mobile No:7654321098","350"},

                    {"Lawyer Name : Light Yagami","PP : Ujjain","exp : 18yrs","Mobile No:8765432109","1000"},

                    {"Lawyer Name : Inuyasha Kumar","PP : Jabalpur","exp : 9yrs","Mobile No:9876543210","800"},

                    {"Lawyer Name : Kagome Sharma","PP : Raipur","exp : 6yrs","Mobile No:9876541230","700"},
            };


    TextView tv;
    Button btn;

    String[][] LawyerDetails={};
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lawyer_details2);

        tv= findViewById(R.id.TextLawyerDetailTitle);
        btn=findViewById(R.id.buttonLawyerDetail);

        Intent it= getIntent();
        String title= it.getStringExtra("title");
        tv.setText(title);

        if(title.compareTo("Business Lawyers")==0)
            LawyerDetails=LawyerDetails1;
        else if(title.compareTo("Constitutional Lawyers")==0)
            LawyerDetails=LawyerDetails2;
        else if(title.compareTo("Criminal Lawyers")==0)
            LawyerDetails=LawyerDetails3;
        else
            LawyerDetails=LawyerDetails4;



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LawyerDetails.this, FindLawyersOnlyActivity.class));
            }
        });

        list=new ArrayList();
        for(int i=0;i<LawyerDetails.length;i++){
            item=new HashMap<String,String>();
            item.put("line_a",LawyerDetails[i][0]);
            item.put("line_b",LawyerDetails[i][1]);
            item.put("line_c",LawyerDetails[i][2]);
            item.put("line_d",LawyerDetails[i][3]);
            item.put("line_e","Cons. Fees : "+LawyerDetails[i][4]+"/-");
            list.add(item);

        }
        sa = new SimpleAdapter(this,list,
                R.layout.multi_lines,
                new String[]{"line_a","line_b","line_c","line_d","line_e"},
        new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e});
        ListView lst= findViewById(R.id.listViewLawyerDetail);
        lst.setAdapter(sa);

    }
}