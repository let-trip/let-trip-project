package kh.edu.rupp.ite.let_trip_project.Activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import kh.edu.rupp.ite.let_trip_project.ViewModel.DestinationViewModel
import kh.edu.rupp.ite.let_trip_project.databinding.ActivityMainBinding

class DestinationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: DestinationViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.destinationModel.observe(this, Observer { myModel ->
            // Update UI with the data
            binding.toolbar.title = myModel.title;
            // Assuming 'titleTextView' is the ID of the TextView in your layout
        })

//        binding.fetchDataButton.setOnClickListener {
//            viewModel.fetchData()
//        }
    }
}