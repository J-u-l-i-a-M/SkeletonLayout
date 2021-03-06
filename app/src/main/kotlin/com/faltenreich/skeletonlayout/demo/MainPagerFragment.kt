package com.faltenreich.skeletonlayout.demo

import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import com.faltenreich.skeletonlayout.Skeleton
import com.faltenreich.skeletonlayout.demo.configuration.ConfigurationListener

abstract class MainPagerFragment(
    @LayoutRes private val layoutResId: Int,
    val title: String
) : Fragment(layoutResId), ConfigurationListener {

    abstract var skeleton: Skeleton

    override fun onMaskColorChanged(value: Int) {
        skeleton.maskColor = value
    }

    override fun onMaskCornerRadiusChanged(value: Float) {
        skeleton.maskCornerRadius = value
    }

    override fun onShowShimmerChanged(value: Boolean) {
        skeleton.showShimmer = value
    }

    override fun onShimmerColorChanged(value: Int) {
        skeleton.shimmerColor = value
    }

    override fun onShimmerDurationChanged(value: Long) {
        skeleton.shimmerDurationInMillis = value
    }
}