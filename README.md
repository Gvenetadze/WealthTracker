Overview
This project is a financial portfolio management application built using Single Activity Architecture in Android.  
It demonstrates navigation with ViewPager2, fragment communication, and financial calculations.

Architecture
-1 Activity: MainActivity  
-3 Fragments:
  - InputFragment → user enters income and expenses
  - AnalyticsFragment → displays calculated savings
  - ProfileFragment → shows personal information

Navigation is implemented using:
- ViewPager2
- TabLayout

Formula
K Coefficient
K is calculated using:
K = (First Name Length + Last Name Length) / Birth Day

My Calculation
- First Name: Andria → 6 letters  
- Last Name: Gvenetadze → 10 letters  
- Birth Day: 22  
K = (6 + 10) / 22 = 0.73

Final Savings Formula

Final Savings = (Income - Expenses) * K

Data Communication
Data is passed between fragments using:
- Fragment Result API (setFragmentResult)

Logic Separation
All calculations are handled in:
- WealthManager.kt

 UI & Layout
- All screens use ConstraintLayout
- Navigation via ViewPager2 + TabLayout
- Dynamic orientation:
  - Consonant → vertical scrolling
  - Vowel → horizontal scrolling

(My last name starts with G → vertical mode)

Naming Convention
All resource IDs follow required format:

ag_ze_<component_name>

Examples:
- ag_ze_et_income
- ag_ze_btn_save
- ag_ze_tv_result

Features
- Input validation using setError
- Calculation of savings
- Automatic slide to results after saving the inputs
- Fragment communication without ViewModel
- Clean code structure

How to Run
1. Open project in Android Studio  
2. Sync Gradle  
3. Run on emulator or device  
