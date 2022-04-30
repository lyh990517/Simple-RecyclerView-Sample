package yunho.app.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var humanAdapter:humanAdapter
    private val recycler:RecyclerView by lazy {
        findViewById(R.id.recycler)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var humans = mutableListOf<human>()
        humans.add(human("lyh",25))
        humans.add(human("zsc",21))
        humans.add(human("kkk",29))
        humanAdapter = humanAdapter()
        recycler.adapter = humanAdapter
        recycler.layoutManager = LinearLayoutManager(this)
        humanAdapter.humans = humans

    }
}