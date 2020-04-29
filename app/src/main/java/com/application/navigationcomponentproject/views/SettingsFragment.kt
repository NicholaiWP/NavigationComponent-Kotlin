package com.application.navigationcomponentproject.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.navigation.Navigation
import androidx.navigation.findNavController
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
    private lateinit var settingsSection: ArrayList<CategorySettings>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        myView = inflater.inflate(R.layout.fragment_settings, container, false)

        myListView = myView.findViewById(R.id.settings_list)

        settingsSection = ArrayList()

        settingsSection.add(CategorySettings("General"))
        settingsSection.add(CategorySettings("Privacy"))
        settingsSection.add(CategorySettings("Preferences"))
        settingsSection.add(CategorySettings("About"))

        adapter = SettingsAdapter(myView.context.applicationContext, R.id.settings_list, settingsSection)

        myListView.adapter = adapter

        /*
        val msg = SettingsFragmentDirections.actionSettingsToAboutFragment(Message = "This is a message")
        Navigation.findNavController(myView).navigate(msg)
*/
        return myView
    }

}
