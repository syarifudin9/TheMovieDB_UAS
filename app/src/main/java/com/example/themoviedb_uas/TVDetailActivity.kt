package com.example.themoviedb_uas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.themoviedb_uas.models.TV
import kotlinx.android.synthetic.main.activity_tvdetail.*

class TVDetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_TvS = "extra_tvs"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tvdetail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        image_item_photo.clipToOutline = true

        val detailTvs = intent.getParcelableExtra<TV>(TVDetailActivity.EXTRA_TvS)

        if (detailTvs != null){
            val IMAGE_BASE = "https://image.tmdb.org/t/p/w500/"
            Glide.with(this).load(IMAGE_BASE + detailTvs.poster).into(image_item_photo)
            television_item_name.text = detailTvs.title
            televisio_item_description.text = detailTvs.overview

        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}