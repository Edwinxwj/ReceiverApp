package sg.edu.rp.c346.receiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


/**
 * Created by 15056215 on 10/8/2017.
 */

//Step 1 Create a Broadcast Receiver Class
public class BatteryReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast my_toast = Toast.makeText(context, "Low Batter", Toast.LENGTH_LONG);
        my_toast.show();

    }
}
