package kh.edu.rupp.ite.let_trip_project.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.mvvmexample.databinding.ActivityMainBinding
import kh.edu.rupp.ite.let_trip_project.ViewModel.DestinationViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: DestinationViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.destinationModel.observe(this, Observer { myModel ->
            // Update UI with the data
            binding.titleTextView.text = myModel.title
            binding.descriptionTextView.text = myModel.description
        })

        binding.fetchDataButton.setOnClickListener {
            viewModel.fetchData()
        }
    }
}