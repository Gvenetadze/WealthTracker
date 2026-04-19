package com.example.wealthtracker

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class AnalyticsFragment : Fragment(R.layout.fragment_analytics) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val resultText = view.findViewById<TextView>(R.id.ag_ze_tv_result)

        parentFragmentManager.setFragmentResultListener("dataKey", this) { _, bundle ->

            val income = bundle.getDouble("income")
            val expenses = bundle.getDouble("expenses")

            val manager = WealthManager()

            val k = 0.73

            val result = manager.calculateSavings(income, expenses, k)

            resultText.text = getString(R.string.final_savings, result)
        }
    }
}