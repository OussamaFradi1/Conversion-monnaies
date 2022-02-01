package projet.android2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class HomeActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val conmonnaie = findViewById<Button>(R.id.conmonnaie)
        val contemperatue=findViewById<Button>(R.id.contemperature)
        conmonnaie.setOnClickListener(this)
        contemperatue.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.conmonnaie -> { val i= Intent(this,CurrencyActivity::class.java)
                startActivity(i)}
            R.id.contemperature ->{ val i= Intent(this,TemperatureActivity::class.java)
                startActivity(i)

            }
        }
    }

}