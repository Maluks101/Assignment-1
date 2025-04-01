package vcmsa.ci.myassignment2


import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //Declared all the features and inputs that will be used.

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val edtText = findViewById<EditText>(R.id.edtText)
        val txtResults = findViewById<TextView>(R.id.txtResults)

        btn1.setOnClickListener {

            val text = edtText.text.toString()
            // Using If statements to provide different results.

            if (text == "Morning") {
                val s = "Eggs and Beans with Toast"
                txtResults.text = s

            } else if (text == "Mid-Morning") {
                val s = "Dried Fruit"
                txtResults.text = s

            } else if (text == "Afternoon") {
                val s = "Chicken Sandwich"
                txtResults.text = s

            } else if (text == "Afternoon-Snack") {
                val s = "Noodles"
                txtResults.text = s

            } else if (text == "Dinner") {
                val s = "Beef stew"
                txtResults.text = s

            } else if (text == "Dessert") {
                val s = "Cake"
                txtResults.text = s
            } else txtResults.text = "Invalid Input"

            btn2.setOnClickListener {
                //Button acts as a reset for the program.

                edtText.text.clear()
                txtResults.text = ""
            }





            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }
}