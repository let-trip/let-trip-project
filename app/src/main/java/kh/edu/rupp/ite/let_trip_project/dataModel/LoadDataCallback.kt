package kh.edu.rupp.ite.let_trip_project.dataModel

class LoadDataCallback<D : Any>(
    val data: List<D>? = arrayListOf(),
    val error: ErrorResponse? = null,
    val isSwipeToRefresh: Boolean? = false,
    val isLoadMore: Boolean? = false,
    val hasMoreData: Boolean? = false
) {}