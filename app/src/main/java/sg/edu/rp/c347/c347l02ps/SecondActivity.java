package sg.edu.rp.c347.c347l02ps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<Holiday> Holiday;
    TextView tvName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Holiday = new ArrayList<Holiday>();
        Intent intent = getIntent();
        String holidayType = intent.getStringExtra("type");

        lv = (ListView) this.findViewById(R.id.lvHolidayNames);
        tvName = (TextView) this.findViewById(R.id.tvHolidayTypeName);
        tvName.setText(holidayType);
        // Create a few food objects in Food array

        if(holidayType.equals("Secular")){
            Holiday.add(new Holiday("Secular","New Years Day","1 Jan 2020"));
            Holiday.add(new Holiday("Secular","Labour Day","1 May 2020"));
            Holiday.add(new Holiday("Secular","National Day","9 Aug 2020"));

        }else if(holidayType.equals("Ethnic & Religion")){
            Holiday.add(new Holiday("Ethnic & Religion","Chinese new year","28 - 29 Jan 2020"));
            Holiday.add(new Holiday("Ethnic & Religion","Good Friday","14 Apr 2020"));
            Holiday.add(new Holiday("Ethnic & Religion","Vesak day","7 May 2020"));
            Holiday.add(new Holiday("Ethnic & Religion","Hari Raya Puasa","24 May 2020"));
            Holiday.add(new Holiday("Ethnic & Religion","Hari Raya Haji","31 July 2020"));
            Holiday.add(new Holiday("Ethnic & Religion","Deepavali","24 May 2020"));
            Holiday.add(new Holiday("Ethnic & Religion","Christmas","25 Dec 2020"));
        }

        aa = new HolidayNameAdapter(this,R.layout.rownames,Holiday);
        lv.setAdapter(aa);
    }
}
