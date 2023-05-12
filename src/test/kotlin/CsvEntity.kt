import com.github.hqqich.util.csv.EasyCsv
import com.github.hqqich.util.csv.entity.CsvProperty

data class CsvEntity(
    @CsvProperty("a")
    val code: String,
    @CsvProperty("b")
    val speed: String,
    @CsvProperty("c")
    val power: String,
    @CsvProperty("d")
    val powerReal: String,
)


fun main() {

    val fileName = "C:\\Users\\admin\\Desktop\\副本MY风机功率曲线插值后.csv"
    val all = EasyCsv().readAll(
        fileName,
        CsvEntity::class.java
    )
    println("======================")
    for (owidEntity in all.subList(0, 20)) {
        println(owidEntity)
    }

}