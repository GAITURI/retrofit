package com.example.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.MenuItem
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.retrofit.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView
import java.util.zip.Inflater


class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawer: DrawerLayout
    private lateinit var toolbar: androidx.appcompat.widget.Toolbar
    private lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)
        drawer = findViewById(R.id.drawer_layout)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        navigationView = findViewById(R.id.nav_drawer)
        navigationView.setNavigationItemSelectedListener(this)
        //create the hamburger icon
        val toggle: ActionBarDrawerToggle = ActionBarDrawerToggle(
            this,
            drawer,
            toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawer.addDrawerListener(toggle)
        toggle.syncState()


//check if fragment is
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container_view_tag, FragmentA()).commit()
            navigationView.setCheckedItem(R.id.fragA)

            //OVERRIDE FUN ON NAVIGATION ITEM SELECTED LISTENER
//FRAGMENT SWITCHING

        }
    }
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when (item.itemId) {
                    R.id.FirstItem -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fragment_container_view_tag, FragmentA()).commit()
                    }
                    R.id.SecondItem -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fragment_container_view_tag, FragmentB()).commit()
                    }

                }
                return true
            }

            override fun onBackPressed(){
                if (drawer.isDrawerOpen(GravityCompat.START)) {
                    drawer.closeDrawer(GravityCompat.START)
                } else {
                    super.onBackPressed()
                }
            }

        }







