package com.example.note.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.note.R
import com.example.note.util.navigate
import kotlinx.android.synthetic.main.fragment_add_note.*


class AddNoteFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_note, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        setOnClickListener()
    }

    private fun init(){

    }

    private fun setOnClickListener(){
        btn_save_note.setOnClickListener {
            navigate(R.id.action_addNoteFragment_to_homeFragment)
        }
    }
}
