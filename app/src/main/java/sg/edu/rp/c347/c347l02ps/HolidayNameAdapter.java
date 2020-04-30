package sg.edu.rp.c347.c347l02ps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayNameAdapter extends ArrayAdapter {
    private ArrayList<Holiday> holiday;
    private Context context;
    private TextView tvHolidayname;
    private ImageView ivHoliday;

    public HolidayNameAdapter(Context context, int resource, ArrayList<Holiday> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        holiday = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.rownames, parent, false);

        // Get the TextView object

        tvHolidayname = (TextView) rowView.findViewById(R.id.tvHolidayName);
        ivHoliday = (ImageView) rowView.findViewById(R.id.ivHoliday);

        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Holiday currentHoliday = holiday.get(position);
        // Set the TextView to show the food

        tvHolidayname.setText(currentHoliday.getHolName() + "\n" + currentHoliday.getDate());

        if(currentHoliday.getHolType().equals("Secular")){
            if (position == 0) {
                ivHoliday.setImageResource(R.drawable.pop);
            }else if(position == 1){
                ivHoliday.setImageResource(R.drawable.labour);
            }else{
                ivHoliday.setImageResource(R.drawable.sg);
            }
        }
        else if(currentHoliday.getHolType().equals("Ethnic & Religion")){
            if (position == 0) {
                ivHoliday.setImageResource(R.drawable.cny);
            }if (position == 1) {
                ivHoliday.setImageResource(R.drawable.goodfriday);
            }if (position == 2) {
                ivHoliday.setImageResource(R.drawable.vesak);
            }if (position == 3) {
                ivHoliday.setImageResource(R.drawable.puasa);
            }if (position == 4) {
                ivHoliday.setImageResource(R.drawable.haji);
            }if (position == 5) {
                ivHoliday.setImageResource(R.drawable.diwali);
            }if (position == 6) {
                ivHoliday.setImageResource(R.drawable.christmas);
            }
        }

        // Return the nicely done up View to the ListView
        return rowView;
    }
}
