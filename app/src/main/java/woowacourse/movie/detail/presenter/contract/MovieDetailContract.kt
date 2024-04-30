package woowacourse.movie.detail.presenter.contract

import woowacourse.movie.model.Movie
import woowacourse.movie.model.MovieCount
import woowacourse.movie.model.MovieDate
import java.time.LocalDate
import java.time.LocalTime

interface MovieDetailContract {
    interface View {
        fun updateCountView(count: Int)

        fun setUpDateSpinner(movieDate: MovieDate)

        fun setUpTimeSpinner(screeningTimes: List<LocalTime>)

        fun displayMovieDetail(
            movieData: Movie?,
            movieCount: MovieCount,
        )

        fun navigateToSeatSelectionView(
            id: Long,
            date: String,
            time: String,
            count: Int,
        )
    }

    interface Presenter {
        fun loadMovieDetail(
            movieId: Long,
            theaterPosition: Int,
        )

        fun plusReservationCount()

        fun minusReservationCount()

        fun reserveMovie(
            id: Long,
            date: String,
            time: String,
        )

        fun updateReservationCount(count: Int)

        fun updateTimeSpinnerPosition(position: Int)
    }
}
