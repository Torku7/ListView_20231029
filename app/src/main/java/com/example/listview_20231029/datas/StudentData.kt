package com.example.listview_20231029.datas

import android.util.Log

class StudentData(val name: String,val birthYear:Int,val phoneNum: String) {

    constructor(name: String, birthYear: Int): this(name, birthYear,"폰번 모름")

    fun getKoreanAge(year : Int) : Int{
        return year - this.birthYear +1
    }

    fun getSimplePhoneNum(){
        Log.d("학생데이터",this.phoneNum.replace("-",""))
    }
}