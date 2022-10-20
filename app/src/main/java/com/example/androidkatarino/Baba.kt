package com.example.androidkatarino

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


val data = listOf(
  Receipt("Supplier-1", "$10.24", "Oct. 20, 2022"),
  Receipt("Supplier-2", "$100.24", "Oct. 19, 2022"),
  Receipt("Edna's Edibles", "$310.24", "Oct. 10, 2022"),
  Receipt("Edna's Edibles", "$8.40", "Oct. 10, 2022"),
  Receipt("Shop Now", "$3.44", "Oct. 9, 2022"),
  Receipt("Supplier-5", "$101.34", "Oct. 8, 2022"),
  Receipt("Supplier-6", "$230.00", "Oct. 8, 2022"),
  Receipt("Supplier-2", "$20.24", "Sep. 22, 2022"),
  Receipt("Shop Now", "$3.31", "Sep. 21, 2022"),
  Receipt("Edna's Edibles", "$3.31", "Sep. 21, 2022"),
  Receipt("Supplier-1", "$3.31", "Sep. 21, 2022"),
  Receipt("Otto's", "$3.31", "Sep. 21, 2022"),
  Receipt("Edna's Edibles", "$3.31", "Sep. 21, 2022"),
  Receipt("Shop Now", "$3.31", "Sep. 21, 2022"),
  Receipt("Supplier-1", "$3.31", "Sep. 21, 2022"),
  Receipt("Shop Now", "$3.31", "Sep. 21, 2022"),
)

data class Receipt(val supplier: String, val total: String, val date: String)

class ReceiptsAdapter(private val items: List<Receipt>) : RecyclerView.Adapter<ReceiptsAdapter.ReceiptViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReceiptViewHolder {
    val view = LayoutInflater.from(parent.context)
      .inflate(R.layout.item_receipt, parent, false)

    return ReceiptViewHolder(view)
  }

  override fun onBindViewHolder(holder: ReceiptViewHolder, position: Int) {
    with (items[position]) {
      holder.total.text = total
      holder.supplier.text =supplier
      holder.date.text = date
    }
  }

  override fun getItemCount(): Int {
    return items.size
  }

  class ReceiptViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val total: TextView = this.itemView.findViewById(R.id.total)
    val supplier: TextView = this.itemView.findViewById(R.id.supplier)
    val date: TextView = this.itemView.findViewById(R.id.date)
  }
}
