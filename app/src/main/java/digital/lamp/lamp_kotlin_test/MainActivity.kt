package digital.lamp.lamp_kotlin_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import digital.lamp.lamp_core.models.SensorEvent
import digital.lamp.sensor_core.Accelerometer
import digital.lamp.sensor_core.Lamp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}