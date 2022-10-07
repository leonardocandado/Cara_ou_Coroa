package cursoandroid.kotlin.com.caraoucoroa

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoJogar = findViewById<ImageView>(R.id.botao_jogar)
        botaoJogar.setOnClickListener{
            val intent = Intent(applicationContext, ResultadoActivity::class.java)
            val numero = Random.nextInt(2)
            intent.putExtra("num", numero)
            startActivity(intent)

        }



    }
}
