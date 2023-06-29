package net.simplifiedcoding.ui.messages

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.simplifiedcoding.R
import net.simplifiedcoding.data.Resource
import net.simplifiedcoding.navigation.ROUTE_HOME
import net.simplifiedcoding.navigation.ROUTE_LOGIN
import net.simplifiedcoding.navigation.ROUTE_SIGNUP
import net.simplifiedcoding.ui.auth.AuthHeader
import net.simplifiedcoding.ui.auth.AuthViewModel
import net.simplifiedcoding.ui.theme.AppTheme
import net.simplifiedcoding.ui.theme.spacing
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterStart
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import net.simplifiedcoding.ui.theme.md_theme_dark_onBackground


@Composable
@Preview
fun MessagesScreen() {
                    Column(modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background)) {
                        Spacer(Modifier.windowInsetsTopHeight(WindowInsets.statusBars))
                        DrawerHeader()
                        DividerItem()
                        DrawerItemHeader("Chats")
                        ChatItem("composers", true) { md_theme_dark_onBackground }
                        ChatItem("droidcon-nyc", false) { md_theme_dark_onBackground }
                        DividerItem(modifier = Modifier.padding(horizontal = 28.dp))
                        DrawerItemHeader("Recent Profiles")

                        }
                    }


        @Composable
        private fun DrawerHeader() {
            Row(modifier = Modifier.padding(16.dp), verticalAlignment = CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.vec),
                    contentDescription = null,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
        @Composable
        private fun DrawerItemHeader(text: String) {
            Box(
                modifier = Modifier
                    .heightIn(min = 52.dp)
                    .padding(horizontal = 28.dp),
                contentAlignment = CenterStart
            ) {
                Text(
                    text,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }

        @Composable
        private fun ChatItem(text: String, selected: Boolean, onChatClicked: () -> Unit) {
            val background = if (selected) {
                Modifier.background(MaterialTheme.colorScheme.primaryContainer)
            } else {
                Modifier
            }
            Row(
                modifier = Modifier
                    .height(56.dp)
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp)
                    .clip(CircleShape)
                    .then(background)
                    .clickable(onClick = onChatClicked),
                verticalAlignment = CenterVertically
            ) {
                val iconTint = if (selected) {
                    MaterialTheme.colorScheme.primary
                } else {
                    MaterialTheme.colorScheme.onSurfaceVariant
                }
                Icon(
                    painter = painterResource(id = R.drawable.vec),
                    tint = iconTint,
                    modifier = Modifier.padding(start = 16.dp, top = 16.dp, bottom = 16.dp),
                    contentDescription = null
                )
                Text(
                    text,
                    style = MaterialTheme.typography.bodyMedium,
                    color = if (selected) {
                        MaterialTheme.colorScheme.primary
                    } else {
                        MaterialTheme.colorScheme.onSurface
                    },
                    modifier = Modifier.padding(start = 12.dp)
                )
            }
        }

        @Composable
        private fun ProfileItem(text: String, @DrawableRes profilePic: Int?, onProfileClicked: () -> Unit) {
            Row(
                modifier = Modifier
                    .height(56.dp)
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp)
                    .clip(CircleShape)
                    .clickable(onClick = onProfileClicked),
                verticalAlignment = CenterVertically
            ) {
                val paddingSizeModifier = Modifier
                    .padding(start = 16.dp, top = 16.dp, bottom = 16.dp)
                    .size(24.dp)
                if (profilePic != null) {
                    Image(
                        painter = painterResource(id = profilePic),
                        modifier = paddingSizeModifier.then(Modifier.clip(CircleShape)),
                        contentScale = ContentScale.Crop,
                        contentDescription = null
                    )
                } else {
                    Spacer(modifier = paddingSizeModifier)
                }
                Text(
                    text,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.padding(start = 12.dp)
                )
            }
        }

        @Composable
        fun DividerItem(modifier: Modifier = Modifier) {
            Divider(
                modifier = modifier,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f)
            )
        }


@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun MessagesScreenPreviewLight() {
//    AppTheme {
//        MessagesScreen(null, rememberNavController())
//    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun MessagesScreenPreviewDark() {
//    AppTheme {
//        MessagesScreen(null, rememberNavController())
//    }
}
