package kh.edu.rupp.ite.let_trip_project.Activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.ite.let_trip_project.viewModel.DestinationViewModel
import kh.edu.rupp.ite.let_trip_project.databinding.ActivityDestinationBinding

class DestinationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDestinationBinding
    private val viewModel: DestinationViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDestinationBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        viewModel.destinationModel.observe(this, Observer { myModel ->
//            // Update UI with the data
//            binding.txtDestination.text = myModel.title;
//            // Assuming 'titleTextView' is the ID of the TextView in your layout
//        })
//
//        binding.btBack.setOnClickListener {
//            viewModel.fetchData()
//        }
    }
}