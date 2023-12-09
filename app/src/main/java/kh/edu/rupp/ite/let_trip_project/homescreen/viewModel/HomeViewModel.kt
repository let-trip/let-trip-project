package kh.edu.rupp.ite.let_trip_project.homescreen.viewModel

import dagger.hilt.android.lifecycle.HiltViewModel
import kh.edu.rupp.ite.let_trip_project.ViewModel.BaseContentLoadingViewModel
import kh.edu.rupp.ite.let_trip_project.homescreen.repository.CategoriesRepository
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: CategoriesRepository
) : BaseContentLoadingViewModel() {


    override fun onRetryClicked() {
        loadData()
    }



    fun loadData(
        isAppliedLanguageSelection: Boolean? = false,
        isSwipeToRefresh: Boolean? = false,
        isLoadMore: Boolean? = false
    ) {
        val isReloadData =
            (isAppliedLanguageSelection == true || (isLoadMore == false && isSwipeToRefresh == false))
        if (isReloadData) {
            showLoadingContentSkeleton()
        }

    }

}