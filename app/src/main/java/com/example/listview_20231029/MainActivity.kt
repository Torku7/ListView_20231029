package com.example.listview_20231029

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.listview_20231029.adapters.StudentAdapter
import com.example.listview_20231029.databinding.ActivityMainBinding
import com.example.listview_20231029.datas.StudentData

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()

    lateinit var mStdAdapter: StudentAdapter

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        val std1 = StudentData("박진우",1999, "010-1234-5678")
//        mStudentList.add(std1)

        mStudentList.add(StudentData("박진우",1999,"010-1234-5678"))
        mStudentList.add(StudentData("학생2",2000,"010-4567-8910"))
        mStudentList.add(StudentData("학생3",2005,"010-7418-5296"))
        mStudentList.add(StudentData("학생4",2010,"010-3698-5214"))
        mStudentList.add(StudentData("학생5",2020,"010-7894-5612"))


        mStdAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

        binding.studentListView.adapter = mStdAdapter

        binding.studentListView.setOnItemClickListener { adapterView, view, position, l ->

            val clickedStd = mStudentList[position]

            Toast.makeText(this, "${clickedStd.name}:${clickedStd.phoneNum}", Toast.LENGTH_SHORT).show()
        }

    }
}