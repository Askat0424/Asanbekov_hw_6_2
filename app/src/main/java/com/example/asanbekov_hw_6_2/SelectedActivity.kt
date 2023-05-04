
package com.example.asanbekov_hw_6_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asanbekov_hw_6_2.databinding.ActivitySelectedBinding


class SelectedActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySelectedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectedBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}