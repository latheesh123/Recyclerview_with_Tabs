package virupakshi.latheesh.com.week2;

import android.Manifest;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by latheeshvirupakshi on 3/21/17.
 */

public class Fragment2 extends android.support.v4.app.Fragment {

    private SeekBar seekBar;
    private ImageView imageView;
    int MY_PERMISSIONS_REQUEST_READ_CONTACTS=20;

    public Fragment2()
    {

    }

    public static Fragment2 newInstance() {
        Fragment2 fragment2 = new Fragment2();
        Bundle args = new Bundle();
        fragment2.setArguments(args);
        return fragment2;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.tab2, container, false);



        imageView=(ImageView)v.findViewById(R.id.image);



        seekBar=(SeekBar)v.findViewById(R.id.seekbar);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {




            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {



                Snackbar snackbar = Snackbar
                        .make(getView(), "Enable The Permissions", Snackbar.LENGTH_LONG)
                        .setAction("Ok", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Snackbar snackbar1 = Snackbar.make(getView(), "Message is restored!", Snackbar.LENGTH_SHORT);
                                snackbar1.show();
                            }
                        });

                snackbar.show();



                final Class drawableClass = R.drawable.class;
                final Field[] fields = drawableClass.getFields();


                final Random rand = new Random();
                int rndInt = rand.nextInt(fields.length);
                try {
                    int resID = fields[rndInt].getInt(drawableClass);
                    imageView.setImageResource(resID);
                } catch (Exception e) {
                    e.printStackTrace();
                }





                        // Show an explanation to the user *asynchronously* -- don't block
                        // this thread waiting for the user's response! After the user
                        // sees the explanation, try again to request the permission.

                    }

            @Override
            public void onStartTrackingTouch(final SeekBar seekBar) {



                ActivityCompat.requestPermissions(getActivity(),
                        new String[]{Manifest.permission.READ_CONTACTS},
                        MY_PERMISSIONS_REQUEST_READ_CONTACTS);





            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


            }
        });





        return v;


    }




    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {


        if (grantResults.length > 0
                && grantResults[0] == PackageManager.PERMISSION_GRANTED) {





            // permission was granted, yay! Do the
            // contacts-related task you need to do.

        } else {

            Toast.makeText(getActivity(),"Permission Denied",Toast.LENGTH_LONG).show();
            // permission denied, boo! Disable the
            // functionality that depends on this permission.
        }
        return;
    }


    }




