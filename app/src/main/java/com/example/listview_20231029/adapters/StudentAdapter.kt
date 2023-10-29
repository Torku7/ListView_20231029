package com.example.listview_20231029.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.listview_20231029.R
import com.example.listview_20231029.datas.StudentData

class StudentAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StudentData>
    ) : ArrayAdapter<StudentData>(mContext,resId,mList) {

        val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if(tempRow == null){
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }

        val row = tempRow!!

        val stdData = mList[position]

        val txtname = row.findViewById<TextView>(R.id.txtName)
        val txtPhoneNum = row.findViewById<TextView>(R.id.txtPhoneNum)
        val txtAge = row.findViewById<TextView>(R.id.txtAge)

        txtname.text = stdData.name
        txtPhoneNum.text = stdData.phoneNum

        txtAge.text = "(${stdData.getKoreanAge(2023)})세"

        return row

    }

}