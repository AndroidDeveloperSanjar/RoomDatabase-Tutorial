package com.example.note.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.note.R
import com.example.note.util.navigate
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        setOnClickListener()
    }

    private fun init(){

    }

    private fun setOnClickListener(){
        btn_add_note.setOnClickListener {
            navigate(R.id.action_homeFragment_to_addNoteFragment)
        }
    }
}
