package com.application.navigationcomponentproject.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.application.navigationcomponentproject.R
import com.application.navigationcomponentproject.models.CategorySettings
import com.application.navigationcomponentproject.views.SettingsFragmentDirections

class SettingsAdapter(private val context:Context, resourceId: Int, private val listObject: ArrayList<CategorySettings>): BaseAdapter() {

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        var myView = view
        if(view == null){
            myView = LayoutInflater.from(context).inflate(R.layout.settings_list_row, parent, false)

        }
        val category = this.getItem(position) as CategorySettings

        val txt = myView!!.findViewById<TextView>(R.id.category_text) as TextView
        val txtHeadline = myView.findViewById<TextView>(R.id.settings_item_section)

       for (items in listObject){
           txtHeadline.setText("Your category description")
       }

        txt.setText(category.getCategory())

        myView.setOnClickListener(View.OnClickListener {

            when {
                category.getCategory() == "About" -> {
                    myView.findNavController().navigate(R.id.aboutFragment)
                }
                category.getCategory() == "General" -> {
                    myView.findNavController().navigate(R.id.generalFragment)
                }
                category.getCategory() == "Privacy" -> { val exampleToast =  Toast.makeText(myView.context.applicationContext, "Not yet implemented", Toast.LENGTH_SHORT)
                    exampleToast.show()
                }
                category.getCategory() == "Preferences" -> { val exampleToast =  Toast.makeText(myView.context.applicationContext, "Not yet implemented", Toast.LENGTH_SHORT)
                    exampleToast.show()
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