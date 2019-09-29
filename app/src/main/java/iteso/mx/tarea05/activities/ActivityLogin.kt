package iteso.mx.tarea05.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.startActivity
import android.widget.Button
import iteso.mx.tarea05.R

class ActivityLogin : AppCompatActivity() {
    /* TODO Declare EditText and Button variables */
    private lateinit var mLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        mLogin = findViewById(R.id.activity_login_btn_login)
        mLogin.setOnClickListener {
            startActivity<ActivityTutorial>()
        }
        /* TODO Authenticate User with Parse */
    }
}
