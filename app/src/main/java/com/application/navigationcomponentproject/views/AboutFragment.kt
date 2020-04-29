package com.application.navigationcomponentproject.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.application.navigationcomponentproject.R

/**
 * A simple [Fragment] subclass.
 */
class AboutFragment : Fragment() {

    lateinit var myView: View
    lateinit var msgView:TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_about, container, false)

        msgView = myView.findViewById(R.id.message_view_id)

        return myView
    }

    /*
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            val safeArgs = AboutFragmentArgs.fromBundle(it)
            val msg = safeArgs.Message
            msgView.setText(msg)
        }



    }

     */

}
