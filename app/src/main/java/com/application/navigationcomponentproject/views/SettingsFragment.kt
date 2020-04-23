package com.application.navigationcomponentproject.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import com.application.navigationcomponentproject.R
import com.application.navigationcomponentproject.adapters.SettingsAdapter
import com.application.navigationcomponentproject.models.CategorySettings

/**
 * A simple [Fragment] subclass.
 */
class SettingsFragment : Fragment() {

    lateinit var myView: View
    private lateinit var adapter: SettingsAdapter
    private lateinit var myListView: ListView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_settings, container, false)

        myListView = myView.findViewById(R.id.settings_list)

        adapter = SettingsAdapter(myView.context.applicationContext, R.id.settings_list, setupSettingCategories())

        myListView.adapter = adapter


        return myView
    }

   private fun setupSettingCategories(): ArrayList<CategorySettings>{
        val settingsSectionsList = ArrayList<CategorySettings>()
        settingsSectionsList.add(CategorySettings("General"))
        settingsSectionsList.add(CategorySettings("Privacy"))
        settingsSectionsList.add(CategorySettings("Preferences"))
        settingsSectionsList.add(CategorySettings("Themes"))
        settingsSectionsList.add(CategorySettings("About"))

        return setupSettingCategories()
    }

}
