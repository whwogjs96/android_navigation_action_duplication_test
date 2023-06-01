package com.example.navigationtest

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.navigationtest.databinding.FragmentABinding

class FragmentA : DataBindingBaseFragment<FragmentABinding>(R.layout.fragment_a) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.action_next)
        }
    }
}