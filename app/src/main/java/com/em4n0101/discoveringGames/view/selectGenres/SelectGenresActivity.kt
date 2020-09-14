package com.em4n0101.discoveringGames.view.selectGenres

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.em4n0101.discoveringGames.R
import kotlinx.android.synthetic.main.activity_select_genres.*

class SelectGenresActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_genres)

        collapsingToolbar.title = "Genres"
        collapsingToolbar.setExpandedTitleColor(ContextCompat.getColor(this, android.R.color.transparent))
        setSupportActionBar(toolbar)
    }
}