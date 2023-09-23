package com.example.composenewsapp.presentation.onboarding.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.composenewsapp.R
import com.example.composenewsapp.core.utils.Dimens.CommonSpacer
import com.example.composenewsapp.core.utils.Dimens.MediumPadding
import com.example.composenewsapp.presentation.onboarding.Page
import com.example.composenewsapp.presentation.onboarding.pages
import com.example.composenewsapp.ui.theme.ComposeNewsAppTheme

@Composable
fun OnBoardingPage(
    modifier: Modifier = Modifier,
    page: Page,
) {
    Column(modifier = modifier) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = 0.6f),
            painter = painterResource(
                id = page.image
            ),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(CommonSpacer))
        Text(text = page.title,
            modifier = Modifier.padding(
                horizontal = MediumPadding
            ),
            style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
            color = colorResource(id = R.color.display_small)
        )

        Text(text = page.description,
            modifier = Modifier.padding(
                horizontal = MediumPadding
            ),
            style = MaterialTheme.typography.bodyMedium,
            color = colorResource(id = R.color.text_medium)
        )
    }
}

@Preview(showBackground = true)
@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun PreviewOnBoarding() {
    ComposeNewsAppTheme {
        OnBoardingPage(modifier = Modifier, page = pages[2])
    }

}

