package com.example.android_saas.fragment.main

import androidx.navigation.NavController
import androidx.navigation.ui.setupWithNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.android_saas.R
import com.example.android_saas.databinding.FlowFragmentMainBinding
import com.example.android_saas.fragment.BaseFlowFragment

class MainFlowFragment: BaseFlowFragment(R.layout.flow_fragment_main, R.id.nav_host_fragment_main) {
    private val binding by viewBinding(FlowFragmentMainBinding::bind)

    override fun setupNavigation(navController: NavController) {
        super.setupNavigation(navController)
        binding.bottomNavigation.setupWithNavController(navController)
    }
}