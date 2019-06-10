package com.koalatea.sedaily.koin.module

import com.koalatea.sedaily.feature.auth.AuthViewModel
import com.koalatea.sedaily.feature.commentList.CommentsViewModel
import com.koalatea.sedaily.feature.episodedetail.EpisodeDetailViewModel
import com.koalatea.sedaily.feature.episodes.EpisodesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {

    viewModel { EpisodesViewModel(get(), get()) }

    viewModel { CommentsViewModel(get()) }

    viewModel { EpisodeDetailViewModel(get(), get(), get()) }

    viewModel { AuthViewModel(get(), get()) }

}