package com.example.myproject.ui.theme.screeens.RoomScreen

import android.annotation.SuppressLint
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

class RoomType : Fragment() {
    lateinit var viewRoomType: View
    lateinit var rgrp: RadioGroup
    lateinit var nextButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
        var viewRoomType = inflater.inflate(R.layout.fragment_room, container, false)


        rgrp = viewRoomType.findViewById(R.id.main)
        nextButton = viewRoomType.findViewById(R.id.next_button)
        nextButton.setOnClickListener(){
            var selectId = rgrp.checkedRadioButtonId
            if (selectId == -1){
                Toast.makeText(getContext(),"please select any one",Toast.LENGTH_SHORT).show()
            }else {
                val rB = rgrp.findViewById<RadioButton>(selectId)
                var roomType = rB.text.toString()

                val bed = Bed()
                //requireActivity().supportFragmentManager.beginTransaction().replace(androidx.fragment.R.id.fragment_container_view_tag,seaterFragment).commit()
            }
        }

        return viewRoomType
    }



}