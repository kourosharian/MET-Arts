package abolfazli.mahdi.metarts.arts

import abolfazli.mahdi.metarts.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import timber.log.Timber

class ArtsAdapter: ListAdapter<Int, ArtsAdapter.ArtsViewHolder>(
    object : DiffUtil.ItemCallback<Int>() {
        override fun areItemsTheSame(oldItem: Int, newItem: Int): Boolean {
            return oldItem == newItem
        }
        override fun areContentsTheSame(oldItem: Int, newItem: Int): Boolean {
            return oldItem == newItem
        }
    }
) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(android.R.layout.simple_list_item_1
                , parent, false)
        return ArtsViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArtsViewHolder, position: Int) {
        val id = getItem(position)
        holder.bind(id)
    }

    class ArtsViewHolder(itemView: View) : ViewHolder(itemView) {

        fun bind(id: Int) {
            Timber.e(id.toString())
            (itemView as TextView).text = id.toString()

        }
    }
}