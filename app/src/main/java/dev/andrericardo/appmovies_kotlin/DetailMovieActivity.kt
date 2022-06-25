package dev.andrericardo.appmovies_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.andrericardo.appmovies_kotlin.databinding.ActivityDetailMovieBinding

class DetailMovieActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailMovieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}