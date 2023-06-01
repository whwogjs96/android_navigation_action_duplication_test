package com.example.navigationtest

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.navigationtest.databinding.FragmentCBinding

class FragmentC: DataBindingBaseFragment<FragmentCBinding>(R.layout.fragment_c) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextActivityButton.setOnClickListener {
            val intent = Intent(context, ActivityB::class.java)
            startActivity(intent)
        }
        binding.backButton.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}