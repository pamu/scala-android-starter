package com.rxbytes.scalaandroid.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.rxbytes.scalaandroid.{TypedFindView, TR}
import macroid.Contexts

/**
  * Created by pnagarjuna on 20/01/16.
  */
class MainActivity
  extends AppCompatActivity
    with Contexts[AppCompatActivity]
    with TypedFindView {

  val LOG_TAG = classOf[MainActivity].getSimpleName

  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    setContentView(TR.layout.layout_main_activity.id)
    val toolbar = findView(TR.toolbar)
    setSupportActionBar(toolbar)
  }

}
