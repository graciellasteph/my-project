package com.example.myproject.ui.theme.screeens.studentlogin

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.myproject.R
import com.example.myproject.ui.theme.screeens.RoomScreen.RoomType
import com.example.myproject.ui.theme.screeens.RoomScreen.Rooms
import com.google.firebase.auth.FirebaseAuth

class StudentDashboard : AppCompatActivity() {
    companion object{
        lateinit var room: String
        lateinit var Hostel: String
        lateinit var roomType: String
        lateinit var  seater : String
        lateinit var gender:String
        var name:String? = ""
        var email:String? = ""
        var registrationNumber: String? = ""
        lateinit var bed:String

    }
    private lateinit var logout_Btn : ImageView
    private lateinit var back_Btn :ImageView
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_student_dashboard)


        mAuth = FirebaseAuth.getInstance()

        logout_Btn = findViewById(R.id.logout_btn)
        logout_Btn.setOnClickListener(){
            mAuth.signOut()
            startActivity(Intent(this,StudentLogin::class.java))
            finish()
        }
        back_Btn = findViewById(R.id.btnback)
        back_Btn = setOnClickListener(){
            onBackPressed()
            finish()
        }

        val roomTypeFragment = RoomType()

        supportFragmentManager.beginTransaction().add(androidx.fragment.R.id.fragment_container_view_tag,roomTypeFragment).commit()


    }
}