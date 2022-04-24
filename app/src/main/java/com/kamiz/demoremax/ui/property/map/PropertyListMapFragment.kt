package com.kamiz.demoremax.ui.property.map

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kamiz.demoremax.databinding.FragmentPropertyListMapBinding

class PropertyListMapFragment : Fragment() {

    private lateinit var binding: FragmentPropertyListMapBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPropertyListMapBinding.inflate(inflater, container, false)
        return binding.root
    }
}