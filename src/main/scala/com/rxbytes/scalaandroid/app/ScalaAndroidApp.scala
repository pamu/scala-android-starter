package com.rxbytes.scalaandroid.app

import android.app.Application
import android.util.Log

class ScalaAndroidApp extends Application {

  private val LOG_TAG = classOf[ScalaAndroidApp].getSimpleName

  override def onCreate(): Unit = {
    Log.d(LOG_TAG, "ScalaAndroidApp")
  }

}