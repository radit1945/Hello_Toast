package lat.pam.desertrecycleview

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sample)

        val btnBackModul2: Button = findViewById(R.id.btnBackModul2)
        btnBackModul2.setOnClickListener {
            finish()
        }

        val recyclerView: RecyclerView = findViewById(R.id.sampleRecyclerView)
        val itemList = List(20) { i -> "Item ${i + 1}" }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = WordAdapter(itemList)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.sample_main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
