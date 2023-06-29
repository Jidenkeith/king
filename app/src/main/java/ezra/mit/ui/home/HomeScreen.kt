package net.mit.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import ezra.mit.R
import net.simplifiedcoding.ui.auth.AuthViewModel
import net.simplifiedcoding.ui.theme.spacing


@Composable
fun HomeScreen(viewModel: AuthViewModel?, navController: NavHostController) {
    val spacing = MaterialTheme.spacing






    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .paint(
                painterResource(id = R.drawable.bkkkk),
                contentScale = ContentScale.FillBounds
            )
        ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        

        Text(
            text = stringResource(id = R.string.welcome_back),
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.onBackground
        )


        LazyColumn(

            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {

                Image(
                    painter = painterResource(R.drawable.baseline_calendar_month_24),
                    contentDescription = "Circle Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(115.dp)
                )

                Text(
                    text = "Access Daily Attendance",
                    fontSize = 30.sp,
                    color = androidx.compose.ui.graphics.Color.Black

                )
                Text(
                    text = "Click Here",
                    modifier = Modifier.clickable {
                        navController.navigate(ROUTE_SIGNUP2SCREEN) {
                            popUpTo(ROUTE_SIGNUP2SCREEN) { inclusive = true }
                        }
                    })



                Image(
                    painter = painterResource(R.drawable.baseline_upload_file_24),
                    contentDescription = "Circle Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(115.dp)
                )



                Text(
                    text = "Complaints & Announcements",

                    fontSize = 27.sp,
                    color = androidx.compose.ui.graphics.Color.Black
                )
                Text(
                    text = "Click Here",
                    modifier = Modifier.clickable {
                        navController.navigate(ROUTE_HOMEXSCREEN) {
                            popUpTo(ROUTE_HOMEXSCREEN) { inclusive = true }
                        }
                    })

                Image(
                    painter = painterResource(R.drawable.baseline_assignment_returned_24),
                    contentDescription = "Circle Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(115.dp)
                )

                Text(
                    text = "Employer Views",
                    fontSize = 30.sp,
                    color = androidx.compose.ui.graphics.Color.Black

                )

                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = "CLICK HERE")
                }

                Image(
                    painter = painterResource(R.drawable.baseline_star_rate_24),
                    contentDescription = "Circle Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(115.dp)
                )

                Text(
                    text = "Company Reviews",
                    fontSize = 30.sp,
                    color = androidx.compose.ui.graphics.Color.Black

                )

                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = "CLICK HERE")
                }

                Button(
                    onClick = {
                        viewModel?.logout()
                        navController.navigate(ROUTE_LOGIN) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    },
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = spacing.extraLarge)
                ) {
                    Text(text = stringResource(id = R.string.logout))
                }


            }
        }
    }

                }

