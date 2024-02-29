package br.senai.sp.jandira.calculadoraimc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.calculadoraimc.ui.theme.CalculadoraIMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraIMCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    CalculadoraIMC()
                }
            }
        }
    }
}

@Composable
fun CalculadoraIMC() {
    Column (
        modifier = Modifier
            .fillMaxSize()
    ){
        Column (
            modifier = Modifier
                .background(color = Color(0xffEA1450))
                .fillMaxWidth()
                .height(200.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ){
            Image(
                painter = painterResource(id = R.drawable.imc),
                contentDescription = "imagem de um medidor de imc"
            )
            Text(
                text = "Calculadora IMC",
                fontSize = 24.sp,
                color = Color.White,
                fontWeight = FontWeight.W900
            )
        }
        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ){
            Box (
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .background(
                        color = Color(0xffF9F6F6),
                        shape = RoundedCornerShape(8.dp)
                    )
            ) {
                Column(
                    modifier = Modifier.padding(16.dp, 26.dp)
                ) {

                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ){
                        Text(
                            text = "Seus dados",
                            fontSize = 24.sp,
                            color = Color(0xffEA1450),
                            fontWeight = FontWeight.W900

                        )
                    }

                    Text(
                        text = "Seu peso:",
                        color = Color(0xffEA1450)
                    )
                    OutlinedTextField(
                        value = "",
                        shape = RoundedCornerShape(10.dp),
                        onValueChange = { },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp),
                        placeholder = {
                            Text(text = "Seu peso em Kg")
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = Color(0xffEA1450),
                            unfocusedTextColor = Color.LightGray,
                            focusedBorderColor = Color(0xffEA1450)
                        )
                    )

                    Text(
                        text = "Sua altura:",
                        color = Color(0xffEA1450),
                        modifier = Modifier.padding(top = 30.dp)
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = { },
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp),
                        placeholder = {
                            Text(text = "Sua altura em cm")
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = Color(0xffEA1450),
                            unfocusedTextColor = Color.LightGray,
                            focusedBorderColor = Color(0xffEA1450)
                        )

                    )

                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Button(onClick = { /*TODO*/ },
                            modifier = Modifier
                                .width(310.dp)
                                .padding(top = 35.dp)
                                .background(
                                    color = Color(0xffEA1450),
                                    shape = RoundedCornerShape(10.dp)
                                ),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffEA1450))

                        ) {
                            Text(
                                text = "CALCULAR",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.W900,
                                letterSpacing = 2.sp
                            )
                        }
                    }
                }
            }
            Row (
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .width(266.dp)
                    .height(97.dp)
                    .background(
                        color = Color(0xff329F6B),
                        shape = RoundedCornerShape(10.dp)
                    )
            ){
                Column (
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Resultado",
                        fontSize = 14.sp,
                        color = Color.White,
                        fontWeight = FontWeight.W400
                    )
                    Text(
                        text = "Peso Ideal",
                        fontSize = 20.sp,
                        color = Color.White,
                        fontWeight = FontWeight.W400
                    )
                }
                Text(
                    text = "21.3",
                    fontSize = 36.sp,
                    color = Color.White,
                    fontWeight = FontWeight.W700

                )
            }
        }

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CalculadoraIMCPreview() {
    CalculadoraIMCTheme {
        CalculadoraIMC()
    }
}