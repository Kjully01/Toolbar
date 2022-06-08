package br.com.toolbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import br.com.toolbar.databinding.ActivitySplashBinding
import com.bumptech.glide.Glide

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@SplashActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)

        showGif(binding.root)
    }

    private fun showGif(view: View) {
        val imageView: ImageView = binding.imgSplash
        Glide.with(this).load(R.drawable.programming_computer).into(imageView)
    }
}