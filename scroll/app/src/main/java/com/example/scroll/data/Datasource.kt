package com.example.scroll.data

import com.example.scroll.R
import com.example.scroll.model.Affirmation

class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.img1),
            Affirmation(R.string.affirmation2, R.drawable.img2),
            Affirmation(R.string.affirmation3, R.drawable.img3),
            Affirmation(R.string.affirmation4, R.drawable.img4),
            Affirmation(R.string.affirmation5, R.drawable.img5),
            Affirmation(R.string.affirmation6, R.drawable.img6))
    }
}