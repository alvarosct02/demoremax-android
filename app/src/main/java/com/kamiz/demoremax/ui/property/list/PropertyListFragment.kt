package com.kamiz.demoremax.ui.property.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kamiz.demoremax.R
import com.kamiz.demoremax.databinding.FragmentPropertyListBinding

class PropertyListFragment : Fragment() {

    private lateinit var binding: FragmentPropertyListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPropertyListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
    }

    private fun setupViews() {
        binding.btDetail.setOnClickListener {
            findNavController().navigate(R.id.action_propertyListFragment_to_propertyDetailFragment)
        }
        binding.btMap.setOnClickListener {
            findNavController().navigate(R.id.action_propertyListFragment_to_propertyListMapFragment)
        }
    }
}