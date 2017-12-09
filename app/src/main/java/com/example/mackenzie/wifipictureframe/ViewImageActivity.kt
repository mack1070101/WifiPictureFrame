package com.example.mackenzie.wifipictureframe

import android.app.PendingIntent.getActivity
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.media.Image
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.os.storage.StorageManager
import android.support.annotation.UiThread
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.image_view.*
import java.io.File
import java.net.URI
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
import com.squareup.picasso.Picasso
import kotlin.concurrent.thread


class ViewImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.image_view)
        val decorView = window.decorView

        val uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        decorView.systemUiVisibility = uiOptions


        val directory = File(Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES), "TestImages")

        val files = directory.listFiles()
        val picasso = Picasso.with(this)

        Toast.makeText(this, "1", Toast.LENGTH_LONG).show()
        picasso.load(files[0]).into(imageView)

        Thread.sleep(1000)

        Toast.makeText(this, "2", Toast.LENGTH_LONG).show()
        picasso.load(files[1]).into(imageView)
        }
    }

