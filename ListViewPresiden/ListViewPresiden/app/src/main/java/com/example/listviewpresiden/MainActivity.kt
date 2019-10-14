

package com.example.listviewpresiden

import android.media.Image
import android.R.layout.simple_list_item_1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewpresiden.R.*
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


private val Nothing.getItemAtPosition: Unit
    get() {}

class MainActivity : AppCompatActivity() {
    val language = arrayOf<String>
    ("Ir.Soekarno","Soeharto","Bj.Habibie","Abdurrahman Wahid/Gusdur","Megawati Soekarno Putri","Susilo Bambang Yudhoyono"," Ir.Joko Widodo")


    p[]
    val description = arrayOf<String>(
        "Ir.Soekarno merupakan Presiden pertama RI Lahir diBlitar, 6 Juni 1901 wafat 21 Juni 1970 dimakamkan diBlitar Jatim"
        "Soeharto adalah Presiden kedua RI Lahir pada 08 Juni 1921 wafat 27 Juni 2008 menjabat Presiden RI selama 32 tahun dari 12 Maret 1967 - 21 Mei 1998"
        "Bj.Habibie Presiden ketiga RI Lahir diPare-Pare, 25 Juni 1930 masa jabatan 21 Mei 1998 – 20 Oktober 1999 wafat 11 September 2019"
        "Abdurrahman wahid/Gusdur Presiden keempat RI Lahir DiJombang 7 September 1940 wafat 30 Desember 2009"
        "Megawati Soekarno Putri Presiden kelima RI Lahir pada 23 Januari 1947 beliau meupakan anak dari Presiden RI pertama Ir.Soekarno"
        "Susilo Bambang Yudhoyono Presiden keenam RI Lahir pada 09 September 1949 beliau menjabat selama 2 Periode 2004-2009, dan 2009-2014"
        "Ir.Joko Widodo merupakan Presiden ketujuh RI Lahir 21 Juni 1961 beliau juga menjabat sebagai Presiden RI selama 2 periode 2014 - 2019, dan 2019 - 2024"

    )

    val ImageId: Array<Int>
        get() = arrayOf<Int>(
            drawable.soekarno,
            drawable.soeharto,
            drawable.habibie,
            drawable.gusdur,
            drawable.megawati,
            drawable.sby,
            drawable.jokowi

        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        val myListAdapter = MyListAdapter(this,language,description,ImageId)
        val listView
        listView.adapter = myListAdapter

        listView.setOnItemClickListener(){adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this, "Click on item at $itemAtPos its item id $itemIdAtPos", Toast.LENGTH_LONG).show()
        }
    }

    private fun MyListAdapter(mainActivity: MainActivity, language: Array<String>, description: Array<String>, imageId: Array<Int>): Any {

    }
}

private fun Nothing.getItemIdAtPosition(position: Unit) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}


