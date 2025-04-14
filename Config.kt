package com.example.forgym

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Config : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val naoSouAluno = findViewById<Button>(R.id.btn_naoAluno)
        val souAluno = findViewById<Button>(R.id.btn_aluno)


        naoSouAluno.setOnClickListener {
            val intent = Intent(this, Cadastro1::class.java)
            startActivity(intent)
        }

        souAluno.setOnClickListener(){
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }
}
