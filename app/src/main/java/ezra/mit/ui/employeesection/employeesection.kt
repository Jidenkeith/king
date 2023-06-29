package net.simplifiedcoding.ui.employeesection

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.simplifiedcoding.R
import net.simplifiedcoding.data.Resource
import net.simplifiedcoding.navigation.ROUTE_CALENDARSCREEN
import net.simplifiedcoding.navigation.ROUTE_HOME
import net.simplifiedcoding.navigation.ROUTE_HOMEXSCREEN
import net.simplifiedcoding.navigation.ROUTE_LOGIN
import net.simplifiedcoding.navigation.ROUTE_SIGNUP
import net.simplifiedcoding.ui.auth.AuthHeader
import net.simplifiedcoding.ui.auth.AuthViewModel
import net.simplifiedcoding.ui.theme.AppTheme
import net.simplifiedcoding.ui.theme.spacing

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Signup2Screen(viewModel: AuthViewModel?, navController: NavHostController) {

    val signupFlow = viewModel?.signupFlow?.collectAsState()

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 20.dp)
            .paint(
                painterResource(id = R.drawable.hhhhh),
                contentScale = ContentScale.FillBounds
            )
    ) {
        val (refHeader, refName, refEmail, refPassword, refButtonSignup, refTextSignup, refLoader) = createRefs()
        val spacing = MaterialTheme.spacing



        Column(
            modifier = Modifier
                .fillMaxWidth(),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(text = "EMPLOYEE WALL", fontWeight = FontWeight.ExtraBold, fontSize = 50.sp, fontStyle = FontStyle.Italic, color = Color.Magenta)



            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 30.dp)
            ) {

                item {

                    LazyRow(

                    ) {

                        item {
Button(onClick = { /*TODO*/ },modifier = Modifier.fillMaxWidth()) {

    Text(text = "+ Add Employees ")

}

                            Button(onClick = { /*TODO*/ },modifier = Modifier.fillMaxWidth()) {

                                Text(text = "- Remove Employees ")

                            }


                        }}

                    Column(


                    ) {


                        Card(
                            modifier = Modifier
                                .padding(16.dp),

                            shape = RoundedCornerShape(corner = CornerSize(10.dp))

                        ) {
                            Row(
                                modifier = Modifier
                                    .padding(5.dp)
                                    .fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painterResource(id = R.drawable.ic_person),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .padding(4.dp)
                                        .height(140.dp)
                                        .width(100.dp)
                                        .clip(RoundedCornerShape(corner = CornerSize(10.dp)))
                                )
                                Column {
                                    Text(
                                        text = "Name: Keith Sile",
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                    Spacer(modifier = Modifier.height(3.dp))
                                    Text(
                                        text = "Age: 21",
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                    Spacer(modifier = Modifier.height(3.dp))
                                    Text(
                                        text = "Employee No: 210031",
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                    Spacer(modifier = Modifier.height(3.dp))
                                    Text(
                                        text = "DETAILS",
                                        modifier = Modifier.clickable {
                                            navController.navigate(ROUTE_CALENDARSCREEN) {
                                                popUpTo(ROUTE_CALENDARSCREEN) { inclusive = true }
                                            }
                                        })


                                }
                            }
                        }

                        Card(
                            modifier = Modifier
                                .padding(16.dp),

                            shape = RoundedCornerShape(corner = CornerSize(10.dp))

                        ) {
                            Row(
                                modifier = Modifier
                                    .padding(5.dp)
                                    .fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painterResource(id = R.drawable.ic_person),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .padding(4.dp)
                                        .height(140.dp)
                                        .width(100.dp)
                                        .clip(RoundedCornerShape(corner = CornerSize(10.dp)))
                                )
                                Column {
                                    Text(
                                        text = "Name: xxxxx xxxx",
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                    Spacer(modifier = Modifier.height(3.dp))
                                    Text(
                                        text = "Age: xx",
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                    Spacer(modifier = Modifier.height(3.dp))
                                    Text(
                                        text = "Employee No: xxxxx",
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                    Spacer(modifier = Modifier.height(3.dp))
                                    Button(onClick = { /*TODO*/ }) {

                                        Text(text = "DETAILS")

                                    }
                                }
                            }
                        }


                        Card(
                            modifier = Modifier
                                .padding(16.dp),

                            shape = RoundedCornerShape(corner = CornerSize(10.dp))

                        ) {
                            Row(
                                modifier = Modifier
                                    .padding(5.dp)
                                    .fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painterResource(id = R.drawable.ic_person),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .padding(4.dp)
                                        .height(140.dp)
                                        .width(100.dp)
                                        .clip(RoundedCornerShape(corner = CornerSize(10.dp)))
                                )
                                Column {
                                    Text(
                                        text = "Name: xxxxx xxxx",
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                    Spacer(modifier = Modifier.height(3.dp))
                                    Text(
                                        text = "Age: xx",
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                    Spacer(modifier = Modifier.height(3.dp))
                                    Text(
                                        text = "Employee No: xxxxx",
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                    Spacer(modifier = Modifier.height(3.dp))
                                    Button(onClick = { /*TODO*/ }) {

                                        Text(text = "DETAILS")

                                    }
                                }
                            }
                        }


                        Card(
                            modifier = Modifier
                                .padding(16.dp),

                            shape = RoundedCornerShape(corner = CornerSize(10.dp))

                        ) {
                            Row(
                                modifier = Modifier
                                    .padding(5.dp)
                                    .fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painterResource(id = R.drawable.ic_person),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .padding(4.dp)
                                        .height(140.dp)
                                        .width(100.dp)
                                        .clip(RoundedCornerShape(corner = CornerSize(10.dp)))
                                )
                                Column {
                                    Text(
                                        text = "Name: xxxxx xxxx",
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                    Spacer(modifier = Modifier.height(3.dp))
                                    Text(
                                        text = "Age: xx",
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                    Spacer(modifier = Modifier.height(3.dp))
                                    Text(
                                        text = "Employee No: xxxxx",
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                    Spacer(modifier = Modifier.height(3.dp))
                                    Button(onClick = { /*TODO*/ }) {

                                        Text(text = "DETAILS")

                                    }
                                }
                            }
                        }

                        Card(
                            modifier = Modifier
                                .padding(16.dp),

                            shape = RoundedCornerShape(corner = CornerSize(10.dp))

                        ) {
                            Row(
                                modifier = Modifier
                                    .padding(5.dp)
                                    .fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painterResource(id = R.drawable.ic_person),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .padding(4.dp)
                                        .height(140.dp)
                                        .width(100.dp)
                                        .clip(RoundedCornerShape(corner = CornerSize(10.dp)))
                                )
                                Column {
                                    Text(
                                        text = "Name: xxxxx xxxx",
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                    Spacer(modifier = Modifier.height(3.dp))
                                    Text(
                                        text = "Age: xx",
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                    Spacer(modifier = Modifier.height(3.dp))
                                    Text(
                                        text = "Employee No: xxxxx",
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                    Spacer(modifier = Modifier.height(3.dp))
                                    Button(onClick = { /*TODO*/ }) {

                                        Text(text = "DETAILS")

                                    }
                                }
                            }
                        }


                        Card(
                            modifier = Modifier
                                .padding(16.dp),

                            shape = RoundedCornerShape(corner = CornerSize(10.dp))

                        ) {
                            Row(
                                modifier = Modifier
                                    .padding(5.dp)
                                    .fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painterResource(id = R.drawable.ic_person),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .padding(4.dp)
                                        .height(140.dp)
                                        .width(100.dp)
                                        .clip(RoundedCornerShape(corner = CornerSize(10.dp)))
                                )
                                Column {
                                    Text(
                                        text = "Name: xxxxx xxxx",
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                    Spacer(modifier = Modifier.height(3.dp))
                                    Text(
                                        text = "Age: xx",
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                    Spacer(modifier = Modifier.height(3.dp))
                                    Text(
                                        text = "Employee No: xxxxx",
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                    Spacer(modifier = Modifier.height(3.dp))
                                    Button(onClick = { /*TODO*/ }) {

                                        Text(text = "DETAILS")

                                    }





                                }
                            }
                        }


                    }
                }
            }
        }
    }
}


@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun SignupScreenPreviewLight() {
    AppTheme {
        Signup2Screen(null, rememberNavController(),)
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun SignupScreenPreviewDark() {
    AppTheme {
        Signup2Screen(null, rememberNavController(),)
    }
}
