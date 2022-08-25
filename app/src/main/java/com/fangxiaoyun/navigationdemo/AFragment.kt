package com.fangxiaoyun.navigationdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class AFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_a, container, false)
        view.findViewById<Button>(R.id.btnGoBFragment).setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.goBFragmentFromAFragment)
        }
        return view
    }
}