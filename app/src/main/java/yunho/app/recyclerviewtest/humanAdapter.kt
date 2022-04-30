package yunho.app.recyclerviewtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class humanAdapter: RecyclerView.Adapter<humanAdapter.ViewHolder>() {
    var humans = mutableListOf<human>()
    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bind(human: human){
            itemView.findViewById<TextView>(R.id.name).text = human.name
            itemView.findViewById<TextView>(R.id.age).text = human.age.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater.inflate(R.layout.item_human,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(humans[position])
    }

    override fun getItemCount(): Int {
        return humans.size
    }
}