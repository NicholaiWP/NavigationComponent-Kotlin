package com.application.navigationcomponentproject.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.navigation.findNavController
import com.application.navigationcomponentproject.R
import com.application.navigationcomponentproject.models.CategorySettings

class SettingsAdapter(private val context:Context, resourceId: Int, private val listObject: ArrayList<CategorySettings>): BaseAdapter() {

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        var myView = view
        if(view == null){
            myView = LayoutInflater.from(context).inflate(R.layout.settings_list_row, parent, false)

        }
        val category = this.getItem(position) as CategorySettings

        val txt = myView!!.findViewById<TextView>(R.id.category_text) as TextView
        txt.setText(category.getCategory())

        myView.setOnClickListener(View.OnClickListener {

            when {
                category.getCategory() == "About" -> {
                    myView.findNavController().navigate(R.id.aboutFragment)
                }
                category.getCategory() == "General" -> {
                    myView.findNavController().navigate(R.id.generalFragment)
                }
                category.getCategory() == "Privacy" -> {

                }
                category.getCategory() == "Preferences" -> {

                }
                category.getCategory() == "Themes" -> {

                }
            }
        })
            //Toast.makeText(context.applicationContext, category.getCategory(), Toast.LENGTH_SHORT).show()}

        return myView!!
    }

    override fun getItem(position: Int): Any {
        return listObject[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return listObject.size
    }

}