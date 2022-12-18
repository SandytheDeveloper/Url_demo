package com.example.url_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.net.URL

class MainActivity : AppCompatActivity() {

    lateinit var edttxt:EditText
    lateinit var btn:Button
    lateinit var txtview:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edttxt=findViewById(R.id.edttxt)
        btn=findViewById(R.id.btn)
        txtview=findViewById(R.id.txtview)

        btn.setOnClickListener {

            var s=edttxt.text.toString()
            var url=URL(s)

            var ans="URL:"+url.host
            ans+="\nPORT:"+url.port
            ans+="\nPROTO:"+url.protocol
            ans+="\nFILE:"+url.file
            ans+="\nREF:"+url.ref
            ans+="\nURL:"+url.toExternalForm()

            txtview.setText(ans)

        }


    }
}