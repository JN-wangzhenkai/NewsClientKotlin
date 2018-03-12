package com.jim.newsclient.module.home

import android.support.v4.app.Fragment
import android.util.Log
import com.jim.newsclient.module.news.NewsFragment


class MainAcivityPresenter(private val view:MainActivityView){

    fun fetchFragments(num:Int){
        var fragments=ArrayList<Fragment>()
        var i=0
        while (i<num){
            fragments.add(NewsFragment.newInstance(i))
            i++
        }
        Log.d("MainAcivityPresenter","frgments size: "+fragments.size)
        view?.onFragmentsFetched(fragments)
    }


}