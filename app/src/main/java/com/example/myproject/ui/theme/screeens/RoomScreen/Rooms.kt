package com.example.myproject.ui.theme.screeens.RoomScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnCreateContextMenuListener
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.myproject.R
import com.example.myproject.navigation.ROUTE_VIEW_ROOMS
import com.example.myproject.ui.theme.screeens.studentlogin.StudentDashboard

class Rooms : Fragment() {
    lateinit var viewRooms: View
    lateinit var rgrp: RadioGroup
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
        viewRooms = inflater.inflate(R.layout.fragment_room,container,false)


        rgrp = viewRooms.findViewById(R.id.main)
        nextButton = viewRooms.findViewById(R.id.next_button)
        nextButton.setOnClickListener(){
            var selectId = rgrp.checkedRadioButtonId
            if (selectId == -1){
                Toast.makeText(getContext(),"please select any one",Toast.LENGTH_SHORT).show()
            }else {
                val rB = rgrp.findViewById<RadioButton>(selectId)
                StudentDashboard.room = rB.text.toString()

                val bed = Bed()
             //   requireActivity().supportFragmentManager.beginTransaction().replace(androidx.fragment.R.id.fragment_container_view_tag,seaterFragment).commit()
            }
        }

        return viewRooms
    }




}