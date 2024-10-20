package com.example.portfolio_app

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MoreAboutMe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_more_about_me)

        var actionToolbar : Toolbar = findViewById(R.id.myToolbar)

        setSupportActionBar(actionToolbar)

        tilesClickListener()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.basic_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.about_me ->{
                Toast.makeText(this,"Settings Clicked", Toast.LENGTH_LONG).show()
                true
            }
            R.id.settings->{
                Toast.makeText(this,"Settings Clicked", Toast.LENGTH_LONG).show()
                true
            }
            else->super.onOptionsItemSelected(item)
        }
    }

    public fun tilesClickListener(){

        var myworld = findViewById<ImageView>(R.id.myWorldImg)
        var mystack = findViewById<ImageView>(R.id.myStackImg)
        var mygoal = findViewById<ImageView>(R.id.myGoalsImg)
        var mysocial = findViewById<ImageView>(R.id.mySocialsImg)

        myworld.setOnClickListener{
            viewMyWorld()
        }

        mystack.setOnClickListener{
            viewTechStack()
        }

        mygoal.setOnClickListener{
            viewGoals()
        }

        mysocial.setOnClickListener{
            viewSocials()
        }

    }

    public fun viewMyWorld(){ startActivity(Intent(this, MyWorld::class.java)) }
    public fun viewTechStack(){startActivity(Intent(this, MyTechStacks::class.java))}
    public fun viewGoals(){startActivity(Intent(this, MyGoals::class.java))}
    public fun viewSocials(){startActivity(Intent(this, MySocials::class.java))}
}