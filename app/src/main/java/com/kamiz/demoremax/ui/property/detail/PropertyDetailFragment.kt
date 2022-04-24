package com.kamiz.demoremax.ui.property.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kamiz.demoremax.databinding.FragmentPropertyDetailBinding

class PropertyDetailFragment : Fragment() {

    private lateinit var binding: FragmentPropertyDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPropertyDetailBinding.inflate(inflater, container, false)
        return binding.root
    }
}