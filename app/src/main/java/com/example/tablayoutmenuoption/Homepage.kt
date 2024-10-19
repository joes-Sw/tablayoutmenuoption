package com.example.tablayoutmenuoption

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tablayoutmenuoption.databinding.ActivityHomepageBinding

class Homepage : AppCompatActivity() {
    private lateinit var binding: ActivityHomepageBinding

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_option, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_home -> {
                val tobebek = Intent(this@Homepage, MainActivity::class.java).apply {
                }
                startActivity(tobebek)
                Toast.makeText(this, "logout", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(Register.EXTRA_USERNAME)
        val username2 = intent.getStringExtra(Login.EXTRA_USERNAME)

        with(binding) {
            txtUser.text = "$username !"
            btn1.setOnClickListener {
                Toast.makeText(this@Homepage, "sedih", Toast.LENGTH_SHORT).show()
                true
            }
            btn2.setOnClickListener {
                Toast.makeText(this@Homepage, "senang", Toast.LENGTH_SHORT).show()
            }
        }

    }
}