package com.example.kcalgorithm

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log

/**
 * @data on 2021/6/29 6:25 下午
 * @auther
 * @describe
 */
class AppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        //打印被创建的Activity名称
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                Log.e("ssss", activity.javaClass.name)
            }

            override fun onActivityStarted(activity: Activity) {

            }

            override fun onActivityResumed(activity: Activity) {
            }

            override fun onActivityPaused(activity: Activity) {
                Log.e("ssss", activity.localClassName.plus("onActivityPaused"))
            }

            override fun onActivityStopped(activity: Activity) {
                Log.e("ssss", activity.localClassName.plus("onActivityStopped"))
            }

            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
            }

            override fun onActivityDestroyed(activity: Activity) {
                Log.e("ssss", activity.localClassName.plus("onActivityDestroyed"))
            }

        })
    }
}