package supan.viewpagerexamples.ui.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import supan.viewpagerexamples.ui.component.ViewPagerItem

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun VerticalPagerScreen() {
    val pageCount = 10
    val pagerState = rememberPagerState(pageCount = { pageCount })
    VerticalPager(
        pageSize = PageSize.Fixed(300.dp),
        state = pagerState
    ) { page ->
        ViewPagerItem(page = page)
    }
}

@Preview
@Composable
private fun VerticalPagerScreenPreview() {
    VerticalPagerScreen()
}