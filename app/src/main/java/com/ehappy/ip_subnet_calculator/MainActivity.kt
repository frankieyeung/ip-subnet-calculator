package com.ehappy.ip_subnet_calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ehappy.ip_subnet_calculator.ui.theme.IpsubnetcalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IpsubnetcalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    IpSubnetApp()
                }

            }
        }
    }
}


@Composable
fun IpSubnetApp() {
    Column(
        modifier = Modifier
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = stringResource(id = R.string.ip_subnet_calculator),
            fontSize = 24.sp
        )
        Spacer(modifier = Modifier.height(24.dp))
        EditIpField()
        EditMaskField()
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = {}) {
            Text(text = stringResource(id = R.string.calculate),
                fontSize = 24.sp
            )
        }
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = stringResource(id = R.string.usable_ip_host_range),
            fontSize = 24.sp
        )
        Spacer(modifier = Modifier.height(24.dp))
        Row (

        ) {
            Text(
                text = stringResource(id = R.string.start_ip)
            )
            StartIp()
        }
        Row (

        ) {
            Text(
                text = stringResource(id = R.string.end_ip)
            )
            EndIp()
        }





    }
}
@Composable
fun EditIpField(){
    TextField(
        value = "",
        onValueChange = {},
        label = { Text(stringResource(id = R.string.enter_ip))},
        modifier = Modifier.fillMaxWidth(),
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}

@Composable
fun EditMaskField(){
    TextField(
        value = "",
        onValueChange = {},
        label = { Text(stringResource(id = R.string.enter_mask))},
        modifier = Modifier.fillMaxWidth(),
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}

@Composable
fun StartIp(){
    Text("")
}

@Composable
fun EndIp(){
    Text("")
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    IpsubnetcalculatorTheme {
        IpSubnetApp()
    }
}




//private fun calculateSubnet(ip: String, mask: String) {
//    val ipArray = ip.split(".").map { it.toInt() }
//    val maskArray = mask.split(".").map { it.toInt() }
//    val startIP = IntArray(4)
//    val endIP = IntArray(4)
//    for (i in 0..3) {
//        startIP[i] = ipArray[i] and maskArray[i] //bitwise AND operation
//        if (maskArray[i] == 255) {
//            endIP[i] = startIP[i]
//        }
//        else {
//            if (i == 3) {
//                endIP[i] = startIP[i] + 255 - maskArray[i] - 1
//            }
//            else {
//                endIP[i] = startIP[i] + 255 - maskArray[i]
//            }
//        }
//    }
//    startIP[3] += 1
//    println(startIP.toString().replace("[","").
//    replace(", ",".").replace("]", ""))
//}

