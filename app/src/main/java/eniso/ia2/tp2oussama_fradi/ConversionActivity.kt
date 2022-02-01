package projet.android2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ConversionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversion)
        val i: Intent = getIntent()
        val montant:Float=i.getFloatExtra("montant", 100F)
        val sens=i.getStringExtra("sensdeconversion")
        val ress=findViewById<TextView>(R.id.ress)
        val lemontant=findViewById<TextView>(R.id.lemontant)
        val lesens = findViewById<TextView>(R.id.lesens)
        val convertir = findViewById<Button>(R.id.convertir)
        lemontant.text= "Le montant à convertir est $montant"
        lesens.text="Vous choisissez à convertir en $sens"
        convertir.setOnClickListener {

            if (sens == "Euro") {
                val resultat = montant / 3.2
                ress.text = "L’équivalent de $montant DT en Euro est : $resultat Euro"
            } else {
                val resultat = montant * 3.2
                ress.text = "L’équivalent de $montant Euro en DT est : $resultat DT"
            }
        }
    }
}