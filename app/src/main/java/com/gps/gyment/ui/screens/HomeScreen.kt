package com.gps.gyment.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gps.gyment.R
import com.gps.gyment.data.models.Exercise
import com.gps.gyment.ui.components.ExerciseCard
import com.gps.gyment.ui.components.MuscleFilter
import com.gps.gyment.ui.theme.GymentTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    val exercises = listOf(
        Exercise(
            id = 1,
            name = "Flexão de Braço",
            repetitions = 15,
            sets = 3,
            imageUrl = "https://assets.clevelandclinic.org/transform/26568096-7fcc-4713-898d-ca1ed6c84895/exerciseHowOften-944015592-770x533-1_jpg",
            description = "Exercício para trabalhar os músculos do peito, tríceps e ombros."
        ),
        Exercise(
            id = 2,
            name = "Corrida",
            repetitions = 3,
            sets = 15,
            imageUrl = "https://assets.clevelandclinic.org/transform/26568096-7fcc-4713-898d-ca1ed6c84895/exerciseHowOften-944015592-770x533-1_jpg",
            description = "Exercício cardiovascular que melhora a resistência e queima calorias."
        ),
        Exercise(
            id = 3,
            name = "Alongamento",
            repetitions = 5,
            sets = 23,
            imageUrl = "https://assets.clevelandclinic.org/transform/26568096-7fcc-4713-898d-ca1ed6c84895/exerciseHowOften-944015592-770x533-1_jpg",
            description = "Exercício de flexibilidade para alongar os músculos isquiotibiais."
        )
    )

    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier
                    //.height(140.dp)
                    .padding(top = 32.dp),
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxHeight()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.profile),
                            contentDescription = "Profile Picture",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(64.dp)
                                .clip(CircleShape)
                                .border(1.dp, MaterialTheme.colorScheme.primary, CircleShape)
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Column {
                            Text(
                                text = "Olá,",
                                style = MaterialTheme.typography.bodyMedium,
                            )
                            Text(
                                text = "Paulo Sérgio",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                    }
                },
                actions = {
                    Box(
                        modifier = Modifier.fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        IconButton(onClick = { }) {
                            Icon(
                                imageVector = Icons.Default.Notifications,
                                contentDescription = "Botão de notificações",
                            )
                        }
                    }
                },
            )

        },
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            MuscleFilter()
            Column(Modifier.padding(16.dp)) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Exercícios",
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.Bold,
                    )
                    Text(text = "3")

                }

                exercises.forEach { exercise ->
                    ExerciseCard(exercise = exercise) {}
                    Spacer(modifier = Modifier.height(12.dp))
                }
            }
        }
    }

}

@Preview
@Composable
fun HomeScreenPreview() {
    GymentTheme {
        HomeScreen()
    }
}