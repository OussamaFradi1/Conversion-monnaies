package projet.android2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class CurrencyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_currency)
        val valeur = findViewById<EditText>(R.id.valeur)
        val toeuro = findViewById<Button>(R.id.toeuro)
        val todinar=findViewById<Button>(R.id.todinar)
        toeuro.setOnClickListener {V: View? ->
            if (valeur.text.toString().isBlank()){
                Toast.makeText(V?.context,"Entrer un montant!", Toast.LENGTH_SHORT).show()}
            else {
                val i= Intent(this,ConversionActivity::class.java)
                i.putExtra("montant",valeur.text.toString().toFloat())
                i.putExtra("sensdeconversion","Euro")
                startActivity(i)
            }
        }
        todinar.setOnClickListener {V: View? ->
            if (valeur.text.toString().isBlank()){
                Toast.makeText(V?.context,"Entrer un montant!", Toast.LENGTH_SHORT).show()}
            else {
                val i= Intent(this,ConversionActivity::class.java)
                i.putExtra("montant",valeur.text.toString().toFloat())
                i.putExtra("sensdeconversion","Dinar")
                startActivity(i)

            }
        }
    }
}