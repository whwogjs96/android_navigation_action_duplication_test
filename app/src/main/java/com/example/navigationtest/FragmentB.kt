package com.example.navigationtest

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationtest.databinding.FragmentBBinding

class FragmentB: DataBindingBaseFragment<FragmentBBinding>(R.layout.fragment_b) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.backButton.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.action_move)
        }
    }
}