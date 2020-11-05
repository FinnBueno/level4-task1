package com.peakfinn.madlevel4task1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.product.view.*

class ShoppingListAdapter(private val products: List<Product>) : RecyclerView.Adapter<ShoppingListAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun databind(product: Product) {
            itemView.tvName.text = product.productName
            itemView.tvQuantity.text = product.productQuantity.toString()
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingListAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.product, parent, false))
    }

    override fun getItemCount() = products.size
    override fun onBindViewHolder(holder: ShoppingListAdapter.ViewHolder, position: Int) { holder.databind(products[position]) }
}