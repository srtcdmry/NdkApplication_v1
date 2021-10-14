package com.info.ndkapplication_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.info.ndkapplication_v1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'ndkapplication_v1' library on application startup.
    static {
        System.loadLibrary("ndkapplication_v1");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView strNdk = binding.stringNdk;
        strNdk.setText(stringNdk());
    }

    /**
     * A native method that is implemented by the 'ndkapplication_v1' native library,
     * which is packaged with this application.
     */
    public native String stringNdk();
}
