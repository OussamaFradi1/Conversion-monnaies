package projet.android2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlin.math.round

class TemperatureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temperature)
        val valeurtemp=findViewById<EditText>(R.id.valeurtemp)
        val arrondir=findViewById<CheckBox>(R.id.arrondir)
        val rg=findViewById<RadioGroup>(R.id.rg)
        val tofahrenheit=findViewById<RadioButton>(R.id.tofahrenheit)
        val tocelsius=findViewById<RadioButton>(R.id.tocelsius)
        val res=findViewById<TextView>(R.id.res)
        rg.setOnCheckedChangeListener { group, checkedId ->
        when(checkedId) {
            R.id.tofahrenheit ->{
            var temp=((9.toDouble()/5)*valeurtemp.text.toString().toFloat())+32
                if (arrondir.isChecked){
                    var arrondi:Double = String.format("%.0f", temp).toDouble()
                    temp=arrondi
                }
            res.text="$temp"
        }
        R.id.tocelsius -> {
            var temp=(5.toDouble()/9)*(valeurtemp.text.toString().toFloat()-32)
            if (arrondir.isChecked){
                var arrondi:Double = String.format("%.0f", temp).toDouble()
                temp=arrondi
            }
            res.text="$temp"
        }}}
        arrondir.setOnClickListener{
            if (arrondir.isChecked){
            var temp=res.text.toString().toDouble()
            val arrondi:Double = String.format("%.0f", temp).toDouble()
            res.text="$arrondi"}
            else {
                if (tofahrenheit.isChecked){
                    var temp=((9.toDouble()/5)*valeurtemp.text.toString().toFloat())+32
                    res.text="$temp"
                }
                else {
                    var temp=(5.toDouble()/9)*(valeurtemp.text.toString().toFloat()-32)
                    res.text="$temp"
                }
            }
            }


    }
}