package com.example.android_saas.fragment.auth.singup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.android_saas.R
import com.example.android_saas.databinding.FragmentSignupBinding
import com.example.android_saas.extention.navigateSafely

class SignupFragment : Fragment(R.layout.fragment_signup) {
    private val binding by viewBinding(FragmentSignupBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
    }

    private fun initViews() {
        binding.tvSignin.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}