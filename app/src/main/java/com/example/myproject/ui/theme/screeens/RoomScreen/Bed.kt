package com.example.myproject.ui.theme.screeens.RoomScreen

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.myproject.R
import com.example.myproject.ui.theme.screeens.studentlogin.StudentDashboard

class Bed : Fragment() {

    lateinit var viewBed: View
    lateinit var rgrp : RadioGroup
    lateinit var nextButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
        viewBed = inflater.inflate(R.layout.fragment_bed,container,false)

        rgrp = viewBed.findViewById(R.id.rgrp)

        val rb2 = viewBed.findViewById<RadioGroup>(R.id.rb2)
        val rb3 = viewBed.findViewById<RadioGroup>(R.id.rb3)
        val rb4 = viewBed.findViewById<RadioGroup>(R.id.rb4)

        when (StudentDashboard.seater){
            "1 seater" -> {
                rb2.isEnabled = false
                rb3.isEnabled = false
                rb4.isEnabled = false
            }
            "2 seater" -> {
                rb3.isEnabled = false
                rb4.isEnabled = false
            }
            "3 seater" ->{
                rb4.isEnabled = false
            }
        }
        nextButton = viewBed.findViewById(R.id.next_button)
        nextButton.setOnClickListener(){
            var selectId = rgrp.checkedRadioButtonId
            if(selectId == 1){
                Toast.makeText(requireContext(),"Please select any one!!",Toast.LENGTH_SHORT)
                    .show()
            }else{
                val rB = rgrp.findViewById<RadioButton>(selectId)
                StudentDashboard.bed = rB.text.toString()
            }
        }
        return viewBed

    }
}