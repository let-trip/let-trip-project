package kh.edu.rupp.ite.let_trip_project.homescreen.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import kh.edu.rupp.ite.let_trip_project.R

class BannerAdapter (private val bannerList: ArrayList<Int>, private val viewPager2: ViewPager2)
    : RecyclerView.Adapter<BannerAdapter.BannerViewHolder>() {


    class BannerViewHolder (itemView:View) : RecyclerView.ViewHolder(itemView){
        val bannerView : ImageView = itemView.findViewById(R.id.viewPager)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_photo_item, parent, false)
        return BannerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return bannerList.size
    }

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
holder.bannerView.setImageResource(bannerList[position])
    if (position == bannerList.size-1) {
        viewPager2.post(runnable)
    }}

    private val runnable = Runnable{
        bannerList.addAll(bannerList)
        notifyDataSetChanged()
    }
}



