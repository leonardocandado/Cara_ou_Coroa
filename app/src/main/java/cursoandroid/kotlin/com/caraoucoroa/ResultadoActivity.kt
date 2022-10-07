package cursoandroid.kotlin.com.caraoucoroa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val imageResulted = findViewById<ImageView>(R.id.imageView_resultado)

        if ((intent.extras?.getInt("num")) == 0) {
            imageResulted.setImageResource(R.drawable.moeda_cara)
        } else {
            imageResulted.setImageResource(R.drawable.moeda_coroa)
        }

        val buttonVolta = findViewById<ImageView>(R.id.imageView_Voltar)

        buttonVolta.setOnClickListener { 
            finish()
        }

    }
}