package com.example.mackenzie.wifipictureframe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.my_toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.universal_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        item ?: throw NullPointerException()
         if(item.itemId == R.id.start_slideshow){
            // Launch Settings Intent
            val intent = Intent(this, ViewImageActivity::class.java)
            startActivity(intent)
        } else if(item.itemId == R.id.settings){
            val intent = Intent(this, SettingsPageActivity::class.java)
            startActivity(intent)
        }
        return true
    }
}