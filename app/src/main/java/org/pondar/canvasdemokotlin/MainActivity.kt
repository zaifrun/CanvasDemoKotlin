package org.pondar.canvasdemokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.pondar.canvasdemokotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //This is for viewbinding
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.moveButton.setOnClickListener {
            binding.gameView.moveRight(10) }
    }
}
