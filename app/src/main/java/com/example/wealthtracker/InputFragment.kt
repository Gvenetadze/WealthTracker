package com.example.wealthtracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.viewpager2.widget.ViewPager2

class InputFragment : Fragment(R.layout.fragment_input) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val incomeField = view.findViewById<EditText>(R.id.ag_ze_et_income)
        val expensesField = view.findViewById<EditText>(R.id.ag_ze_et_expenses)
        val button = view.findViewById<Button>(R.id.ag_ze_btn_save)

        button.setOnClickListener {

            val incomeText = incomeField.text.toString()
            val expensesText = expensesField.text.toString()

            if (incomeText.isEmpty()) {
                incomeField.error = "Enter income"
                return@setOnClickListener
            }

            if (expensesText.isEmpty()) {
                expensesField.error = "Enter expenses"
                return@setOnClickListener
            }

            val income = incomeText.toDouble()
            val expenses = expensesText.toDouble()

            if (income < 0 || expenses < 0) {
                incomeField.error = "Invalid value"
                return@setOnClickListener
            }

            val bundle = Bundle()
            bundle.putDouble("income", income)
            bundle.putDouble("expenses", expenses)

            incomeField.text.clear()
            expensesField.text.clear()

            parentFragmentManager.setFragmentResult("dataKey", bundle)

            requireActivity()
                .findViewById<ViewPager2>(R.id.viewPager)
                .currentItem = 1
        }
    }
}