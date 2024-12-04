package com.example.a30daysofwellness

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.a30daysofwellness.ui.theme.WellnessTheme
import com.example.a30daysofwellness.ui.theme.WellnessApp


data class WellnessDay(
    val day: Int,
    val title: String,
    val description: String,
    val imageRes: Int
)

// Daftar 30 hari wellness dengan gambar
val wellnessTasks = listOf(
    WellnessDay(
        1,
        "Olahraga Ringan 15 Menit",
        "Mulailah hari dengan peregangan dan gerakan ringan untuk meningkatkan sirkulasi darah.",
        R.drawable.peregangan
    ),
    WellnessDay(
        2,
        "Meditasi Pagi",
        "Luangkan waktu 10 menit untuk meditasi dan menenangkan pikiran sebelum memulai hari.",
        R.drawable.meditasi
    ),
    WellnessDay(
        3,
        "Minum Air Putih",
        "Pastikan minum 8 gelas air putih hari ini untuk hidrasi optimal.",
        R.drawable.minum
    ),
    WellnessDay(
        4,
        "Tidur 8 Jam",
        "Tidur cukup adalah kunci kesehatan. Targetkan 8 jam tidur malam ini.",
        R.drawable.tidur
    ),
    WellnessDay(
        5,
        "Makan Sayuran Hijau",
        "Tambahkan porsi sayuran hijau dalam menu makan hari ini.",
        R.drawable.makan
    ),
    WellnessDay(
        6,
        "Jalan Kaki 30 Menit",
        "Luangkan waktu untuk berjalan kaki di taman atau lingkungan sekitar.",
        R.drawable.olahraga
    ),
    WellnessDay(
        7,
        "Journaling",
        "Tuliskan perasaan dan pengalaman hari ini di jurnal.",
        R.drawable.membaca
    ),
    WellnessDay(
        8,
        "Yoga Ringan",
        "Lakukan pose yoga dasar untuk meningkatkan fleksibilitas.",
        R.drawable.yoga
    ),
    WellnessDay(
        9,
        "Digital Detox",
        "Kurangi penggunaan gadget selama 2 jam hari ini.",
        R.drawable.hp
    ),
    WellnessDay(
        10,
        "Sarapan Sehat",
        "Mulai hari dengan sarapan bergizi seperti oatmeal dan buah.",
        R.drawable.sarapan
    ),
    WellnessDay(
        11,
        "Stretching Sore",
        "Lakukan peregangan di sore hari untuk meredakan ketegangan.",
        R.drawable.strecing
    ),
    WellnessDay(
        12,
        "Membaca Buku",
        "Baca buku favorit selama 30 menit sebelum tidur.",
        R.drawable.buku
    ),
    WellnessDay(
        13,
        "Makan Buah",
        "Konsumsi minimal 2 porsi buah-buahan hari ini.",
        R.drawable.buah
    ),
    WellnessDay(
        14,
        "Relaksasi Musik",
        "Dengarkan musik yang menenangkan selama 15 menit.",
        R.drawable.musik
    ),
    WellnessDay(
        15,
        "Planking",
        "Lakukan planking selama 1 menit untuk kekuatan inti.",
        R.drawable.planking
    ),
    WellnessDay(
        16,
        "Menulis Gratitude",
        "Tuliskan 3 hal yang disyukuri hari ini.",
        R.drawable.menulis
    ),
    WellnessDay(
        17,
        "Latihan Pernapasan",
        "Praktikkan teknik pernapasan dalam selama 5 menit.",
        R.drawable.pernapasan
    ),
    WellnessDay(
        18,
        "Makan Tanpa Gadget",
        "Nikmati makan siang tanpa menggunakan ponsel.",
        R.drawable.makan_tanpa_hp
    ),
    WellnessDay(
        19,
        "Squat Challenge",
        "Lakukan 20 squats untuk kesehatan kaki.",
        R.drawable.squat
    ),
    WellnessDay(
        20,
        "Tidur Siang",
        "Ambil waktu 20 menit untuk power nap.",
        R.drawable.tidur_siang
    ),
    WellnessDay(
        21,
        "Minum Teh Hijau",
        "Ganti kopi dengan teh hijau hari ini.",
        R.drawable.teh_hijau
    ),
    WellnessDay(
        22,
        "Declutter Ruangan",
        "Rapikan dan bersihkan ruang kerja atau kamar.",
        R.drawable.ruangan
    ),
    WellnessDay(
        23,
        "Push-up Challenge",
        "Lakukan 10 push-up untuk kekuatan lengan.",
        R.drawable.push_up
    ),
    WellnessDay(
        24,
        "Memasak Sehat",
        "Masak makanan sehat untuk makan malam.",
        R.drawable.memasak
    ),
    WellnessDay(
        25,
        "Perawatan Wajah",
        "Lakukan rutinitas perawatan wajah lengkap.",
        R.drawable.perawatan
    ),
    WellnessDay(
        26,
        "Mendengar Podcast",
        "Dengarkan podcast motivasi atau edukasi.",
        R.drawable.podcas
    ),
    WellnessDay(
        27,
        "Bersepeda",
        "Bersepeda santai selama 30 menit.",
        R.drawable.bersepeda
    ),
    WellnessDay(
        28,
        "Makan Protein",
        "Tambahkan porsi protein dalam menu hari ini.",
        R.drawable.makanan_protein
    ),
    WellnessDay(
        29,
        "Bersosialisasi",
        "Luangkan waktu berbincang dengan teman atau keluarga.",
        R.drawable.bersosialisasi
    ),
    WellnessDay(
        30,
        "Evaluasi Diri",
        "Refleksikan perubahan selama 30 hari wellness journey.",
        R.drawable.evaluasi_diri
    )
)

@Composable
fun WellnessTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = lightColorScheme(
            primary = MaterialTheme.colorScheme.primary,
            primaryContainer = MaterialTheme.colorScheme.primaryContainer,
            secondary = MaterialTheme.colorScheme.secondary
        ),
        content = content
    )
}

// MainActivity.kt
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WellnessTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WellnessApp()
                }
            }
        }
    }
}